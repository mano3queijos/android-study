package com.example.uibasics;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    protected void onHelloClick(View view){

        TextView textWellcomido  = findViewById(R.id.textWelcome);
        textWellcomido.setText("seja wellcomido");

    }


}