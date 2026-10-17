package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzuo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzuo f45021zza;

    private zzuo() {
    }

    public static synchronized zzuo zza() {
        try {
            if (f45021zza == null) {
                f45021zza = new zzuo();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f45021zza;
    }
}
