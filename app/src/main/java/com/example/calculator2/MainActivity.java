package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public class New_Class
    {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ψάχνει το αντικείμενο btnCalc
        Button btnCalc = findViewById(R.id.btnCalc);
        //Του ορίζει όταν γίνει κλικ:
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //Να εκτελεί την συνάρτηση onCalculateClick
                onCalculateClick();
    }
        private void onCalculateClick() {
            EditText etNumber1 = findViewById(R.id.etNumber1);
            double number1;
            try{
                number1 = Double.parseDouble(etNumber1.getText().toString());
            }catch (Exception e){
                number1 = 0.0;
            }
            EditText etNumber2 = findViewById(R.id.etNumber2);
            double number2;
            try{
                number2 = Double.parseDouble(etNumber2.getText().toString());
            }catch (Exception e){
                number2 = 0.0;
            }
            RadioGroup rgOperations = findViewById(R.id.rgOperations);
            TextView tvResult = findViewById(R.id.tvResult);
            int checkedRadioButtonId = rgOperations.getCheckedRadioButtonId();
            if (checkedRadioButtonId == R.id.rbPlus) {
                tvResult.setText(String.valueOf(number1 + number2));
            } else if (checkedRadioButtonId == R.id.rbMinus) {
                tvResult.setText(String.valueOf(number1 - number2));
            } else if (checkedRadioButtonId == R.id.rbMulti) {
                tvResult.setText(String.valueOf(number1 * number2));
            } else if (checkedRadioButtonId == R.id.rbDiv) {
                if (number2 != 0.0)
                    tvResult.setText(String.valueOf(number1 / number2));
                else
                    tvResult.setText("Can't Divide With 0");
            } else {
                tvResult.setText("Operation Not Selected");
            }



        }
    });}}
