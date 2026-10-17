package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

/* JADX INFO: loaded from: classes16.dex */
final class zzau extends com.google.android.gms.maps.internal.zzas {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ OnMapReadyCallback f46788zza;

    public zzau(zzav zzavVar, OnMapReadyCallback onMapReadyCallback) {
        this.f46788zza = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.f46788zza.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
