package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzbd implements zzbf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzg f39853zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39854zzb;

    public zzbd(zzg zzgVar, String str) {
        this.f39853zza = zzgVar;
        this.f39854zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbf
    public final zzg zza(zzap zzapVar) {
        zzg zzgVarZza = this.f39853zza.zza();
        zzgVarZza.zzf(this.f39854zzb, zzapVar);
        return zzgVarZza;
    }
}
