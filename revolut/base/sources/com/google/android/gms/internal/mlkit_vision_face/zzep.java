package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes.dex */
final class zzep implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzep f43639zza = new zzep();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43640zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43641zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43642zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43643zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f43644zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f43645zzg;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43640zzb = new b("errorCode", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43641zzc = new b("isColdCall", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43642zzd = new b("imageInfo", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43643zze = new b("detectorOptions", v0.a.r(map4));
        zzcu zzcuVarD5 = a.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarD5.annotationType(), zzcuVarD5);
        f43644zzf = new b("contourDetectedFaces", v0.a.r(map5));
        zzcu zzcuVarD6 = a.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarD6.annotationType(), zzcuVarD6);
        f43645zzg = new b("nonContourDetectedFaces", v0.a.r(map6));
    }

    private zzep() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzdn zzdnVar = (zzdn) obj2;
        d dVar = (d) obj3;
        dVar.add(f43640zzb, zzdnVar.zzb());
        dVar.add(f43641zzc, zzdnVar.zzc());
        dVar.add(f43642zzd, (Object) null);
        dVar.add(f43643zze, zzdnVar.zza());
        dVar.add(f43644zzf, zzdnVar.zzd());
        dVar.add(f43645zzg, zzdnVar.zze());
    }
}
