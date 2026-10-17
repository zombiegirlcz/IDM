package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.zzao;

/* JADX INFO: loaded from: classes16.dex */
final class zzag extends zzao {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TileProvider f46745zza;

    public zzag(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.f46745zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final Tile zzb(int i, int i2, int i3) {
        return this.f46745zza.getTile(i, i2, i3);
    }
}
