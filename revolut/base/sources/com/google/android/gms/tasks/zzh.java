package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzh implements zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Executor f48780zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f48781zzb = new Object();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private OnCanceledListener f48782zzc;

    public zzh(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f48780zza = executor;
        this.f48782zzc = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.f48781zzb) {
            this.f48782zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        if (task.isCanceled()) {
            synchronized (this.f48781zzb) {
                try {
                    if (this.f48782zzc == null) {
                        return;
                    }
                    this.f48780zza.execute(new zzg(this));
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }
}
