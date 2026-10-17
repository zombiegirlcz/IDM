package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzhj implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzhj f44007zza = new zzhj();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44008zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44009zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44010zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f44011zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f44012zzf;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f44008zzb = new b("detectorOptions", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f44009zzc = new b("errorCodes", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f44010zzd = new b("totalInitializationMs", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f44011zze = new b("loggingInitializationMs", v0.a.r(map4));
        zzcu zzcuVarD5 = a.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarD5.annotationType(), zzcuVarD5);
        f44012zzf = new b("otherErrors", v0.a.r(map5));
    }

    private zzhj() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
