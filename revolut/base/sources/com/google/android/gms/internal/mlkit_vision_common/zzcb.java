package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzcb implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcb f42686zza = new zzcb();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42687zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42688zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42689zzd;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42687zzb = new b("errorCode", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42688zzc = new b("imageInfo", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42689zzd = new b("isColdCall", v0.a.r(map3));
    }

    private zzcb() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
