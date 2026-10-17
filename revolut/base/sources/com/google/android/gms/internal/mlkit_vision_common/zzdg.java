package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzdg implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzdg f42824zza = new zzdg();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42825zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42826zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42827zzd;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42825zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42826zzc = new b("options", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42827zzd = new b("imageInfo", v0.a.r(map3));
    }

    private zzdg() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
