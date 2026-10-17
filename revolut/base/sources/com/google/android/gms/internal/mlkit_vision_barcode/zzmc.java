package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzmc implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzmc f42063zza = new zzmc();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42064zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42065zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42066zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42067zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42068zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f42069zzg;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42064zzb = new b("detectorMode", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42065zzc = new b("multipleObjectsEnabled", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42066zzd = new b("classificationEnabled", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f42067zze = new b("maxPerObjectLabelCount", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f42068zzf = new b("classificationConfidenceThreshold", v0.a.r(map5));
        zzfg zzfgVarD6 = d.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzfgVarD6.annotationType(), zzfgVarD6);
        f42069zzg = new b("customLocalModelOptions", v0.a.r(map6));
    }

    private zzmc() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
