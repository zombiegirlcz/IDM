package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzix implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47192zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzjp f47193zzb;

    public zzix(zzjp zzjpVar, zzr zzrVar) {
        this.f47192zza = zzrVar;
        this.f47193zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzjp zzjpVar = this.f47193zzb;
        zzjpVar.f47248zza.zzL();
        zzjpVar.f47248zza.zzab(this.f47192zza);
    }
}
