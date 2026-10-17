package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzht implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzht f44651zza = new zzht();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44652zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44653zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44654zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f44655zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f44656zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f44657zzg;

    static {
        zzcx zzcxVarL = a.l(1);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44652zzb = new b("maxMs", v0.a.r(map));
        zzcx zzcxVarL2 = a.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarL2.annotationType(), zzcxVarL2);
        f44653zzc = new b("minMs", v0.a.r(map2));
        zzcx zzcxVarL3 = a.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarL3.annotationType(), zzcxVarL3);
        f44654zzd = new b("avgMs", v0.a.r(map3));
        zzcx zzcxVarL4 = a.l(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarL4.annotationType(), zzcxVarL4);
        f44655zze = new b("firstQuartileMs", v0.a.r(map4));
        zzcx zzcxVarL5 = a.l(5);
        HashMap map5 = new HashMap();
        map5.put(zzcxVarL5.annotationType(), zzcxVarL5);
        f44656zzf = new b("medianMs", v0.a.r(map5));
        zzcx zzcxVarL6 = a.l(6);
        HashMap map6 = new HashMap();
        map6.put(zzcxVarL6.annotationType(), zzcxVarL6);
        f44657zzg = new b("thirdQuartileMs", v0.a.r(map6));
    }

    private zzht() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zznw zznwVar = (zznw) obj2;
        d dVar = (d) obj3;
        dVar.add(f44652zzb, zznwVar.zzc());
        dVar.add(f44653zzc, zznwVar.zze());
        dVar.add(f44654zzd, zznwVar.zza());
        dVar.add(f44655zze, zznwVar.zzb());
        dVar.add(f44656zzf, zznwVar.zzd());
        dVar.add(f44657zzg, zznwVar.zzf());
    }
}
