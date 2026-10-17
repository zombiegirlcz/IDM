package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzex implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzex f43038zza = new zzex();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43039zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43040zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43041zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43042zze;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43039zzb = new b("category", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43040zzc = new b("classificationConfidence", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43041zzd = new b("trackingId", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f43042zze = new b("labelCount", v0.a.r(map4));
    }

    private zzex() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
