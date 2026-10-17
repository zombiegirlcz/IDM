package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzhb extends zzgz {
    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* bridge */ /* synthetic */ Object zza(Object obj2) {
        zzev zzevVar = (zzev) obj2;
        zzha zzhaVar = zzevVar.f39040zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.f39040zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* synthetic */ Object zzb(Object obj2) {
        return ((zzev) obj2).f39040zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* bridge */ /* synthetic */ Object zzc(Object obj2, Object obj3) {
        if (!zzha.zza().equals(obj3)) {
            if (zzha.zza().equals(obj2)) {
                return zzha.zzc((zzha) obj2, (zzha) obj3);
            }
            ((zzha) obj2).zzb((zzha) obj3);
        }
        return obj2;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* bridge */ /* synthetic */ void zzd(Object obj2, int i, long j2) {
        ((zzha) obj2).zzh(i << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final void zze(Object obj2) {
        ((zzev) obj2).f39040zzc.zzf();
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* synthetic */ void zzf(Object obj2, Object obj3) {
        ((zzev) obj2).f39040zzc = (zzha) obj3;
    }
}
