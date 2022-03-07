package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick(View view)
    {
        TextView txtFirstName = findViewById(R.id.textFirstName);
        TextView txtLastName = findViewById(R.id.textLastName);
        TextView txtEmail = findViewById(R.id.textEmail);

        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editEmail = findViewById(R.id.editTextEmail);

        txtFirstName.setText(editTextFirstName.getText().toString());
        txtLastName.setText(editTextLastName.getText().toString());
        txtEmail.setText(editEmail.getText().toString());
    }
}