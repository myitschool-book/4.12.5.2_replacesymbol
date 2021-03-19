package ru.samsung.itschool.mdev.replacesymbol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView from_charTV,to_charTV;
    private EditText edit_textET;
    private String from_char, to_char, edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        from_charTV = findViewById(R.id.from_char);
        to_charTV = findViewById(R.id.to_char);
        edit_textET = findViewById(R.id.editText);
    }

    public void replace(View v){
        from_char = from_charTV.getText().toString();
        to_char = to_charTV.getText().toString();
        edit_text = edit_textET.getText().toString();
        edit_text = edit_text.replaceAll(from_char, to_char);
        edit_textET.setText(edit_text);
    }
}