package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzmy implements zznf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zznf[] f40489zza;

    public zzmy(zznf... zznfVarArr) {
        this.f40489zza = zznfVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final zzne zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zznf zznfVar = this.f40489zza[i];
            if (zznfVar.zzc(cls)) {
                return zznfVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f40489zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
