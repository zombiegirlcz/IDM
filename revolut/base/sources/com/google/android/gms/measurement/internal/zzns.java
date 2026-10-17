package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzns implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzgl f47559zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zznx f47560zzb;

    public zzns(zznx zznxVar, zzgl zzglVar) {
        this.f47559zza = zzglVar;
        this.f47560zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznx zznxVar = this.f47560zzb;
        synchronized (zznxVar) {
            try {
                zznxVar.f47567zzb = false;
                zzny zznyVar = zznxVar.f47566zza;
                if (!zznyVar.zzaa()) {
                    zznyVar.zzu.zzaW().zzd().zza("Connected to remote service");
                    zznyVar.zzW(this.f47559zza);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        zzny zznyVar2 = this.f47560zzb.f47566zza;
        if (!zznyVar2.zzu.zzf().zzx(null, zzgi.zzbo) || zznyVar2.f47573zze == null) {
            return;
        }
        zznyVar2.f47573zze.shutdownNow();
        zznyVar2.f47573zze = null;
    }
}
