package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
final class zzgr implements zzgz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzgz[] f46054zza;

    public zzgr(zzgz... zzgzVarArr) {
        this.f46054zza = zzgzVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgz
    public final zzgy zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzgz zzgzVar = this.f46054zza[i];
            if (zzgzVar.zzc(cls)) {
                return zzgzVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgz
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f46054zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
