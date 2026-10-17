package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzfl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f41415zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f41416zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final c f41417zzc;

    public zzfl(Map map, Map map2, c cVar) {
        this.f41415zza = map;
        this.f41416zzb = map2;
        this.f41417zzc = cVar;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzfi(byteArrayOutputStream, this.f41415zza, this.f41416zzb, this.f41417zzc).zzf(obj2);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
