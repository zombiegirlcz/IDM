package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbq;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* JADX INFO: loaded from: classes16.dex */
final class zzam extends zzbq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaLongClickListener f46771zza;

    public zzam(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        this.f46771zza = onStreetViewPanoramaLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbr
    public final void zzb(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.f46771zza.onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
    }
}
