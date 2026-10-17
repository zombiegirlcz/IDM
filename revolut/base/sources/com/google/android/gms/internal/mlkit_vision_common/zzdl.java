package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzdl implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzdl f42844zza = new zzdl();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42845zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42846zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42847zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42848zze;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42845zzb = new b("callingSource", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42846zzc = new b("supportedFormats", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42847zzd = new b("durationMs", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f42848zze = new b("errorCode", v0.a.r(map4));
    }

    private zzdl() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
