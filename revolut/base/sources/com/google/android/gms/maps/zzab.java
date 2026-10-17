package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: loaded from: classes16.dex */
final class zzab extends com.google.android.gms.maps.internal.zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final GoogleMap.CancelableCallback f46751zza;

    public zzab(GoogleMap.CancelableCallback cancelableCallback) {
        this.f46751zza = cancelableCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzb() {
        this.f46751zza.onCancel();
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public final void zzc() {
        this.f46751zza.onFinish();
    }
}
