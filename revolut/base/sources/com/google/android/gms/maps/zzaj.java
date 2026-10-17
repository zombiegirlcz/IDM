package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbm;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* JADX INFO: loaded from: classes16.dex */
final class zzaj extends zzbm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaChangeListener f46768zza;

    public zzaj(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.f46768zza = onStreetViewPanoramaChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbn
    public final void zzb(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.f46768zza.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }
}
