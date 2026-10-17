package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzea implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzea f42912zza = new zzea();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42913zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42914zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42915zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42916zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42917zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f42918zzg;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42913zzb = new b("landmarkMode", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42914zzc = new b("classificationMode", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42915zzd = new b("performanceMode", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f42916zze = new b("contourMode", v0.a.r(map4));
        zzai zzaiVarK5 = a.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        f42917zzf = new b("isTrackingEnabled", v0.a.r(map5));
        zzai zzaiVarK6 = a.k(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarK6.annotationType(), zzaiVarK6);
        f42918zzg = new b("minFaceSize", v0.a.r(map6));
    }

    private zzea() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
