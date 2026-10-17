package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f44544zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f44545zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final c f44546zzc;

    public zzdc(Map map, Map map2, c cVar) {
        this.f44544zza = map;
        this.f44545zzb = map2;
        this.f44546zzc = cVar;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzcz(byteArrayOutputStream, this.f44544zza, this.f44545zzb, this.f44546zzc).zzf(obj2);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
