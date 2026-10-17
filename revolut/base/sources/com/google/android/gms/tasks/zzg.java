package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes16.dex */
final class zzg implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzh f48779zza;

    public zzg(zzh zzhVar) {
        this.f48779zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48779zza.f48781zzb) {
            try {
                zzh zzhVar = this.f48779zza;
                if (zzhVar.f48782zzc != null) {
                    zzhVar.f48782zzc.onCanceled();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
