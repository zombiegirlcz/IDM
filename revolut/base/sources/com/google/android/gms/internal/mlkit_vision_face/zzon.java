package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzon {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzom f44387zza;

    public static synchronized zzoc zza(zznt zzntVar) {
        try {
            if (f44387zza == null) {
                f44387zza = new zzom(null);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (zzoc) f44387zza.get(zzntVar);
    }

    public static synchronized zzoc zzb(String str) {
        return zza(zznt.zzd(str).zzd());
    }
}
