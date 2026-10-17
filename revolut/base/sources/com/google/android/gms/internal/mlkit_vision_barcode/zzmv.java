package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzmv implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzmv f42165zza = new zzmv();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42166zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42167zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42168zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42169zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42170zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f42171zzg;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42166zzb = new b("appName", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42167zzc = new b("sessionId", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42168zzd = new b("startZoomLevel", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f42169zze = new b("endZoomLevel", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f42170zzf = new b("durationMs", v0.a.r(map5));
        zzfg zzfgVarD6 = d.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzfgVarD6.annotationType(), zzfgVarD6);
        f42171zzg = new b("predictedArea", v0.a.r(map6));
    }

    private zzmv() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzsg zzsgVar = (zzsg) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f42166zzb, zzsgVar.zze());
        dVar.add(f42167zzc, zzsgVar.zzf());
        dVar.add(f42168zzd, zzsgVar.zzc());
        dVar.add(f42169zze, zzsgVar.zzb());
        dVar.add(f42170zzf, zzsgVar.zzd());
        dVar.add(f42171zzg, zzsgVar.zza());
    }
}
