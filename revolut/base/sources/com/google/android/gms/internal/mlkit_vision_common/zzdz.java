package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzdz implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzdz f42906zza = new zzdz();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42907zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42908zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42909zzd;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42907zzb = new b("options", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42908zzc = new b("eventType", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42909zzd = new b("errorCode", v0.a.r(map3));
    }

    private zzdz() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
