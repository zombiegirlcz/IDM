package nw;

import android.graphics.Bitmap;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219749a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f219750b;

    public b(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f219750b = bitmap;
    }

    public static String f(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb6 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb6.append(line);
                    sb6.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb6.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f219749a) {
            case 0:
                Bitmap bitmap = (Bitmap) this.f219750b;
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                break;
            default:
                ((HttpURLConnection) this.f219750b).disconnect();
                break;
        }
    }

    public String d() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f219750b;
        boolean z = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z = true;
                }
            } catch (NullPointerException e) {
                e = e;
            }
        } catch (IOException unused) {
        }
        if (z) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + f(httpURLConnection);
        } catch (IOException e2) {
            e = e2;
        }
        r7.c.c("get error failed ", e);
        return e.getMessage();
    }

    public b(HttpURLConnection httpURLConnection) {
        this.f219750b = httpURLConnection;
    }
}
