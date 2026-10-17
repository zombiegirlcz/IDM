package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzd implements zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Executor f48771zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Continuation f48772zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzw f48773zzc;

    public zzd(@NonNull Executor executor, @NonNull Continuation continuation, @NonNull zzw zzwVar) {
        this.f48771zza = executor;
        this.f48772zzb = continuation;
        this.f48773zzc = zzwVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        this.f48771zza.execute(new zzc(this, task));
    }
}
