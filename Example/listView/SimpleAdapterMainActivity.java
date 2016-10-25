package com.example.widgetexample;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class SimpleAdapterMainActivity extends ListActivity {

	ArrayList<HashMap<String, String>>	list=null;
	HashMap<String, String> map1=null;
	HashMap<String, String> map2=null;
	HashMap<String, String> map3=null;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simpleadapterdemo);
		list=new ArrayList<HashMap<String, String>>();
		map1=new HashMap<String, String>();
		map2=new HashMap<String, String>();
		map3=new HashMap<String, String>();
		map1.put("user_name", "Mary");
		map1.put("user_ip", "192.168.0.1");
		map2.put("user_name", "John");
		map2.put("user_ip", "192.168.0.2");
		map3.put("user_name", "Rose");
		map3.put("user_ip", "192.168.0.3");
		list.add(map1);
		list.add(map2);
		list.add(map3);
		SimpleAdapter listAdapter=new SimpleAdapter(this, list, R.layout.user, new String[]{"user_name","user_ip"}, new int[]{R.id.user_name,R.id.user_ip});
		setListAdapter(listAdapter);
	}

protected void onListItemClick(ListView l, View v, int position, long id) {
	super.onListItemClick(l, v, position, id);
	Toast.makeText(this, "id="+id,Toast.LENGTH_LONG).show();
	Toast.makeText(this, "position="+position,Toast.LENGTH_LONG).show();
}


}
