package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzlm implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzlm f44790zza = new zzlm();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44791zzb;

    static {
        zzcx zzcxVarL = a.l(1);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44791zzb = new b("errorCode", v0.a.r(map));
    }

    private zzlm() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        ((d) obj3).add(f44791zzb, ((zzrw) obj2).zza());
    }
}
