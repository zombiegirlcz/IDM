package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzl implements zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Executor f48790zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f48791zzb = new Object();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private OnFailureListener f48792zzc;

    public zzl(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f48790zza = executor;
        this.f48792zzc = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.f48791zzb) {
            this.f48792zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.f48791zzb) {
            try {
                if (this.f48792zzc == null) {
                    return;
                }
                this.f48790zza.execute(new zzk(this, task));
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
