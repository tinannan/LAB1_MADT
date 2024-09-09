package com.example.lab1madt;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvChangeText;
    Button btnChangeText;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.tvChangeText = findViewById(R.id.tvChangeText);
        this.btnChangeText = findViewById(R.id.button1);
        this.btnChangeText.setOnClickListener(view ->
                tvChangeText.setText("You have clicked the button"));

    }



//    @SuppressLint("SetTextI18n")
//    public void onBtnChangeTextClick(View view) {
//        TextView tvChangeText = findViewById(R.id.tvChangeText);
//        tvChangeText.setText("A small piece of code in most general-purpose programming languages, this program is used to illustrate a language's basic syntax.");
//        tvChangeText.setGravity(Gravity.CENTER);
//    }
//
    public void onBtnChangeTextColourClick(View view) {
        TextView tvChangeText = findViewById(R.id.tvChangeText);
        tvChangeText.setTextColor(Color.parseColor("#A020F0"));
    }
}