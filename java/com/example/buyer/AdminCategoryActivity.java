package com.example.buyer;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AdminCategoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        ImageView tShirts = findViewById(R.id.t_shirt);
        ImageView jerseyShirts = findViewById(R.id.jersey_shirt);
        ImageView dresses = findViewById(R.id.dresses);
        ImageView sweaters = findViewById(R.id.sweaters);

        ImageView garden = findViewById(R.id.garden);
        ImageView books = findViewById(R.id.books);
        ImageView beauty = findViewById(R.id.beauty);
        ImageView baby_stuff = findViewById(R.id.baby_stuff);

        ImageView accessories = findViewById(R.id.accessories);
        ImageView gadgets = findViewById(R.id.gadgets);
        ImageView motors = findViewById(R.id.motors);
        ImageView houses = findViewById(R.id.houses);


        tShirts.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);

            }
        });

        jerseyShirts.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Jersey Shirts");
                startActivity(intent);

            }
        });

        dresses.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Dresses");
                startActivity(intent);

            }
        });

        sweaters.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sweaters");
                startActivity(intent);

            }
        });

        garden.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Garden");
                startActivity(intent);

            }
        });

        books.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Books");
                startActivity(intent);

            }
        });

        beauty.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Beauty");
                startActivity(intent);

            }
        });

        baby_stuff.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Baby stuff");
                startActivity(intent);

            }
        });

        accessories.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Accessories");
                startActivity(intent);

            }
        });

        gadgets.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Gadgets");
                startActivity(intent);

            }
        });

        motors.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Motors");
                startActivity(intent);


            }
        });

        houses.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Houses");
                startActivity(intent);


            }
        });

    }
}