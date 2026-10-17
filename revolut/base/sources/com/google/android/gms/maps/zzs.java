package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MapCapabilities;

/* JADX INFO: loaded from: classes16.dex */
final class zzs extends com.google.android.gms.maps.internal.zzak {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ GoogleMap.OnMapCapabilitiesChangedListener f46819zza;

    public zzs(GoogleMap googleMap, GoogleMap.OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        this.f46819zza = onMapCapabilitiesChangedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzal
    public final void zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.f46819zza.onMapCapabilitiesChanged(new MapCapabilities(zzaaVar));
    }
}
