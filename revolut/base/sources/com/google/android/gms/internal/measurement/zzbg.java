package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzbg implements zzbf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzg f39857zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39858zzb;

    public zzbg(zzg zzgVar, String str) {
        this.f39857zza = zzgVar;
        this.f39858zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbf
    public final zzg zza(zzap zzapVar) {
        zzg zzgVar = this.f39857zza;
        zzgVar.zze(this.f39858zzb, zzapVar);
        return zzgVar;
    }
}
