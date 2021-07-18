package com.example.registraionform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickregister(View view) {

        EditText efirstname=findViewById(R.id.editTextfirstname);
        EditText elastname=findViewById(R.id.editTextlastname);
        EditText eemail=findViewById(R.id.editTextEmailAddress);

        TextView tfirstname=findViewById(R.id.textViewfirst);
        TextView tlastname=findViewById(R.id.textviewlast);
        TextView temail=findViewById(R.id.textViewemail);

        tfirstname.setText("Your first name is "+efirstname.getText().toString());
        tlastname.setText("Your last name is "+elastname.getText().toString());
        temail.setText("Your email id is "+eemail.getText().toString());
    }
}