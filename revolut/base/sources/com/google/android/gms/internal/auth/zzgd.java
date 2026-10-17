package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzgd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzgc f39085zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzgc f39086zzb;

    static {
        zzgc zzgcVar = null;
        try {
            zzgcVar = (zzgc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39085zza = zzgcVar;
        f39086zzb = new zzgc();
    }

    public static zzgc zza() {
        return f39085zza;
    }

    public static zzgc zzb() {
        return f39086zzb;
    }
}
