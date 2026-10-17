package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzgh implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgh f43186zza = new zzgh();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43187zzb;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43187zzb = new b("confidence", v0.a.r(map));
    }

    private zzgh() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
