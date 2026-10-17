package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzgt implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgt f43938zza = new zzgt();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43939zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43940zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43941zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43942zze;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43939zzb = new b("modelInfo", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43940zzc = new b("initialDownloadConditions", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43941zzd = new b("updateDownloadConditions", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43942zze = new b("isModelUpdateEnabled", v0.a.r(map4));
    }

    private zzgt() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
