package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public final class zzje {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzjd f40306zza;

    public static synchronized zzjd zza() {
        try {
            if (f40306zza == null) {
                zzb(new zzjh());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f40306zza;
    }

    public static synchronized void zzb(zzjd zzjdVar) {
        if (f40306zza != null) {
            throw new IllegalStateException("init() already called");
        }
        f40306zza = zzjdVar;
    }
}
