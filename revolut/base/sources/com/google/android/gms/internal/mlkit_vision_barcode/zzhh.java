package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzhh implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzhh f41473zza = new zzhh();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41474zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41475zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41476zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41477zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f41478zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f41479zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f41480zzh;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41474zzb = new b("errorCode", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41475zzc = new b("hasResult", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41476zzd = new b("isColdCall", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f41477zze = new b("imageInfo", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f41478zzf = new b("options", v0.a.r(map5));
        zzfg zzfgVarD6 = d.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzfgVarD6.annotationType(), zzfgVarD6);
        f41479zzg = new b("detectedBarcodeFormats", v0.a.r(map6));
        zzfg zzfgVarD7 = d.d(7);
        HashMap map7 = new HashMap();
        map7.put(zzfgVarD7.annotationType(), zzfgVarD7);
        f41480zzh = new b("detectedBarcodeValueTypes", v0.a.r(map7));
    }

    private zzhh() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzfv zzfvVar = (zzfv) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f41474zzb, zzfvVar.zzc());
        dVar.add(f41475zzc, (Object) null);
        dVar.add(f41476zzd, zzfvVar.zze());
        dVar.add(f41477zze, (Object) null);
        dVar.add(f41478zzf, zzfvVar.zzd());
        dVar.add(f41479zzg, zzfvVar.zza());
        dVar.add(f41480zzh, zzfvVar.zzb());
    }
}
