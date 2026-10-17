package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f40767zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f40768zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final c f40769zzc;

    public zzbh(Map map, Map map2, c cVar) {
        this.f40767zza = map;
        this.f40768zzb = map2;
        this.f40769zzc = cVar;
    }

    @NonNull
    public final byte[] zza(@NonNull Object obj2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbe(byteArrayOutputStream, this.f40767zza, this.f40768zzb, this.f40769zzc).zzf(obj2);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
