package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

/* JADX INFO: loaded from: classes16.dex */
final class zzad extends com.google.android.gms.maps.internal.zzas {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ OnMapReadyCallback f46752zza;

    public zzad(zzae zzaeVar, OnMapReadyCallback onMapReadyCallback) {
        this.f46752zza = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.f46752zza.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
