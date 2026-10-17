package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzfo implements zzfv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzfv[] f39062zza;

    public zzfo(zzfv... zzfvVarArr) {
        this.f39062zza = zzfvVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final zzfu zzb(Class cls) {
        zzfv[] zzfvVarArr = this.f39062zza;
        for (int i = 0; i < 2; i++) {
            zzfv zzfvVar = zzfvVarArr[i];
            if (zzfvVar.zzc(cls)) {
                return zzfvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(Class cls) {
        zzfv[] zzfvVarArr = this.f39062zza;
        for (int i = 0; i < 2; i++) {
            if (zzfvVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
