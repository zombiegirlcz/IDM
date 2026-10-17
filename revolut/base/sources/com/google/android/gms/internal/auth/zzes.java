package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzes implements zzfv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzes f39035zza = new zzes();

    private zzes() {
    }

    public static zzes zza() {
        return f39035zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final zzfu zzb(Class cls) {
        if (!zzev.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzfu) zzev.zzb(cls.asSubclass(zzev.class)).zzn(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(Class cls) {
        return zzev.class.isAssignableFrom(cls);
    }
}
