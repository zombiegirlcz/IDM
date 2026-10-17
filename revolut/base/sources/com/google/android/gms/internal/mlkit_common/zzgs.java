package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgs implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgs f40908zza = new zzgs();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f40909zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f40910zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f40911zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f40912zze;

    static {
        zzbc zzbcVarI = a.i(1);
        HashMap map = new HashMap();
        map.put(zzbcVarI.annotationType(), zzbcVarI);
        f40909zzb = new b("modelInfo", v0.a.r(map));
        zzbc zzbcVarI2 = a.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarI2.annotationType(), zzbcVarI2);
        f40910zzc = new b("initialDownloadConditions", v0.a.r(map2));
        zzbc zzbcVarI3 = a.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarI3.annotationType(), zzbcVarI3);
        f40911zzd = new b("updateDownloadConditions", v0.a.r(map3));
        zzbc zzbcVarI4 = a.i(4);
        HashMap map4 = new HashMap();
        map4.put(zzbcVarI4.annotationType(), zzbcVarI4);
        f40912zze = new b("isModelUpdateEnabled", v0.a.r(map4));
    }

    private zzgs() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        d dVar = (d) obj3;
        dVar.add(f40909zzb, ((zznl) obj2).zza());
        dVar.add(f40910zzc, (Object) null);
        dVar.add(f40911zzd, (Object) null);
        dVar.add(f40912zze, (Object) null);
    }
}
