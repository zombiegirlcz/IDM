package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzjm implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzjm f41738zza = new zzjm();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41739zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41740zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41741zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41742zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f41743zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f41744zzg;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41739zzb = new b("maxMs", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41740zzc = new b("minMs", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41741zzd = new b("avgMs", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f41742zze = new b("firstQuartileMs", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f41743zzf = new b("medianMs", v0.a.r(map5));
        zzfg zzfgVarD6 = d.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzfgVarD6.annotationType(), zzfgVarD6);
        f41744zzg = new b("thirdQuartileMs", v0.a.r(map6));
    }

    private zzjm() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzol zzolVar = (zzol) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f41739zzb, zzolVar.zzc());
        dVar.add(f41740zzc, zzolVar.zze());
        dVar.add(f41741zzd, zzolVar.zza());
        dVar.add(f41742zze, zzolVar.zzb());
        dVar.add(f41743zzf, zzolVar.zzd());
        dVar.add(f41744zzg, zzolVar.zzf());
    }
}
