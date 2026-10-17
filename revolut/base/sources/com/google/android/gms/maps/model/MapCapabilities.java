package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public final class MapCapabilities {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final com.google.android.gms.internal.maps.zzaa f46663zza;

    public MapCapabilities(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.f46663zza = (com.google.android.gms.internal.maps.zzaa) Preconditions.checkNotNull(zzaaVar);
    }

    public boolean isAdvancedMarkersAvailable() {
        try {
            return this.f46663zza.zzd();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
