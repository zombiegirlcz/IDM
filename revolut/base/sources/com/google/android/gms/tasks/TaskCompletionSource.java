package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class TaskCompletionSource<TResult> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzw f48754zza = new zzw();

    public TaskCompletionSource() {
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.f48754zza;
    }

    public void setException(@NonNull Exception exc2) {
        this.f48754zza.zza(exc2);
    }

    public void setResult(TResult tresult) {
        this.f48754zza.zzb(tresult);
    }

    public boolean trySetException(@NonNull Exception exc2) {
        return this.f48754zza.zzd(exc2);
    }

    public boolean trySetResult(TResult tresult) {
        return this.f48754zza.zze(tresult);
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }
}
