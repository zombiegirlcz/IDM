package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbo;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* JADX INFO: loaded from: classes16.dex */
final class zzal extends zzbo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaClickListener f46770zza;

    public zzal(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        this.f46770zza = onStreetViewPanoramaClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zzb(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.f46770zza.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
    }
}
