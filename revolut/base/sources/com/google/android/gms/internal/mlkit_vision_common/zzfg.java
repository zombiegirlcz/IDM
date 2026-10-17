package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzfg implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzfg f43071zza = new zzfg();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43072zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43073zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43074zzd;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43072zzb = new b("detectorOptions", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43073zzc = new b("errorCode", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43074zzd = new b("durationMs", v0.a.r(map3));
    }

    private zzfg() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
