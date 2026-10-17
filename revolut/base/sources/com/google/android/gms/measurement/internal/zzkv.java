package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzkv implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ boolean f47320zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47321zzb;

    public zzkv(zzlw zzlwVar, boolean z) {
        this.f47320zza = z;
        this.f47321zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.f47321zzb;
        zzio zzioVar = zzlwVar.zzu;
        boolean zZzJ = zzioVar.zzJ();
        boolean zZzI = zzioVar.zzI();
        boolean z = this.f47320zza;
        zzioVar.zzF(z);
        if (zZzI == z) {
            zzioVar.zzaW().zzj().zzb("Default data collection state already set to", Boolean.valueOf(z));
        }
        if (zzioVar.zzJ() == zZzJ || zzioVar.zzJ() != zzioVar.zzI()) {
            zzioVar.zzaW().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(z), Boolean.valueOf(zZzJ));
        }
        zzlwVar.zzat();
    }
}
