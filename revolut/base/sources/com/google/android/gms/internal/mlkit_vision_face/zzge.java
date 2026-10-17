package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes.dex */
final class zzge implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzge f43841zza = new zzge();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43842zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43843zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43844zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43845zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f43846zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f43847zzg;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43842zzb = new b("landmarkMode", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43843zzc = new b("classificationMode", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43844zzd = new b("performanceMode", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43845zze = new b("contourMode", v0.a.r(map4));
        zzcu zzcuVarD5 = a.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarD5.annotationType(), zzcuVarD5);
        f43846zzf = new b("isTrackingEnabled", v0.a.r(map5));
        zzcu zzcuVarD6 = a.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarD6.annotationType(), zzcuVarD6);
        f43847zzg = new b("minFaceSize", v0.a.r(map6));
    }

    private zzge() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzkd zzkdVar = (zzkd) obj2;
        d dVar = (d) obj3;
        dVar.add(f43842zzb, zzkdVar.zzc());
        dVar.add(f43843zzc, zzkdVar.zza());
        dVar.add(f43844zzd, zzkdVar.zzd());
        dVar.add(f43845zze, zzkdVar.zzb());
        dVar.add(f43846zzf, zzkdVar.zze());
        dVar.add(f43847zzg, zzkdVar.zzf());
    }
}
