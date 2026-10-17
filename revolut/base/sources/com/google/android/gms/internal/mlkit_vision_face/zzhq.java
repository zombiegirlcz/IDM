package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzhq implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzhq f44032zza = new zzhq();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44033zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44034zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44035zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f44036zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f44037zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f44038zzg;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f44033zzb = new b("detectorMode", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f44034zzc = new b("multipleObjectsEnabled", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f44035zzd = new b("classificationEnabled", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f44036zze = new b("maxPerObjectLabelCount", v0.a.r(map4));
        zzcu zzcuVarD5 = a.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarD5.annotationType(), zzcuVarD5);
        f44037zzf = new b("classificationConfidenceThreshold", v0.a.r(map5));
        zzcu zzcuVarD6 = a.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarD6.annotationType(), zzcuVarD6);
        f44038zzg = new b("customLocalModelOptions", v0.a.r(map6));
    }

    private zzhq() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
