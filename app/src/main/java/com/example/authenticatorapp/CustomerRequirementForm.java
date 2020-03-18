package com.example.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CustomerRequirementForm extends AppCompatActivity {
    private ImageButton Cartbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_requirement_form);

        Cartbutton = (ImageButton) findViewById(R.id.img);
        Cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCart();
            }
        });

    }

    public void openCart(){


        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    };
}
