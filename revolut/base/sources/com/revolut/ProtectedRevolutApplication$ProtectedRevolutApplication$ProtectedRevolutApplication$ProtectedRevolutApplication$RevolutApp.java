package com.revolut;

import android.content.Context;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$RevolutApplication {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static File f50263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f50264b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f50265c = "alice";

    public static void a(Context context) {
        System.loadLibrary(f50265c);
        boolean z = !ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q.a();
        f50264b = z;
        if (z) {
            f50263a = new File(context.getFilesDir().getAbsolutePath());
            ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q.a(context);
            ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q.a(context.getFilesDir().getAbsolutePath());
        }
    }

    public static boolean a(byte[] bArr, long j2) throws Throwable {
        HttpURLConnection httpURLConnectionA;
        Throwable th10;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        DataOutputStream dataOutputStream2 = null;
        boolean z = false;
        try {
            httpURLConnectionA = ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q.a(bArr, j2);
        } catch (Throwable th11) {
            th = th11;
            httpURLConnectionA = null;
        }
        try {
            if (httpURLConnectionA != null) {
                try {
                    DataOutputStream dataOutputStream3 = new DataOutputStream(httpURLConnectionA.getOutputStream());
                    try {
                        dataOutputStream3.write(bArr);
                        dataOutputStream3.flush();
                        boolean z3 = httpURLConnectionA.getResponseCode() == 200;
                        try {
                            dataOutputStream3.close();
                            z = z3;
                        } catch (IOException e) {
                        }
                    } catch (Throwable th12) {
                        th10 = th12;
                        dataOutputStream = dataOutputStream3;
                        if (dataOutputStream == null) {
                            throw th10;
                        }
                        try {
                            dataOutputStream.close();
                            throw th10;
                        } catch (IOException e2) {
                            throw th10;
                        }
                    }
                } catch (Throwable th13) {
                    th10 = th13;
                    dataOutputStream = null;
                }
                if (httpURLConnectionA != null) {
                    httpURLConnectionA.disconnect();
                }
            } else if (httpURLConnectionA != null) {
                httpURLConnectionA.disconnect();
            }
        } catch (Throwable th14) {
            httpURLConnection = httpURLConnectionA;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return z;
    }

    public static void b(Context context) {
        a(context);
        c(context);
    }

    public static void c(Context context) {
        ProtectedRevolutApplication$ProtectedRevolutApplication$ProtectedRevolutApplication$q.b(context.getApplicationContext());
    }
}
