package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzjm implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzqb f47239zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzr f47240zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzjp f47241zzc;

    public zzjm(zzjp zzjpVar, zzqb zzqbVar, zzr zzrVar) {
        this.f47239zza = zzqbVar;
        this.f47240zzb = zzrVar;
        this.f47241zzc = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f47241zzc;
        zzjpVar.f47248zza.zzL();
        zzqb zzqbVar = this.f47239zza;
        if (zzqbVar.zza() == null) {
            zzjpVar.f47248zza.zzag(zzqbVar.f47716zzb, this.f47240zzb);
        } else {
            zzjpVar.f47248zza.zzas(zzqbVar, this.f47240zzb);
        }
    }
}
