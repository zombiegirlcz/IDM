package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzoo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzoo f44388zza;

    private zzoo() {
    }

    public static synchronized zzoo zza() {
        try {
            if (f44388zza == null) {
                f44388zza = new zzoo();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f44388zza;
    }
}
