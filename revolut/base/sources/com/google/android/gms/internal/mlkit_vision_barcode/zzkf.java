package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzkf implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzkf f41842zza = new zzkf();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41843zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41844zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41845zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41846zze;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41843zzb = new b("cameraId", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41844zzc = new b("physicalCameraIds", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41845zzd = new b("deviceModel", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f41846zze = new b("enableMlDenoiser", v0.a.r(map4));
    }

    private zzkf() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
