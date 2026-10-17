package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
public final class zzms {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzmr f43413zza;

    public static synchronized zzmj zza(zzme zzmeVar) {
        try {
            if (f43413zza == null) {
                f43413zza = new zzmr(null);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (zzmj) f43413zza.get(zzmeVar);
    }

    public static synchronized zzmj zzb(String str) {
        return zza(zzme.zzd("vision-common").zzd());
    }
}
