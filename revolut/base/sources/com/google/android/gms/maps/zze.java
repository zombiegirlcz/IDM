package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes16.dex */
final class zze extends com.google.android.gms.maps.internal.zzae {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ GoogleMap.OnInfoWindowCloseListener f46805zza;

    public zze(GoogleMap googleMap, GoogleMap.OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.f46805zza = onInfoWindowCloseListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaf
    public final void zzb(com.google.android.gms.internal.maps.zzad zzadVar) {
        this.f46805zza.onInfoWindowClose(new Marker(zzadVar));
    }
}
