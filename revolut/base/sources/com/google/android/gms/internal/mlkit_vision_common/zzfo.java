package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzfo implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzfo f43103zza = new zzfo();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43104zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43105zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43106zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43107zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f43108zzf;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43104zzb = new b("detectorOptions", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43105zzc = new b("errorCodes", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43106zzd = new b("totalInitializationMs", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f43107zze = new b("loggingInitializationMs", v0.a.r(map4));
        zzai zzaiVarK5 = a.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        f43108zzf = new b("otherErrors", v0.a.r(map5));
    }

    private zzfo() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
