package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.IndoorBuilding;

/* JADX INFO: loaded from: classes16.dex */
final class zzk extends com.google.android.gms.maps.internal.zzaa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ GoogleMap.OnIndoorStateChangeListener f46811zza;

    public zzk(GoogleMap googleMap, GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f46811zza = onIndoorStateChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zzb() {
        this.f46811zza.onIndoorBuildingFocused();
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zzc(com.google.android.gms.internal.maps.zzu zzuVar) {
        this.f46811zza.onIndoorLevelActivated(new IndoorBuilding(zzuVar));
    }
}
