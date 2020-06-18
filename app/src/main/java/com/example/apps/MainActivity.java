package com.example.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button navigasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().add(R.id.container, new About()).commit();
    }

    public void tampilFragmentAbout(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new About()).commit();
    }
}