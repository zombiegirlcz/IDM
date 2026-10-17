package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzol {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzop f47609zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzok f47610zzb;

    public zzol(zzop zzopVar) {
        this.f47609zza = zzopVar;
    }

    public final void zza(long j2) {
        zzop zzopVar = this.f47609zza;
        this.f47610zzb = new zzok(this, zzopVar.zzu.zzaU().currentTimeMillis(), j2);
        zzopVar.f47620zzd.postDelayed(this.f47610zzb, 2000L);
    }

    public final void zzb() {
        zzop zzopVar = this.f47609zza;
        zzopVar.zzg();
        zzok zzokVar = this.f47610zzb;
        if (zzokVar != null) {
            zzopVar.f47620zzd.removeCallbacks(zzokVar);
        }
        zzio zzioVar = zzopVar.zzu;
        zzioVar.zzm().zzn.zza(false);
        zzopVar.zzm(false);
        if (zzioVar.zzf().zzx(null, zzgi.zzaZ)) {
            zzio zzioVar2 = zzopVar.zzu;
            if (zzioVar2.zzq().zzap()) {
                zzioVar.zzaW().zzj().zza("Retrying trigger URI registration in foreground");
                zzioVar2.zzq().zzU();
            }
        }
    }
}
