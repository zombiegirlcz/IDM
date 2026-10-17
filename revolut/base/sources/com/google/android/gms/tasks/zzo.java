package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzo implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Task f48798zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzp f48799zzb;

    public zzo(zzp zzpVar, Task task) {
        this.f48798zza = task;
        this.f48799zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.f48799zzb.f48801zzb.then(this.f48798zza.getResult());
            if (taskThen == null) {
                this.f48799zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzp zzpVar = this.f48799zzb;
            Executor executor = TaskExecutors.f48755zza;
            taskThen.addOnSuccessListener(executor, zzpVar);
            taskThen.addOnFailureListener(executor, this.f48799zzb);
            taskThen.addOnCanceledListener(executor, this.f48799zzb);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f48799zzb.onFailure((Exception) e.getCause());
            } else {
                this.f48799zzb.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f48799zzb.onCanceled();
        } catch (Exception e2) {
            this.f48799zzb.onFailure(e2);
        }
    }
}
