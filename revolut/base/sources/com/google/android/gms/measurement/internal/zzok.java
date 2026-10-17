package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzok implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final long f47606zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final long f47607zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzol f47608zzc;

    public zzok(zzol zzolVar, long j2, long j3) {
        this.f47608zzc = zzolVar;
        this.f47606zza = j2;
        this.f47607zzb = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47608zzc.f47609zza.zzu.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzoj
            @Override // java.lang.Runnable
            public final void run() {
                zzok zzokVar = this.f47605zza;
                zzop zzopVar = zzokVar.f47608zzc.f47609zza;
                long j2 = zzokVar.f47606zza;
                long j3 = zzokVar.f47607zzb;
                zzopVar.zzg();
                zzio zzioVar = zzopVar.zzu;
                zzioVar.zzaW().zzd().zza("Application going to the background");
                zzioVar.zzm().zzn.zza(true);
                zzopVar.zzm(true);
                if (!zzioVar.zzf().zzz()) {
                    zzon zzonVar = zzopVar.f47618zzb;
                    zzonVar.zzd(false, false, j3);
                    zzonVar.zzb(j3);
                }
                zzioVar.zzaW().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(j2));
                zzio zzioVar2 = zzopVar.zzu;
                zzlw zzlwVarZzq = zzioVar2.zzq();
                zzlwVarZzq.zzg();
                zzio zzioVar3 = zzlwVarZzq.zzu;
                zzlwVarZzq.zza();
                zzny zznyVarZzu = zzioVar3.zzu();
                zznyVarZzu.zzg();
                zznyVarZzu.zza();
                if (!zznyVarZzu.zzad() || zznyVarZzu.zzu.zzw().zzm() >= 242600) {
                    zzioVar3.zzu().zzz();
                }
                if (zzioVar.zzf().zzx(null, zzgi.zzaS)) {
                    long jZzk = zzioVar.zzw().zzak(zzioVar.zzaT().getPackageName(), zzioVar.zzf().zzs()) ? 1000L : zzioVar.zzf().zzk(zzioVar.zzaT().getPackageName(), zzgi.zzD);
                    zzioVar.zzaW().zzj().zzb("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jZzk));
                    zzioVar2.zzs().zzj(jZzk);
                }
            }
        });
    }
}
