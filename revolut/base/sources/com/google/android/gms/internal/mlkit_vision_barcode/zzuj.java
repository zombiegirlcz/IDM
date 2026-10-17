package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
public final class zzuj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzuj f42485zza;

    private zzuj() {
    }

    public static synchronized zzuj zza() {
        try {
            if (f42485zza == null) {
                f42485zza = new zzuj();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f42485zza;
    }
}
