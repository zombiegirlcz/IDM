package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes.dex */
final class zzgj implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgj f43872zza = new zzgj();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43873zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43874zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43875zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43876zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f43877zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f43878zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f43879zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f43880zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f43881zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final b f43882zzk;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43873zzb = new b("durationMs", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43874zzc = new b("errorCode", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43875zzd = new b("isColdCall", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43876zze = new b("autoManageModelOnBackground", v0.a.r(map4));
        zzcu zzcuVarD5 = a.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarD5.annotationType(), zzcuVarD5);
        f43877zzf = new b("autoManageModelOnLowMemory", v0.a.r(map5));
        zzcu zzcuVarD6 = a.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarD6.annotationType(), zzcuVarD6);
        f43878zzg = new b("isNnApiEnabled", v0.a.r(map6));
        zzcu zzcuVarD7 = a.d(7);
        HashMap map7 = new HashMap();
        map7.put(zzcuVarD7.annotationType(), zzcuVarD7);
        f43879zzh = new b("eventsCount", v0.a.r(map7));
        zzcu zzcuVarD8 = a.d(8);
        HashMap map8 = new HashMap();
        map8.put(zzcuVarD8.annotationType(), zzcuVarD8);
        f43880zzi = new b("otherErrors", v0.a.r(map8));
        zzcu zzcuVarD9 = a.d(9);
        HashMap map9 = new HashMap();
        map9.put(zzcuVarD9.annotationType(), zzcuVarD9);
        f43881zzj = new b("remoteConfigValueForAcceleration", v0.a.r(map9));
        zzcu zzcuVarD10 = a.d(10);
        HashMap map10 = new HashMap();
        map10.put(zzcuVarD10.annotationType(), zzcuVarD10);
        f43882zzk = new b("isAccelerated", v0.a.r(map10));
    }

    private zzgj() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzkl zzklVar = (zzkl) obj2;
        d dVar = (d) obj3;
        dVar.add(f43873zzb, zzklVar.zze());
        dVar.add(f43874zzc, zzklVar.zza());
        dVar.add(f43875zzd, zzklVar.zzd());
        dVar.add(f43876zze, zzklVar.zzb());
        dVar.add(f43877zzf, zzklVar.zzc());
        dVar.add(f43878zzg, (Object) null);
        dVar.add(f43879zzh, (Object) null);
        dVar.add(f43880zzi, (Object) null);
        dVar.add(f43881zzj, (Object) null);
        dVar.add(f43882zzk, (Object) null);
    }
}
