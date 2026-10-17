package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zznq implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzgl f47555zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zznx f47556zzb;

    public zznq(zznx zznxVar, zzgl zzglVar) {
        this.f47555zza = zzglVar;
        this.f47556zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznx zznxVar = this.f47556zzb;
        synchronized (zznxVar) {
            try {
                zznxVar.f47567zzb = false;
                zzny zznyVar = zznxVar.f47566zza;
                if (!zznyVar.zzaa()) {
                    zznyVar.zzu.zzaW().zzj().zza("Connected to service");
                    zznyVar.zzW(this.f47555zza);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
