package com.example.myapplic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonadd,buttonsub,buttonmul,buttondiv;
    EditText editTextnumber1,editTextnumber2;
    TextView textview;
    int num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonadd=findViewById(R.id.buttonadd);
        buttonsub=findViewById(R.id.buttonsub);
        buttonmul=findViewById(R.id.buttonmul);
        buttondiv=findViewById(R.id.buttondiv);
        editTextnumber1=findViewById(R.id.number1);
        editTextnumber2=findViewById(R.id.number2);
        textview=findViewById(R.id.asnwer);


        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
    }


    public int getIntFromEditText (EditText editText) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        }else
        return Integer.parseInt(editText.getText().toString());
    }






    @Override
    public void onClick(View view) {
        num1=getIntFromEditText(editTextnumber1);
        num2=getIntFromEditText(editTextnumber2);

        switch (view.getId()){
            case R.id.buttonadd:
                textview.setText("Answer= "+(num1+num2));
                break;

            case R.id.buttonsub:
                textview.setText("Answer= "+(num1-num2));
                break;

            case R.id.buttonmul:
                textview.setText("Answer= "+(num1*num2));
                break;

            case R.id.buttondiv:
                textview.setText("Answer= "+((float)num1/(float)num2));
                break;
        }

    }
}