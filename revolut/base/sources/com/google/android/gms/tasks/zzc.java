package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzc implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Task f48769zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzd f48770zzb;

    public zzc(zzd zzdVar, Task task) {
        this.f48769zza = task;
        this.f48770zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f48769zza.isCanceled()) {
            this.f48770zzb.f48773zzc.zzc();
            return;
        }
        try {
            this.f48770zzb.f48773zzc.zzb(this.f48770zzb.f48772zzb.then(this.f48769zza));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f48770zzb.f48773zzc.zza((Exception) e.getCause());
            } else {
                this.f48770zzb.f48773zzc.zza(e);
            }
        } catch (Exception e2) {
            this.f48770zzb.f48773zzc.zza(e2);
        }
    }
}
