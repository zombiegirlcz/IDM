package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzm implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Task f48793zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzn f48794zzb;

    public zzm(zzn zznVar, Task task) {
        this.f48793zza = task;
        this.f48794zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48794zzb.f48796zzb) {
            try {
                zzn zznVar = this.f48794zzb;
                if (zznVar.f48797zzc != null) {
                    zznVar.f48797zzc.onSuccess(this.f48793zza.getResult());
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
