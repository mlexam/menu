package com.example.menu;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)

    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menu_id = item.getItemId();
        switch (menu_id) {
            case R.id.item1: {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                break;
            }
            case R.id.item2: {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
                break;
            }
            default: {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
            }
        }
        return true;
    }



    }
