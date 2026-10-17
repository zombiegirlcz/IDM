package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzss {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzsr f41227zza;

    public static synchronized zzsh zza(zzsb zzsbVar) {
        try {
            if (f41227zza == null) {
                f41227zza = new zzsr(null);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (zzsh) f41227zza.get(zzsbVar);
    }

    public static synchronized zzsh zzb(String str) {
        return zza(zzsb.zzd("common").zzd());
    }
}
