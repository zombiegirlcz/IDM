package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes.dex */
final class zzip implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzip f44151zza = new zzip();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44152zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44153zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44154zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f44155zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f44156zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f44157zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f44158zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f44159zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f44160zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final b f44161zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static final b f44162zzl;
    private static final b zzm;
    private static final b zzn;
    private static final b zzo;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f44152zzb = new b("appId", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f44153zzc = new b("appVersion", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f44154zzd = new b("firebaseProjectId", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f44155zze = new b("mlSdkVersion", v0.a.r(map4));
        zzcu zzcuVarD5 = a.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzcuVarD5.annotationType(), zzcuVarD5);
        f44156zzf = new b("tfliteSchemaVersion", v0.a.r(map5));
        zzcu zzcuVarD6 = a.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzcuVarD6.annotationType(), zzcuVarD6);
        f44157zzg = new b("gcmSenderId", v0.a.r(map6));
        zzcu zzcuVarD7 = a.d(7);
        HashMap map7 = new HashMap();
        map7.put(zzcuVarD7.annotationType(), zzcuVarD7);
        f44158zzh = new b("apiKey", v0.a.r(map7));
        zzcu zzcuVarD8 = a.d(8);
        HashMap map8 = new HashMap();
        map8.put(zzcuVarD8.annotationType(), zzcuVarD8);
        f44159zzi = new b("languages", v0.a.r(map8));
        zzcu zzcuVarD9 = a.d(9);
        HashMap map9 = new HashMap();
        map9.put(zzcuVarD9.annotationType(), zzcuVarD9);
        f44160zzj = new b("mlSdkInstanceId", v0.a.r(map9));
        zzcu zzcuVarD10 = a.d(10);
        HashMap map10 = new HashMap();
        map10.put(zzcuVarD10.annotationType(), zzcuVarD10);
        f44161zzk = new b("isClearcutClient", v0.a.r(map10));
        zzcu zzcuVarD11 = a.d(11);
        HashMap map11 = new HashMap();
        map11.put(zzcuVarD11.annotationType(), zzcuVarD11);
        f44162zzl = new b("isStandaloneMlkit", v0.a.r(map11));
        zzcu zzcuVarD12 = a.d(12);
        HashMap map12 = new HashMap();
        map12.put(zzcuVarD12.annotationType(), zzcuVarD12);
        zzm = new b("isJsonLogging", v0.a.r(map12));
        zzcu zzcuVarD13 = a.d(13);
        HashMap map13 = new HashMap();
        map13.put(zzcuVarD13.annotationType(), zzcuVarD13);
        zzn = new b("buildLevel", v0.a.r(map13));
        zzcu zzcuVarD14 = a.d(14);
        HashMap map14 = new HashMap();
        map14.put(zzcuVarD14.annotationType(), zzcuVarD14);
        zzo = new b("optionalModuleVersion", v0.a.r(map14));
    }

    private zzip() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzmv zzmvVar = (zzmv) obj2;
        d dVar = (d) obj3;
        dVar.add(f44152zzb, zzmvVar.zzg());
        dVar.add(f44153zzc, zzmvVar.zzh());
        dVar.add(f44154zzd, (Object) null);
        dVar.add(f44155zze, zzmvVar.zzj());
        dVar.add(f44156zzf, zzmvVar.zzk());
        dVar.add(f44157zzg, (Object) null);
        dVar.add(f44158zzh, (Object) null);
        dVar.add(f44159zzi, zzmvVar.zza());
        dVar.add(f44160zzj, zzmvVar.zzi());
        dVar.add(f44161zzk, zzmvVar.zzb());
        dVar.add(f44162zzl, zzmvVar.zzd());
        dVar.add(zzm, zzmvVar.zzc());
        dVar.add(zzn, zzmvVar.zze());
        dVar.add(zzo, zzmvVar.zzf());
    }
}
