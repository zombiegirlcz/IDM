package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: loaded from: classes16.dex */
final class zzu extends com.google.android.gms.maps.internal.zzm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ GoogleMap.OnCameraChangeListener f46821zza;

    public zzu(GoogleMap googleMap, GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.f46821zza = onCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void zzb(CameraPosition cameraPosition) {
        this.f46821zza.onCameraChange(cameraPosition);
    }
}
