package com.moch.Pertemuan6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.moch.Pertemuan6.fragment.ListviewFragment;
import com.example.abas.R;
import com.moch.Pertemuan6.fragment.AlertFragment;
import com.moch.Pertemuan6.fragment.ActivityFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {


    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        smartTabLayout = findViewById(R.id.ViewPagerTab);
        viewPager = findViewById(R.id.viewPager);

        getSupportActionBar().setElevation(0); // configura sombra inferior da action bar

        //configurar adapter para abas

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Alert", AlertFragment.class)
                        .add("Listview", ListviewFragment.class)
                        .add("Activity", ActivityFragment.class)

                .create()
        );

        viewPager.setAdapter(adapter);

        smartTabLayout.setViewPager(viewPager);
    }
}
