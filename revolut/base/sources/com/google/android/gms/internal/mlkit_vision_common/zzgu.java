package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgu implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgu f43248zza = new zzgu();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43249zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43250zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43251zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43252zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f43253zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f43254zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f43255zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f43256zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f43257zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final b f43258zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static final b f43259zzl;
    private static final b zzm;
    private static final b zzn;
    private static final b zzo;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43249zzb = new b("appId", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43250zzc = new b("appVersion", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43251zzd = new b("firebaseProjectId", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f43252zze = new b("mlSdkVersion", v0.a.r(map4));
        zzai zzaiVarK5 = a.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        f43253zzf = new b("tfliteSchemaVersion", v0.a.r(map5));
        zzai zzaiVarK6 = a.k(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarK6.annotationType(), zzaiVarK6);
        f43254zzg = new b("gcmSenderId", v0.a.r(map6));
        zzai zzaiVarK7 = a.k(7);
        HashMap map7 = new HashMap();
        map7.put(zzaiVarK7.annotationType(), zzaiVarK7);
        f43255zzh = new b("apiKey", v0.a.r(map7));
        zzai zzaiVarK8 = a.k(8);
        HashMap map8 = new HashMap();
        map8.put(zzaiVarK8.annotationType(), zzaiVarK8);
        f43256zzi = new b("languages", v0.a.r(map8));
        zzai zzaiVarK9 = a.k(9);
        HashMap map9 = new HashMap();
        map9.put(zzaiVarK9.annotationType(), zzaiVarK9);
        f43257zzj = new b("mlSdkInstanceId", v0.a.r(map9));
        zzai zzaiVarK10 = a.k(10);
        HashMap map10 = new HashMap();
        map10.put(zzaiVarK10.annotationType(), zzaiVarK10);
        f43258zzk = new b("isClearcutClient", v0.a.r(map10));
        zzai zzaiVarK11 = a.k(11);
        HashMap map11 = new HashMap();
        map11.put(zzaiVarK11.annotationType(), zzaiVarK11);
        f43259zzl = new b("isStandaloneMlkit", v0.a.r(map11));
        zzai zzaiVarK12 = a.k(12);
        HashMap map12 = new HashMap();
        map12.put(zzaiVarK12.annotationType(), zzaiVarK12);
        zzm = new b("isJsonLogging", v0.a.r(map12));
        zzai zzaiVarK13 = a.k(13);
        HashMap map13 = new HashMap();
        map13.put(zzaiVarK13.annotationType(), zzaiVarK13);
        zzn = new b("buildLevel", v0.a.r(map13));
        zzai zzaiVarK14 = a.k(14);
        HashMap map14 = new HashMap();
        map14.put(zzaiVarK14.annotationType(), zzaiVarK14);
        zzo = new b("optionalModuleVersion", v0.a.r(map14));
    }

    private zzgu() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzla zzlaVar = (zzla) obj2;
        d dVar = (d) obj3;
        dVar.add(f43249zzb, zzlaVar.zzg());
        dVar.add(f43250zzc, zzlaVar.zzh());
        dVar.add(f43251zzd, (Object) null);
        dVar.add(f43252zze, zzlaVar.zzj());
        dVar.add(f43253zzf, zzlaVar.zzk());
        dVar.add(f43254zzg, (Object) null);
        dVar.add(f43255zzh, (Object) null);
        dVar.add(f43256zzi, zzlaVar.zza());
        dVar.add(f43257zzj, zzlaVar.zzi());
        dVar.add(f43258zzk, zzlaVar.zzb());
        dVar.add(f43259zzl, zzlaVar.zzd());
        dVar.add(zzm, zzlaVar.zzc());
        dVar.add(zzn, zzlaVar.zze());
        dVar.add(zzo, zzlaVar.zzf());
    }
}
