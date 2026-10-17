package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzsv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzsv f41230zza;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        try {
            if (f41230zza == null) {
                f41230zza = new zzsv();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f41230zza;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
