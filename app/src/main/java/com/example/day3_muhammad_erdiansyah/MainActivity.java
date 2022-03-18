package com.example.day3_muhammad_erdiansyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickhospital(View view) {
        //image hospital on click
        Intent i = new Intent(this,hospital.class);
        startActivity(i);
    }
}