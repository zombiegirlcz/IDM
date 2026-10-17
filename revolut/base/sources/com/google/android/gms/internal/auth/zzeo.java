package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzeo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzem f39026zza = new zzen();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzem f39027zzb;

    static {
        zzem zzemVar = null;
        try {
            zzemVar = (zzem) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39027zzb = zzemVar;
    }

    public static zzem zza() {
        zzem zzemVar = f39027zzb;
        if (zzemVar != null) {
            return zzemVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzem zzb() {
        return f39026zza;
    }
}
