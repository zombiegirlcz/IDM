package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzga implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzga f43148zza = new zzga();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43149zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43150zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43151zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43152zze;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43149zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43150zzc = new b("imageInfo", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43151zzd = new b("detectorOptions", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f43152zze = new b("objectInfos", v0.a.r(map4));
    }

    private zzga() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
