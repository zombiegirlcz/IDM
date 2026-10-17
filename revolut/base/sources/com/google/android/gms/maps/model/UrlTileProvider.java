package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes16.dex */
public abstract class UrlTileProvider implements TileProvider {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f46741zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f46742zzb;

    public UrlTileProvider(int i, int i2) {
        this.f46741zza = i;
        this.f46742zzb = i2;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzf.zzb(4352);
            int i5 = this.f46741zza;
            int i6 = this.f46742zzb;
            InputStream inputStream = tileUrl.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStream, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int i21 = inputStream.read(bArr);
                if (i21 == -1) {
                    Tile tile = new Tile(i5, i6, byteArrayOutputStream.toByteArray());
                    com.google.android.gms.internal.maps.zzf.zza();
                    return tile;
                }
                byteArrayOutputStream.write(bArr, 0, i21);
            }
        } catch (IOException unused) {
            com.google.android.gms.internal.maps.zzf.zza();
            return null;
        } catch (Throwable th10) {
            com.google.android.gms.internal.maps.zzf.zza();
            throw th10;
        }
    }

    public abstract URL getTileUrl(int i, int i2, int i3);
}
