package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes.dex */
final class zzhf implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzhf f43989zza = new zzhf();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43990zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43991zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43992zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43993zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f43994zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f43995zzg;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43990zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43991zzc = new b("options", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43992zzd = new b("imageInfo", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43993zze = new b("detectorOptions", v0.a.r(map4));
        zzcu zzcuVarD5 = a.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarD5.annotationType(), zzcuVarD5);
        f43994zzf = new b("contourDetectedFaces", v0.a.r(map5));
        zzcu zzcuVarD6 = a.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarD6.annotationType(), zzcuVarD6);
        f43995zzg = new b("nonContourDetectedFaces", v0.a.r(map6));
    }

    private zzhf() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzll zzllVar = (zzll) obj2;
        d dVar = (d) obj3;
        dVar.add(f43990zzb, zzllVar.zzc());
        dVar.add(f43991zzc, (Object) null);
        dVar.add(f43992zzd, zzllVar.zzb());
        dVar.add(f43993zze, zzllVar.zza());
        dVar.add(f43994zzf, zzllVar.zzd());
        dVar.add(f43995zzg, zzllVar.zze());
    }
}
