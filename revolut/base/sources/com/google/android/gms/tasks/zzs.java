package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzs implements OnTokenCanceledListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f48806zza;

    public zzs(TaskCompletionSource taskCompletionSource) {
        this.f48806zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.f48806zza.f48754zza.zzc();
    }
}
