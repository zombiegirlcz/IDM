package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzkx implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ long f47323zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47324zzb;

    public zzkx(zzlw zzlwVar, long j2) {
        this.f47323zza = j2;
        this.f47324zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzio zzioVar = this.f47324zzb.zzu;
        zzhp zzhpVar = zzioVar.zzm().f47095zzf;
        long j2 = this.f47323zza;
        zzhpVar.zzb(j2);
        zzioVar.zzaW().zzd().zzb("Session timeout duration set", Long.valueOf(j2));
    }
}
