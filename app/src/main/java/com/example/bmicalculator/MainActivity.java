package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText W,H;
    Button cal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 EditText editTextW= findViewById(R.id.W);
 EditText editTextH= findViewById(R.id.H);
 Button cal = findViewById(R.id.cal);
 TextView textView = findViewById(R.id.out);


 cal.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {

         float H= Float.parseFloat(String.valueOf(editTextH.getText()))/100;
         float W = Float.parseFloat(String.valueOf(editTextW.getText()));
         float bmi = W /(H*H);
         textView.setText(String.valueOf(bmi));
     }
 });



    }

}