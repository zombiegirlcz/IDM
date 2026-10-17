package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzgv implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgv f43260zza = new zzgv();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43261zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43262zzc;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43261zzb = new b("errorCode", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43262zzc = new b("textDetectionOptions", v0.a.r(map2));
    }

    private zzgv() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
