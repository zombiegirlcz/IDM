package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgq implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgq f40890zza = new zzgq();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f40891zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f40892zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f40893zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f40894zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f40895zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f40896zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f40897zzh;

    static {
        zzbc zzbcVarI = a.i(1);
        HashMap map = new HashMap();
        map.put(zzbcVarI.annotationType(), zzbcVarI);
        f40891zzb = new b("options", v0.a.r(map));
        zzbc zzbcVarI2 = a.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarI2.annotationType(), zzbcVarI2);
        f40892zzc = new b("roughDownloadDurationMs", v0.a.r(map2));
        zzbc zzbcVarI3 = a.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarI3.annotationType(), zzbcVarI3);
        f40893zzd = new b("errorCode", v0.a.r(map3));
        zzbc zzbcVarI4 = a.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarI4.annotationType(), zzbcVarI4);
        f40894zze = new b("exactDownloadDurationMs", v0.a.r(map4));
        zzbc zzbcVarI5 = a.i(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarI5.annotationType(), zzbcVarI5);
        f40895zzf = new b("downloadStatus", v0.a.r(map5));
        zzbc zzbcVarI6 = a.i(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarI6.annotationType(), zzbcVarI6);
        f40896zzg = new b("downloadFailureStatus", v0.a.r(map6));
        zzbc zzbcVarI7 = a.i(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarI7.annotationType(), zzbcVarI7);
        f40897zzh = new b("mddDownloadErrorCodes", v0.a.r(map7));
    }

    private zzgq() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zznc zzncVar = (zznc) obj2;
        d dVar = (d) obj3;
        dVar.add(f40891zzb, zzncVar.zzc());
        dVar.add(f40892zzc, zzncVar.zzf());
        dVar.add(f40893zzd, zzncVar.zza());
        dVar.add(f40894zze, zzncVar.zze());
        dVar.add(f40895zzf, zzncVar.zzb());
        dVar.add(f40896zzg, zzncVar.zzd());
        dVar.add(f40897zzh, (Object) null);
    }
}
