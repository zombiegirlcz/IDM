package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzgj implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgj f43190zza = new zzgj();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43191zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43192zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43193zzd;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43191zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43192zzc = new b("imageInfo", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43193zzd = new b("recognizerOptions", v0.a.r(map3));
    }

    private zzgj() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
