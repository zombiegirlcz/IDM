package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zziw implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47190zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzjp f47191zzb;

    public zziw(zzjp zzjpVar, zzr zzrVar) {
        this.f47190zza = zzrVar;
        this.f47191zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f47191zzb;
        zzjpVar.f47248zza.zzL();
        zzjpVar.f47248zza.zzac(this.f47190zza);
    }
}
