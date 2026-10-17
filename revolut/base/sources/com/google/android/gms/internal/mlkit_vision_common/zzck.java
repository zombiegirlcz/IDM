package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzck implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzck f42727zza = new zzck();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42728zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42729zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42730zzd;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42728zzb = new b("logEventKey", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42729zzc = new b("eventCount", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42730zzd = new b("inferenceDurationStats", v0.a.r(map3));
    }

    private zzck() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
