package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzjg implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47224zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzjp f47225zzb;

    public zzjg(zzjp zzjpVar, zzr zzrVar) {
        this.f47224zza = zzrVar;
        this.f47225zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f47225zzb;
        zzjpVar.f47248zza.zzL();
        zzjpVar.f47248zza.zzah(this.f47224zza);
    }
}
