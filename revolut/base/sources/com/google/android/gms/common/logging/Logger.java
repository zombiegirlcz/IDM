package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class Logger {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f38186zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f38187zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final GmsLogger f38188zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f38189zzd;

    @KeepForSdk
    public Logger(@NonNull String str, @NonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append('[');
            for (String str2 : strArr) {
                if (sb6.length() > 1) {
                    sb6.append(",");
                }
                sb6.append(str2);
            }
            sb6.append("] ");
            string = sb6.toString();
        }
        this.f38187zzb = string;
        this.f38186zza = str;
        this.f38188zzc = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f38186zza, i)) {
            i++;
        }
        this.f38189zzd = i;
    }

    @KeepForSdk
    public void d(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(3)) {
            String str2 = this.f38186zza;
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull Throwable th10, @NonNull Object... objArr) {
        String str2 = this.f38186zza;
        format(str, objArr);
    }

    @NonNull
    @KeepForSdk
    public String format(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f38187zzb.concat(str);
    }

    @NonNull
    @KeepForSdk
    public String getTag() {
        return this.f38186zza;
    }

    @KeepForSdk
    public void i(@NonNull String str, @NonNull Object... objArr) {
        String str2 = this.f38186zza;
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.f38189zzd <= i;
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull Throwable th10, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            String str2 = this.f38186zza;
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void w(@NonNull String str, @NonNull Object... objArr) {
        String str2 = this.f38186zza;
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull Throwable th10, @NonNull Object... objArr) {
        String str2 = this.f38186zza;
        format(str, objArr);
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull Object... objArr) {
        String str2 = this.f38186zza;
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@NonNull Throwable th10) {
        String str = this.f38186zza;
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            String str2 = this.f38186zza;
            format(str, objArr);
        }
    }
}
