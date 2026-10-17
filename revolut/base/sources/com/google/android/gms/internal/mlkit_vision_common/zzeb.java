package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzeb implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzeb f42919zza = new zzeb();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42920zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42921zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42922zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42923zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42924zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f42925zzg;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42920zzb = new b("mode", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42921zzc = new b("landmark", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42922zzd = new b("classification", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f42923zze = new b("prominentFaceOnly", v0.a.r(map4));
        zzai zzaiVarK5 = a.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        f42924zzf = new b("tracking", v0.a.r(map5));
        zzai zzaiVarK6 = a.k(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarK6.annotationType(), zzaiVarK6);
        f42925zzg = new b("minFaceSize", v0.a.r(map6));
    }

    private zzeb() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
