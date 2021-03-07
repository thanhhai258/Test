package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

EditText edt1;
EditText edt2;
EditText edt3;
Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        String a = edt1.getText().toString();
        String b = edt2.getText().toString();
        String c = edt3.getText().toString();

    }
}
