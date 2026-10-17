package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzkh implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzkh f41014zza = new zzkh();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41015zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41016zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41017zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41018zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f41019zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f41020zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f41021zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f41022zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f41023zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final b f41024zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static final b f41025zzl;
    private static final b zzm;
    private static final b zzn;
    private static final b zzo;

    static {
        zzbc zzbcVarI = a.i(1);
        HashMap map = new HashMap();
        map.put(zzbcVarI.annotationType(), zzbcVarI);
        f41015zzb = new b("appId", v0.a.r(map));
        zzbc zzbcVarI2 = a.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarI2.annotationType(), zzbcVarI2);
        f41016zzc = new b("appVersion", v0.a.r(map2));
        zzbc zzbcVarI3 = a.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarI3.annotationType(), zzbcVarI3);
        f41017zzd = new b("firebaseProjectId", v0.a.r(map3));
        zzbc zzbcVarI4 = a.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarI4.annotationType(), zzbcVarI4);
        f41018zze = new b("mlSdkVersion", v0.a.r(map4));
        zzbc zzbcVarI5 = a.i(5);
        HashMap map5 = new HashMap();
        map5.put(zzbcVarI5.annotationType(), zzbcVarI5);
        f41019zzf = new b("tfliteSchemaVersion", v0.a.r(map5));
        zzbc zzbcVarI6 = a.i(6);
        HashMap map6 = new HashMap();
        map6.put(zzbcVarI6.annotationType(), zzbcVarI6);
        f41020zzg = new b("gcmSenderId", v0.a.r(map6));
        zzbc zzbcVarI7 = a.i(7);
        HashMap map7 = new HashMap();
        map7.put(zzbcVarI7.annotationType(), zzbcVarI7);
        f41021zzh = new b("apiKey", v0.a.r(map7));
        zzbc zzbcVarI8 = a.i(8);
        HashMap map8 = new HashMap();
        map8.put(zzbcVarI8.annotationType(), zzbcVarI8);
        f41022zzi = new b("languages", v0.a.r(map8));
        zzbc zzbcVarI9 = a.i(9);
        HashMap map9 = new HashMap();
        map9.put(zzbcVarI9.annotationType(), zzbcVarI9);
        f41023zzj = new b("mlSdkInstanceId", v0.a.r(map9));
        zzbc zzbcVarI10 = a.i(10);
        HashMap map10 = new HashMap();
        map10.put(zzbcVarI10.annotationType(), zzbcVarI10);
        f41024zzk = new b("isClearcutClient", v0.a.r(map10));
        zzbc zzbcVarI11 = a.i(11);
        HashMap map11 = new HashMap();
        map11.put(zzbcVarI11.annotationType(), zzbcVarI11);
        f41025zzl = new b("isStandaloneMlkit", v0.a.r(map11));
        zzbc zzbcVarI12 = a.i(12);
        HashMap map12 = new HashMap();
        map12.put(zzbcVarI12.annotationType(), zzbcVarI12);
        zzm = new b("isJsonLogging", v0.a.r(map12));
        zzbc zzbcVarI13 = a.i(13);
        HashMap map13 = new HashMap();
        map13.put(zzbcVarI13.annotationType(), zzbcVarI13);
        zzn = new b("buildLevel", v0.a.r(map13));
        zzbc zzbcVarI14 = a.i(14);
        HashMap map14 = new HashMap();
        map14.put(zzbcVarI14.annotationType(), zzbcVarI14);
        zzo = new b("optionalModuleVersion", v0.a.r(map14));
    }

    private zzkh() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzqv zzqvVar = (zzqv) obj2;
        d dVar = (d) obj3;
        dVar.add(f41015zzb, zzqvVar.zzg());
        dVar.add(f41016zzc, zzqvVar.zzh());
        dVar.add(f41017zzd, (Object) null);
        dVar.add(f41018zze, zzqvVar.zzj());
        dVar.add(f41019zzf, zzqvVar.zzk());
        dVar.add(f41020zzg, (Object) null);
        dVar.add(f41021zzh, (Object) null);
        dVar.add(f41022zzi, zzqvVar.zza());
        dVar.add(f41023zzj, zzqvVar.zzi());
        dVar.add(f41024zzk, zzqvVar.zzb());
        dVar.add(f41025zzl, zzqvVar.zzd());
        dVar.add(zzm, zzqvVar.zzc());
        dVar.add(zzn, zzqvVar.zze());
        dVar.add(zzo, zzqvVar.zzf());
    }
}
