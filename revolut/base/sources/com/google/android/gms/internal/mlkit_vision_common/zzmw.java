package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzmw f43422zza;

    private zzmw() {
    }

    public static synchronized zzmw zza() {
        try {
            if (f43422zza == null) {
                f43422zza = new zzmw();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f43422zza;
    }

    public static final boolean zzb() {
        return zzmv.zza("mlkit-dev-profiling");
    }
}
