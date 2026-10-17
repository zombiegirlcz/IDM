package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzer implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzer f43650zza = new zzer();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43651zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43652zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43653zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43654zze;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43651zzb = new b("errorCode", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43652zzc = new b("isColdCall", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43653zzd = new b("imageInfo", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43654zze = new b("detectorOptions", v0.a.r(map4));
    }

    private zzer() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
