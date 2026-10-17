package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzml implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ long f47452zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzmo f47453zzb;

    public zzml(zzmo zzmoVar, long j2) {
        this.f47452zza = j2;
        this.f47453zzb = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmo zzmoVar = this.f47453zzb;
        zzmoVar.zzu.zzd().zzf(this.f47452zza);
        zzmoVar.f47458zza = null;
    }
}
