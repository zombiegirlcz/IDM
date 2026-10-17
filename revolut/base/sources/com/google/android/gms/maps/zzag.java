package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

/* JADX INFO: loaded from: classes16.dex */
final class zzag extends com.google.android.gms.maps.internal.zzas {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ OnMapReadyCallback f46759zza;

    public zzag(zzah zzahVar, OnMapReadyCallback onMapReadyCallback) {
        this.f46759zza = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.f46759zza.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
