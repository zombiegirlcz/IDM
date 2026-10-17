package com.google.android.gms.ads.identifier;

import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes16.dex */
public final class zzc {
    public static final void zza(String str) {
        try {
            try {
                zzi.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb6.append("Received non-success response code ");
                        sb6.append(responseCode);
                        sb6.append(" from pinging URL: ");
                        sb6.append(str);
                        sb6.toString();
                    }
                    zzi.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb9.append("Error while pinging URL: ");
                sb9.append(str);
                sb9.append(". ");
                sb9.append(message);
                sb9.toString();
                zzi.zza();
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb10.append("Error while parsing ping URL: ");
                sb10.append(str);
                sb10.append(". ");
                sb10.append(message2);
                sb10.toString();
                zzi.zza();
            } catch (RuntimeException e4) {
                e = e4;
                String message3 = e.getMessage();
                StringBuilder sb92 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb92.append("Error while pinging URL: ");
                sb92.append(str);
                sb92.append(". ");
                sb92.append(message3);
                sb92.toString();
                zzi.zza();
            }
        } catch (Throwable th10) {
            zzi.zza();
            throw th10;
        }
    }
}
