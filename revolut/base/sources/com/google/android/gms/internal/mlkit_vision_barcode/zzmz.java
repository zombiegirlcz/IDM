package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzmz implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzmz f42183zza = new zzmz();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42184zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42185zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42186zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42187zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42188zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f42189zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f42190zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f42191zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f42192zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final b f42193zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static final b f42194zzl;
    private static final b zzm;
    private static final b zzn;
    private static final b zzo;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42184zzb = new b("appId", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42185zzc = new b("appVersion", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42186zzd = new b("firebaseProjectId", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f42187zze = new b("mlSdkVersion", v0.a.r(map4));
        zzfg zzfgVarD5 = d.d(5);
        HashMap map5 = new HashMap();
        map5.put(zzfgVarD5.annotationType(), zzfgVarD5);
        f42188zzf = new b("tfliteSchemaVersion", v0.a.r(map5));
        zzfg zzfgVarD6 = d.d(6);
        HashMap map6 = new HashMap();
        map6.put(zzfgVarD6.annotationType(), zzfgVarD6);
        f42189zzg = new b("gcmSenderId", v0.a.r(map6));
        zzfg zzfgVarD7 = d.d(7);
        HashMap map7 = new HashMap();
        map7.put(zzfgVarD7.annotationType(), zzfgVarD7);
        f42190zzh = new b("apiKey", v0.a.r(map7));
        zzfg zzfgVarD8 = d.d(8);
        HashMap map8 = new HashMap();
        map8.put(zzfgVarD8.annotationType(), zzfgVarD8);
        f42191zzi = new b("languages", v0.a.r(map8));
        zzfg zzfgVarD9 = d.d(9);
        HashMap map9 = new HashMap();
        map9.put(zzfgVarD9.annotationType(), zzfgVarD9);
        f42192zzj = new b("mlSdkInstanceId", v0.a.r(map9));
        zzfg zzfgVarD10 = d.d(10);
        HashMap map10 = new HashMap();
        map10.put(zzfgVarD10.annotationType(), zzfgVarD10);
        f42193zzk = new b("isClearcutClient", v0.a.r(map10));
        zzfg zzfgVarD11 = d.d(11);
        HashMap map11 = new HashMap();
        map11.put(zzfgVarD11.annotationType(), zzfgVarD11);
        f42194zzl = new b("isStandaloneMlkit", v0.a.r(map11));
        zzfg zzfgVarD12 = d.d(12);
        HashMap map12 = new HashMap();
        map12.put(zzfgVarD12.annotationType(), zzfgVarD12);
        zzm = new b("isJsonLogging", v0.a.r(map12));
        zzfg zzfgVarD13 = d.d(13);
        HashMap map13 = new HashMap();
        map13.put(zzfgVarD13.annotationType(), zzfgVarD13);
        zzn = new b("buildLevel", v0.a.r(map13));
        zzfg zzfgVarD14 = d.d(14);
        HashMap map14 = new HashMap();
        map14.put(zzfgVarD14.annotationType(), zzfgVarD14);
        zzo = new b("optionalModuleVersion", v0.a.r(map14));
    }

    private zzmz() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzsl zzslVar = (zzsl) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f42184zzb, zzslVar.zzg());
        dVar.add(f42185zzc, zzslVar.zzh());
        dVar.add(f42186zzd, (Object) null);
        dVar.add(f42187zze, zzslVar.zzj());
        dVar.add(f42188zzf, zzslVar.zzk());
        dVar.add(f42189zzg, (Object) null);
        dVar.add(f42190zzh, (Object) null);
        dVar.add(f42191zzi, zzslVar.zza());
        dVar.add(f42192zzj, zzslVar.zzi());
        dVar.add(f42193zzk, zzslVar.zzb());
        dVar.add(f42194zzl, zzslVar.zzd());
        dVar.add(zzm, zzslVar.zzc());
        dVar.add(zzn, zzslVar.zze());
        dVar.add(zzo, zzslVar.zzf());
    }
}
