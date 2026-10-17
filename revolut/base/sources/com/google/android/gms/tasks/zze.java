package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zze implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Task f48774zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzf f48775zzb;

    public zze(zzf zzfVar, Task task) {
        this.f48774zza = task;
        this.f48775zzb = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f48775zzb.f48777zzb.then(this.f48774zza);
            if (task == null) {
                this.f48775zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzf zzfVar = this.f48775zzb;
            Executor executor = TaskExecutors.f48755zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, this.f48775zzb);
            task.addOnCanceledListener(executor, this.f48775zzb);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f48775zzb.f48778zzc.zza((Exception) e.getCause());
            } else {
                this.f48775zzb.f48778zzc.zza(e);
            }
        } catch (Exception e2) {
            this.f48775zzb.f48778zzc.zza(e2);
        }
    }
}
