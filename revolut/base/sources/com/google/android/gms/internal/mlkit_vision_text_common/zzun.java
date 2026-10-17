package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzun {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzum f45020zza;

    public static synchronized zzuc zza(zztu zztuVar) {
        try {
            if (f45020zza == null) {
                f45020zza = new zzum(null);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (zzuc) f45020zza.get(zztuVar);
    }

    public static synchronized zzuc zzb(String str) {
        return zza(zztu.zzd(str).zzd());
    }
}
