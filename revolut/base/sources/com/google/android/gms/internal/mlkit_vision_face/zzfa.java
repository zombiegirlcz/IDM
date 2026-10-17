package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzfa implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzfa f43704zza = new zzfa();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43705zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43706zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43707zzd;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43705zzb = new b("logEventKey", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43706zzc = new b("eventCount", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43707zzd = new b("inferenceDurationStats", v0.a.r(map3));
    }

    private zzfa() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
