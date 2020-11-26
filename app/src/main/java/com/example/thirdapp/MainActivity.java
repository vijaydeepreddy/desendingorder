package com.example.thirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtfirstword ;
    EditText txtsecondword ;
    TextView display;[]
    Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtfirstword  =findViewById(R.id.Fisrtword);
        txtsecondword  =findViewById(R.id.Secondword);
        display = findViewById(R.id.desendingorder);
        btnDisplay= findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1= txtfirstword.getText().toString();
                String input2= txtsecondword.getText().toString();
                char ch[]=input1.toCharArray();
                int i =ch.length;
                char ch1[]=input2.toCharArray();
                int j =ch1.length;
                if (i>=j) {
                    display.setText(new String(input1+"\n"+input2));
                }
                else {
                    display.setText(new String(input2+"\n"+input1));
                }
            }
        });
    }
}