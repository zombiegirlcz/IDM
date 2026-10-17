package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.k f26118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f26120c;
    public InputStream d;
    public volatile boolean e;

    public m(i8.k kVar, int i) {
        this.f26118a = kVar;
        this.f26119b = i;
    }

    public static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            return Log.isLoggable("HttpUrlFetcher", 3) ? -1 : -1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final c8.a b() {
        return c8.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c(com.bumptech.glide.h hVar, d dVar) {
        i8.k kVar = this.f26118a;
        int i = y8.h.f311602b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                if (kVar.e == null) {
                    kVar.e = new URL(kVar.b());
                }
                dVar.d(e(kVar.e, 0, null, kVar.f159379a.getHeaders()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    String str = "Finished http url fetcher fetch in " + y8.h.a(jElapsedRealtimeNanos);
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                }
                dVar.e(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    String str2 = "Finished http url fetcher fetch in " + y8.h.a(jElapsedRealtimeNanos);
                }
            }
        } catch (Throwable th10) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                String str3 = "Finished http url fetcher fetch in " + y8.h.a(jElapsedRealtimeNanos);
            }
            throw th10;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.e = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f26120c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f26120c = null;
    }

    public final InputStream e(URL url2, int i, URL url3, Map map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1, null);
        }
        if (url3 != null) {
            try {
                if (url2.toURI().equals(url3.toURI())) {
                    throw new HttpException("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f26119b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection()));
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f26120c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.f26120c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iD = d(this.f26120c);
                int i3 = iD / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f26120c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new y8.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                String str = "Got non empty content encoding: " + httpURLConnection2.getContentEncoding();
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new HttpException("Failed to obtain InputStream", d(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iD == -1) {
                        throw new HttpException("Http request failed", iD, null);
                    }
                    try {
                        throw new HttpException(this.f26120c.getResponseMessage(), iD, null);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", iD, e2);
                    }
                }
                String headerField = this.f26120c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", iD, null);
                }
                try {
                    URL url4 = new URL(url2, headerField);
                    cleanup();
                    return e(url4, i + 1, url2, map);
                } catch (MalformedURLException e4) {
                    throw new HttpException(j6.a.q("Bad redirect url: ", headerField), iD, e4);
                }
            } catch (IOException e5) {
                throw new HttpException("Failed to connect or obtain data", d(this.f26120c), e5);
            }
        } catch (IOException e6) {
            throw new HttpException("URL.openConnection threw", 0, e6);
        }
    }
}
