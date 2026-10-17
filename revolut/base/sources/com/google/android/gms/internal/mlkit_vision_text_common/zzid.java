package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzid implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzid f44671zza = new zzid();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44672zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44673zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44674zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f44675zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f44676zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f44677zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f44678zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final b f44679zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final b f44680zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private static final b f44681zzk;

    static {
        zzcx zzcxVarL = a.l(1);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44672zzb = new b("durationMs", v0.a.r(map));
        zzcx zzcxVarL2 = a.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarL2.annotationType(), zzcxVarL2);
        f44673zzc = new b("errorCode", v0.a.r(map2));
        zzcx zzcxVarL3 = a.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarL3.annotationType(), zzcxVarL3);
        f44674zzd = new b("isColdCall", v0.a.r(map3));
        zzcx zzcxVarL4 = a.l(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarL4.annotationType(), zzcxVarL4);
        f44675zze = new b("autoManageModelOnBackground", v0.a.r(map4));
        zzcx zzcxVarL5 = a.l(5);
        HashMap map5 = new HashMap();
        map5.put(zzcxVarL5.annotationType(), zzcxVarL5);
        f44676zzf = new b("autoManageModelOnLowMemory", v0.a.r(map5));
        zzcx zzcxVarL6 = a.l(6);
        HashMap map6 = new HashMap();
        map6.put(zzcxVarL6.annotationType(), zzcxVarL6);
        f44677zzg = new b("isNnApiEnabled", v0.a.r(map6));
        zzcx zzcxVarL7 = a.l(7);
        HashMap map7 = new HashMap();
        map7.put(zzcxVarL7.annotationType(), zzcxVarL7);
        f44678zzh = new b("eventsCount", v0.a.r(map7));
        zzcx zzcxVarL8 = a.l(8);
        HashMap map8 = new HashMap();
        map8.put(zzcxVarL8.annotationType(), zzcxVarL8);
        f44679zzi = new b("otherErrors", v0.a.r(map8));
        zzcx zzcxVarL9 = a.l(9);
        HashMap map9 = new HashMap();
        map9.put(zzcxVarL9.annotationType(), zzcxVarL9);
        f44680zzj = new b("remoteConfigValueForAcceleration", v0.a.r(map9));
        zzcx zzcxVarL10 = a.l(10);
        HashMap map10 = new HashMap();
        map10.put(zzcxVarL10.annotationType(), zzcxVarL10);
        f44681zzk = new b("isAccelerated", v0.a.r(map10));
    }

    private zzid() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzoj zzojVar = (zzoj) obj2;
        d dVar = (d) obj3;
        dVar.add(f44672zzb, zzojVar.zze());
        dVar.add(f44673zzc, zzojVar.zza());
        dVar.add(f44674zzd, zzojVar.zzd());
        dVar.add(f44675zze, zzojVar.zzb());
        dVar.add(f44676zzf, zzojVar.zzc());
        dVar.add(f44677zzg, (Object) null);
        dVar.add(f44678zzh, (Object) null);
        dVar.add(f44679zzi, (Object) null);
        dVar.add(f44680zzj, (Object) null);
        dVar.add(f44681zzk, (Object) null);
    }
}
