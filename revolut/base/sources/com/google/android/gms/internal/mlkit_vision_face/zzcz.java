package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzcz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f43562zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f43563zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final c f43564zzc;

    public zzcz(Map map, Map map2, c cVar) {
        this.f43562zza = map;
        this.f43563zzb = map2;
        this.f43564zzc = cVar;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzcw(byteArrayOutputStream, this.f43562zza, this.f43563zzb, this.f43564zzc).zzf(obj2);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
