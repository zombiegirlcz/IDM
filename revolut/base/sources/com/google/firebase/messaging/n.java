package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f49513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Future f49514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f49515c;

    public n(URL url2) {
        this.f49513a = url2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f49514b.cancel(true);
    }

    public final Bitmap d() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url2 = this.f49513a;
        if (zIsLoggable) {
            String str = "Starting download of: " + url2;
        }
        URLConnection uRLConnectionOpenConnection = url2.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrL = ta6.a.L(new d(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                String str2 = "Downloaded " + bArrL.length + " bytes from " + url2;
            }
            if (bArrL.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length);
            if (bitmapDecodeByteArray == null) {
                throw new IOException("Failed to decode image: " + url2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String str3 = "Successfully downloaded image: " + url2;
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th10) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th11) {
                    th10.addSuppressed(th11);
                }
            }
            throw th10;
        }
    }
}
