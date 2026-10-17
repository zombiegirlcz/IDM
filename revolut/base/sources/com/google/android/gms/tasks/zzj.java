package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzj implements zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Executor f48785zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f48786zzb = new Object();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private OnCompleteListener f48787zzc;

    public zzj(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f48785zza = executor;
        this.f48787zzc = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.f48786zzb) {
            this.f48787zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        synchronized (this.f48786zzb) {
            try {
                if (this.f48787zzc == null) {
                    return;
                }
                this.f48785zza.execute(new zzi(this, task));
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
