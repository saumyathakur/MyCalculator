package com.example.saumya.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    declaration
     */
    EditText editTextFrist, editTextSec;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//creates the memory
        setContentView(R.layout.activity_main);//Draws the UI


        //  initialising using

        editTextFrist = (EditText) findViewById(R.id.edit_text_first_no);
        editTextSec = (EditText) findViewById(R.id.edit_text_sec_no);
        textView = (TextView) findViewById(R.id.textView);

    }


    public void calNumber(View view) {


        String FristNoString = editTextFrist.getText().toString();
        String SecNoString = editTextSec.getText().toString();
            /*
            convert to integers
             */
        int num1 = Integer.parseInt(FristNoString);
        int num2 = Integer.parseInt(SecNoString);

        switch (view.getId()) {
            case R.id.button:
                int sum = num1 + num2;
                textView.setText("" + sum);
                break;
            case R.id.button_s:
                int sub = num1 - num2;
                textView.setText("" + sub);
                break;

            case R.id.button_m:
                int multi = num1 * num2;
                textView.setText("" + multi);
                break;
            case R.id.button_d:
                float div = (float) num1 / (float)num2;
                textView.setText("" + div);
                break;


        }


    }

}
