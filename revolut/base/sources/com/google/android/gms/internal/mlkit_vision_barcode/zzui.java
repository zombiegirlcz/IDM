package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
public final class zzui {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzuh f42484zza;

    public static synchronized zztx zza(zztp zztpVar) {
        try {
            if (f42484zza == null) {
                f42484zza = new zzuh(null);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (zztx) f42484zza.get(zztpVar);
    }

    public static synchronized zztx zzb(String str) {
        return zza(zztp.zzd(str).zzd());
    }
}
