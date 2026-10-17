package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzlr implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzlr f42012zza = new zzlr();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42013zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42014zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42015zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42016zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42017zzf;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42013zzb = new b("detectorOptions", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42014zzc = new b("errorCodes", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42015zzd = new b("totalInitializationMs", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f42016zze = new b("loggingInitializationMs", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f42017zzf = new b("otherErrors", v0.a.r(map5));
    }

    private zzlr() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
