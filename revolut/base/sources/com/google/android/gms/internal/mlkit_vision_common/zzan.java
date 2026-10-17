package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
public final class zzan {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f42636zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f42637zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final c f42638zzc;

    public zzan(Map map, Map map2, c cVar) {
        this.f42636zza = map;
        this.f42637zzb = map2;
        this.f42638zzc = cVar;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzak(byteArrayOutputStream, this.f42636zza, this.f42637zzb, this.f42638zzc).zzf(obj2);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
