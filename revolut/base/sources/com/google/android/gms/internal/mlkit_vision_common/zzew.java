package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzew implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzew f43035zza = new zzew();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43036zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43037zzc;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43036zzb = new b("deviceInfos", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43037zzc = new b("errorInfo", v0.a.r(map2));
    }

    private zzew() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
