package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzap;

/* JADX INFO: loaded from: classes16.dex */
final class zzaf implements TileProvider {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TileOverlayOptions f46743zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzap f46744zzb;

    public zzaf(TileOverlayOptions tileOverlayOptions) {
        this.f46743zza = tileOverlayOptions;
        this.f46744zzb = tileOverlayOptions.f46735zza;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.f46744zzb.zzb(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
