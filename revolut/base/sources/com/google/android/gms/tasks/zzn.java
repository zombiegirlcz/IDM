package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzn implements zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Executor f48795zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f48796zzb = new Object();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private OnSuccessListener f48797zzc;

    public zzn(@NonNull Executor executor, @NonNull OnSuccessListener onSuccessListener) {
        this.f48795zza = executor;
        this.f48797zzc = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.f48796zzb) {
            this.f48797zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f48796zzb) {
                try {
                    if (this.f48797zzc == null) {
                        return;
                    }
                    this.f48795zza.execute(new zzm(this, task));
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }
}
