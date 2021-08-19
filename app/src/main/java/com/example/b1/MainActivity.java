package com.example.b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String [] city = {"Hà Nội","TP. Hồ Chí Minh","Đà Nẵng","Hải Phòng","Thanh Hóa",
                "Ninh Bình"};
      listView1=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.activity_list_item,city);
        //ArrayAdapte<String>MainActivity.this, android.R.layout.activity_list_item,city);
        listView1.setAdapter(adapter1);
    }
}