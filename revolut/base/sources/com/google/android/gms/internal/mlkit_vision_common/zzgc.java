package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzgc implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgc f43159zza = new zzgc();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43160zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43161zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43162zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43163zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f43164zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f43165zzg;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43160zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43161zzc = new b("imageInfo", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43162zzd = new b("detectorOptions", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f43163zze = new b("loadDurationMs", v0.a.r(map4));
        zzai zzaiVarK5 = a.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        f43164zzf = new b("sessionDurationMs", v0.a.r(map5));
        zzai zzaiVarK6 = a.k(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarK6.annotationType(), zzaiVarK6);
        f43165zzg = new b("sessionTotalInferenceDurationMs", v0.a.r(map6));
    }

    private zzgc() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
