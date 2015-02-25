/*
 * Simple Web View code for tutorial, written by Jakir Hossain. 
 * 
 */
package me.jakir.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	 
	private WebView webView;		
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	 
		webView = (WebView) findViewById(R.id.myWebView);
		webView.loadUrl("http://jakir.me");
		webView.setWebViewClient(new WebViewClient()); 

	}
}
