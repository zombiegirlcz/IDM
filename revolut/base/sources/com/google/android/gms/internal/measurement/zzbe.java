package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzbe implements zzbf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzg f39855zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39856zzb;

    public zzbe(zzg zzgVar, String str) {
        this.f39855zza = zzgVar;
        this.f39856zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbf
    public final zzg zza(zzap zzapVar) {
        zzg zzgVarZza = this.f39855zza.zza();
        zzgVarZza.zze(this.f39856zzb, zzapVar);
        return zzgVarZza;
    }
}
