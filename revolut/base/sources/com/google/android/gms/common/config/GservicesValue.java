package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public abstract class GservicesValue<T> {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final Object f37966zzc = new Object();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    protected final String f37967zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    protected final Object f37968zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private Object f37969zzd = null;

    public GservicesValue(@NonNull String str, @NonNull Object obj2) {
        this.f37967zza = str;
        this.f37968zzb = obj2;
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (f37966zzc) {
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Float> value(@NonNull String str, @NonNull Float f) {
        return new zzd(str, f);
    }

    @NonNull
    @KeepForSdk
    public final T get() {
        T t2;
        T t3 = (T) this.f37969zzd;
        if (t3 != null) {
            return t3;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj2 = f37966zzc;
        synchronized (obj2) {
        }
        synchronized (obj2) {
            try {
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        try {
            t2 = (T) zza(this.f37967zza);
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                t2 = (T) zza(this.f37967zza);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return t2;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @KeepForSdk
    public void override(@NonNull T t2) {
        this.f37969zzd = t2;
        Object obj2 = f37966zzc;
        synchronized (obj2) {
            synchronized (obj2) {
            }
        }
    }

    @KeepForSdk
    public void resetOverride() {
        this.f37969zzd = null;
    }

    @NonNull
    public abstract Object zza(@NonNull String str);

    @NonNull
    @KeepForSdk
    public static GservicesValue<Integer> value(@NonNull String str, @NonNull Integer num) {
        return new zzc(str, num);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Long> value(@NonNull String str, @NonNull Long l2) {
        return new zzb(str, l2);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<String> value(@NonNull String str, @NonNull String str2) {
        return new zze(str, str2);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Boolean> value(@NonNull String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }
}
