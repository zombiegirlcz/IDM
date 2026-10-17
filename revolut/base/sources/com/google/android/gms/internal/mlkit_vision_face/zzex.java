package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzex implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzex f43678zza = new zzex();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43679zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43680zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43681zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43682zze;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43679zzb = new b("errorCode", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43680zzc = new b("isColdCall", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43681zzd = new b("imageInfo", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43682zze = new b("detectorOptions", v0.a.r(map4));
    }

    private zzex() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
