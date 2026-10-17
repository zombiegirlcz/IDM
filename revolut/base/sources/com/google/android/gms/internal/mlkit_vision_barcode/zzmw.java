package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzmw implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzmw f42172zza = new zzmw();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42173zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42174zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42175zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42176zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42177zzf;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42173zzb = new b("xMin", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42174zzc = new b("yMin", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42175zzd = new b("xMax", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f42176zze = new b("yMax", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f42177zzf = new b("confidenceScore", v0.a.r(map5));
    }

    private zzmw() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzse zzseVar = (zzse) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f42173zzb, zzseVar.zzc());
        dVar.add(f42174zzc, zzseVar.zze());
        dVar.add(f42175zzd, zzseVar.zzb());
        dVar.add(f42176zze, zzseVar.zzd());
        dVar.add(f42177zzf, zzseVar.zza());
    }
}
