package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzp<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Executor f48800zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final SuccessContinuation f48801zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzw f48802zzc;

    public zzp(@NonNull Executor executor, @NonNull SuccessContinuation successContinuation, @NonNull zzw zzwVar) {
        this.f48800zza = executor;
        this.f48801zzb = successContinuation;
        this.f48802zzc = zzwVar;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f48802zzc.zzc();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc2) {
        this.f48802zzc.zza(exc2);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f48802zzc.zzb(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        this.f48800zza.execute(new zzo(this, task));
    }
}
