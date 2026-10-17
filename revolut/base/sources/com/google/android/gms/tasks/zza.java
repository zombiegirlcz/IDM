package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zza implements OnSuccessListener {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ OnTokenCanceledListener f48756zza;

    public zza(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.f48756zza = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
        this.f48756zza.onCanceled();
    }
}
