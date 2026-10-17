package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzkr implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzkr f41909zza = new zzkr();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41910zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41911zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41912zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41913zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f41914zzf;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41910zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41911zzc = new b("options", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41912zzd = new b("detectedBarcodeFormats", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f41913zze = new b("detectedBarcodeValueTypes", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f41914zzf = new b("imageInfo", v0.a.r(map5));
    }

    private zzkr() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzpz zzpzVar = (zzpz) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f41910zzb, zzpzVar.zzd());
        dVar.add(f41911zzc, zzpzVar.zze());
        dVar.add(f41912zzd, zzpzVar.zza());
        dVar.add(f41913zze, zzpzVar.zzb());
        dVar.add(f41914zzf, zzpzVar.zzc());
    }
}
