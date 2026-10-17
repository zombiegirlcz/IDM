package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgr implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgr f40898zza = new zzgr();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f40899zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f40900zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f40901zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f40902zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f40903zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f40904zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f40905zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f40906zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f40907zzj;

    static {
        zzbc zzbcVarI = a.i(1);
        HashMap map = new HashMap();
        map.put(zzbcVarI.annotationType(), zzbcVarI);
        f40899zzb = new b("name", v0.a.r(map));
        zzbc zzbcVarI2 = a.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarI2.annotationType(), zzbcVarI2);
        f40900zzc = new b("version", v0.a.r(map2));
        zzbc zzbcVarI3 = a.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarI3.annotationType(), zzbcVarI3);
        f40901zzd = new b("source", v0.a.r(map3));
        zzbc zzbcVarI4 = a.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarI4.annotationType(), zzbcVarI4);
        f40902zze = new b("uri", v0.a.r(map4));
        zzbc zzbcVarI5 = a.i(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarI5.annotationType(), zzbcVarI5);
        f40903zzf = new b("hash", v0.a.r(map5));
        zzbc zzbcVarI6 = a.i(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarI6.annotationType(), zzbcVarI6);
        f40904zzg = new b("modelType", v0.a.r(map6));
        zzbc zzbcVarI7 = a.i(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarI7.annotationType(), zzbcVarI7);
        f40905zzh = new b("size", v0.a.r(map7));
        zzbc zzbcVarI8 = a.i(8);
        HashMap map8 = new HashMap();
        map8.put(zzbcVarI8.annotationType(), zzbcVarI8);
        f40906zzi = new b("hasLabelMap", v0.a.r(map8));
        zzbc zzbcVarI9 = a.i(9);
        HashMap map9 = new HashMap();
        map9.put(zzbcVarI9.annotationType(), zzbcVarI9);
        f40907zzj = new b("isManifestModel", v0.a.r(map9));
    }

    private zzgr() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zznh zznhVar = (zznh) obj2;
        d dVar = (d) obj3;
        dVar.add(f40899zzb, zznhVar.zzd());
        dVar.add(f40900zzc, (Object) null);
        dVar.add(f40901zzd, zznhVar.zzb());
        dVar.add(f40902zze, (Object) null);
        dVar.add(f40903zzf, zznhVar.zzc());
        dVar.add(f40904zzg, zznhVar.zza());
        dVar.add(f40905zzh, (Object) null);
        dVar.add(f40906zzi, (Object) null);
        dVar.add(f40907zzj, (Object) null);
    }
}
