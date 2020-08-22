package com.example.need;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements  View.OnClickListener {
EditText nom;
    EditText emailUp;
    EditText passUp;
    Button SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nom=(EditText) findViewById(R.id.nom);
        emailUp=(EditText) findViewById(R.id.EmailSignUp);
        passUp=(EditText) findViewById(R.id.PassSignUp);
        SignUp=(Button) findViewById(R.id.SignUp);
        SignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.SignUp: break;
        }
    }
}
