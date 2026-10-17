package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzcp implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcp f42750zza = new zzcp();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42751zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42752zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42753zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42754zze;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42751zzb = new b("errorCode", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42752zzc = new b("isColdCall", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42753zzd = new b("imageInfo", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f42754zze = new b("detectorOptions", v0.a.r(map4));
    }

    private zzcp() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
