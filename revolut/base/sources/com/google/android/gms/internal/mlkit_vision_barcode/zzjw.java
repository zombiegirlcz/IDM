package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzjw implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzjw f41788zza = new zzjw();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41789zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41790zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41791zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41792zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f41793zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f41794zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f41795zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f41796zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f41797zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final b f41798zzk;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41789zzb = new b("durationMs", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41790zzc = new b("errorCode", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41791zzd = new b("isColdCall", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f41792zze = new b("autoManageModelOnBackground", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f41793zzf = new b("autoManageModelOnLowMemory", v0.a.r(map5));
        zzfg zzfgVarD6 = d.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzfgVarD6.annotationType(), zzfgVarD6);
        f41794zzg = new b("isNnApiEnabled", v0.a.r(map6));
        zzfg zzfgVarD7 = d.d(7);
        HashMap map7 = new HashMap();
        map7.put(zzfgVarD7.annotationType(), zzfgVarD7);
        f41795zzh = new b("eventsCount", v0.a.r(map7));
        zzfg zzfgVarD8 = d.d(8);
        HashMap map8 = new HashMap();
        map8.put(zzfgVarD8.annotationType(), zzfgVarD8);
        f41796zzi = new b("otherErrors", v0.a.r(map8));
        zzfg zzfgVarD9 = d.d(9);
        HashMap map9 = new HashMap();
        map9.put(zzfgVarD9.annotationType(), zzfgVarD9);
        f41797zzj = new b("remoteConfigValueForAcceleration", v0.a.r(map9));
        zzfg zzfgVarD10 = d.d(10);
        HashMap map10 = new HashMap();
        map10.put(zzfgVarD10.annotationType(), zzfgVarD10);
        f41798zzk = new b("isAccelerated", v0.a.r(map10));
    }

    private zzjw() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzoy zzoyVar = (zzoy) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f41789zzb, zzoyVar.zze());
        dVar.add(f41790zzc, zzoyVar.zza());
        dVar.add(f41791zzd, zzoyVar.zzd());
        dVar.add(f41792zze, zzoyVar.zzb());
        dVar.add(f41793zzf, zzoyVar.zzc());
        dVar.add(f41794zzg, (Object) null);
        dVar.add(f41795zzh, (Object) null);
        dVar.add(f41796zzi, (Object) null);
        dVar.add(f41797zzj, (Object) null);
        dVar.add(f41798zzk, (Object) null);
    }
}
