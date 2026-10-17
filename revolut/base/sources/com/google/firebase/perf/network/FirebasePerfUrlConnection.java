package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import rf.d;
import tf.c;
import tf.g;
import wf.e;

/* JADX INFO: loaded from: classes17.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url2) throws IOException {
        e eVar = e.f296850s;
        Timer timer = new Timer();
        timer.c();
        long j2 = timer.f49592a;
        d dVar = new d(eVar);
        try {
            URLConnection uRLConnectionOpenConnection = url2.openConnection();
            return uRLConnectionOpenConnection instanceof HttpsURLConnection ? new tf.d((HttpsURLConnection) uRLConnectionOpenConnection, timer, dVar).f270135a.b() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionOpenConnection, timer, dVar).f270134a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            dVar.j(j2);
            dVar.T(timer.a());
            dVar.W(url2.toString());
            g.c(dVar);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj2) throws IOException {
        return obj2 instanceof HttpsURLConnection ? new tf.d((HttpsURLConnection) obj2, new Timer(), new d(e.f296850s)) : obj2 instanceof HttpURLConnection ? new c((HttpURLConnection) obj2, new Timer(), new d(e.f296850s)) : obj2;
    }

    @Keep
    public static InputStream openStream(URL url2) throws IOException {
        e eVar = e.f296850s;
        Timer timer = new Timer();
        if (!eVar.f296853c.get()) {
            return url2.openConnection().getInputStream();
        }
        timer.c();
        long j2 = timer.f49592a;
        d dVar = new d(eVar);
        try {
            URLConnection uRLConnectionOpenConnection = url2.openConnection();
            return uRLConnectionOpenConnection instanceof HttpsURLConnection ? new tf.d((HttpsURLConnection) uRLConnectionOpenConnection, timer, dVar).f270135a.e() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionOpenConnection, timer, dVar).f270134a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            dVar.j(j2);
            dVar.T(timer.a());
            dVar.W(url2.toString());
            g.c(dVar);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url2, Class[] clsArr) throws IOException {
        e eVar = e.f296850s;
        Timer timer = new Timer();
        timer.c();
        long j2 = timer.f49592a;
        d dVar = new d(eVar);
        try {
            URLConnection uRLConnectionOpenConnection = url2.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new tf.d((HttpsURLConnection) uRLConnectionOpenConnection, timer, dVar).f270135a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) uRLConnectionOpenConnection, timer, dVar).f270134a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            dVar.j(j2);
            dVar.T(timer.a());
            dVar.W(url2.toString());
            g.c(dVar);
            throw e;
        }
    }
}
