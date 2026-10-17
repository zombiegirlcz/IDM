package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzmg implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzmg f44817zza = new zzmg();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44818zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44819zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44820zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f44821zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f44822zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f44823zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f44824zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f44825zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f44826zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final b f44827zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static final b f44828zzl;
    private static final b zzm;
    private static final b zzn;
    private static final b zzo;

    static {
        zzcx zzcxVarL = a.l(1);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44818zzb = new b("appId", v0.a.r(map));
        zzcx zzcxVarL2 = a.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarL2.annotationType(), zzcxVarL2);
        f44819zzc = new b("appVersion", v0.a.r(map2));
        zzcx zzcxVarL3 = a.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarL3.annotationType(), zzcxVarL3);
        f44820zzd = new b("firebaseProjectId", v0.a.r(map3));
        zzcx zzcxVarL4 = a.l(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarL4.annotationType(), zzcxVarL4);
        f44821zze = new b("mlSdkVersion", v0.a.r(map4));
        zzcx zzcxVarL5 = a.l(5);
        HashMap map5 = new HashMap();
        map5.put(zzcxVarL5.annotationType(), zzcxVarL5);
        f44822zzf = new b("tfliteSchemaVersion", v0.a.r(map5));
        zzcx zzcxVarL6 = a.l(6);
        HashMap map6 = new HashMap();
        map6.put(zzcxVarL6.annotationType(), zzcxVarL6);
        f44823zzg = new b("gcmSenderId", v0.a.r(map6));
        zzcx zzcxVarL7 = a.l(7);
        HashMap map7 = new HashMap();
        map7.put(zzcxVarL7.annotationType(), zzcxVarL7);
        f44824zzh = new b("apiKey", v0.a.r(map7));
        zzcx zzcxVarL8 = a.l(8);
        HashMap map8 = new HashMap();
        map8.put(zzcxVarL8.annotationType(), zzcxVarL8);
        f44825zzi = new b("languages", v0.a.r(map8));
        zzcx zzcxVarL9 = a.l(9);
        HashMap map9 = new HashMap();
        map9.put(zzcxVarL9.annotationType(), zzcxVarL9);
        f44826zzj = new b("mlSdkInstanceId", v0.a.r(map9));
        zzcx zzcxVarL10 = a.l(10);
        HashMap map10 = new HashMap();
        map10.put(zzcxVarL10.annotationType(), zzcxVarL10);
        f44827zzk = new b("isClearcutClient", v0.a.r(map10));
        zzcx zzcxVarL11 = a.l(11);
        HashMap map11 = new HashMap();
        map11.put(zzcxVarL11.annotationType(), zzcxVarL11);
        f44828zzl = new b("isStandaloneMlkit", v0.a.r(map11));
        zzcx zzcxVarL12 = a.l(12);
        HashMap map12 = new HashMap();
        map12.put(zzcxVarL12.annotationType(), zzcxVarL12);
        zzm = new b("isJsonLogging", v0.a.r(map12));
        zzcx zzcxVarL13 = a.l(13);
        HashMap map13 = new HashMap();
        map13.put(zzcxVarL13.annotationType(), zzcxVarL13);
        zzn = new b("buildLevel", v0.a.r(map13));
        zzcx zzcxVarL14 = a.l(14);
        HashMap map14 = new HashMap();
        map14.put(zzcxVarL14.annotationType(), zzcxVarL14);
        zzo = new b("optionalModuleVersion", v0.a.r(map14));
    }

    private zzmg() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzst zzstVar = (zzst) obj2;
        d dVar = (d) obj3;
        dVar.add(f44818zzb, zzstVar.zzg());
        dVar.add(f44819zzc, zzstVar.zzh());
        dVar.add(f44820zzd, (Object) null);
        dVar.add(f44821zze, zzstVar.zzj());
        dVar.add(f44822zzf, zzstVar.zzk());
        dVar.add(f44823zzg, (Object) null);
        dVar.add(f44824zzh, (Object) null);
        dVar.add(f44825zzi, zzstVar.zza());
        dVar.add(f44826zzj, zzstVar.zzi());
        dVar.add(f44827zzk, zzstVar.zzb());
        dVar.add(f44828zzl, zzstVar.zzd());
        dVar.add(zzm, zzstVar.zzc());
        dVar.add(zzn, zzstVar.zze());
        dVar.add(zzo, zzstVar.zzf());
    }
}
