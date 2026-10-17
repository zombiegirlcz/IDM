package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: loaded from: classes16.dex */
final class zzv extends com.google.android.gms.maps.internal.zzu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ GoogleMap.OnCameraMoveStartedListener f46822zza;

    public zzv(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.f46822zza = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zzb(int i) {
        this.f46822zza.onCameraMoveStarted(i);
    }
}
