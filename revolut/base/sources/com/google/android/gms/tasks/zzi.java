package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzi implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Task f48783zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzj f48784zzb;

    public zzi(zzj zzjVar, Task task) {
        this.f48783zza = task;
        this.f48784zzb = zzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48784zzb.f48786zzb) {
            try {
                zzj zzjVar = this.f48784zzb;
                if (zzjVar.f48787zzc != null) {
                    zzjVar.f48787zzc.onComplete(this.f48783zza);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
