package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzmg implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzmg f42088zza = new zzmg();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42089zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42090zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42091zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42092zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42093zzf;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42089zzb = new b("detectorMode", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42090zzc = new b("personDetectionMode", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42091zzd = new b("landmarkDetectionMode", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f42092zze = new b("preferredHardwareConfigs", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f42093zzf = new b("runConfig", v0.a.r(map5));
    }

    private zzmg() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
