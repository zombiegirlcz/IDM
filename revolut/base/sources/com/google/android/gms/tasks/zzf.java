package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzf<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Executor f48776zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Continuation f48777zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzw f48778zzc;

    public zzf(@NonNull Executor executor, @NonNull Continuation continuation, @NonNull zzw zzwVar) {
        this.f48776zza = executor;
        this.f48777zzb = continuation;
        this.f48778zzc = zzwVar;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f48778zzc.zzc();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc2) {
        this.f48778zzc.zza(exc2);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f48778zzc.zzb(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        this.f48776zza.execute(new zze(this, task));
    }
}
