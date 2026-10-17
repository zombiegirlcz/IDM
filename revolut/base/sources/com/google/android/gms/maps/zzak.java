package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbk;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* JADX INFO: loaded from: classes16.dex */
final class zzak extends zzbk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener f46769zza;

    public zzak(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        this.f46769zza = onStreetViewPanoramaCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbl
    public final void zzb(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f46769zza.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
    }
}
