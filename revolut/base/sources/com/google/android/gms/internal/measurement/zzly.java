package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzly implements zznf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzly f40453zza = new zzly();

    private zzly() {
    }

    public static zzly zza() {
        return f40453zza;
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final zzne zzb(Class cls) {
        if (!zzmd.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzne) zzmd.zzci(cls.asSubclass(zzmd.class)).zzl(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final boolean zzc(Class cls) {
        return zzmd.class.isAssignableFrom(cls);
    }
}
