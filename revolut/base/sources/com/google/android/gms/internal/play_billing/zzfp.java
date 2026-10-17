package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
final class zzfp implements zzgz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzfp f46017zza = new zzfp();

    private zzfp() {
    }

    public static zzfp zza() {
        return f46017zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgz
    public final zzgy zzb(Class cls) {
        if (!zzfu.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzgy) zzfu.zzr(cls.asSubclass(zzfu.class)).zzd(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgz
    public final boolean zzc(Class cls) {
        return zzfu.class.isAssignableFrom(cls);
    }
}
