package com.example.exer3textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tV;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);
        x = 0;

    }

    public void click(View view) {
        tV.setTextSize(40);
        tV.setTextColor(Color.BLUE);
        x++;
        tV.setText("This is a click number:" + x);
        if (x == 6) {
            tV.setText("Enough to click. Go to new start!");
            x = 0;


        }
    }
}