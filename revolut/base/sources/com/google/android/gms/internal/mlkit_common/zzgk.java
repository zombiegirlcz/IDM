package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgk implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgk f40872zza = new zzgk();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f40873zzb;

    static {
        zzbc zzbcVarI = a.i(1);
        HashMap map = new HashMap();
        map.put(zzbcVarI.annotationType(), zzbcVarI);
        f40873zzb = new b("api", v0.a.r(map));
    }

    private zzgk() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        ((d) obj3).add(f40873zzb, ((zzmp) obj2).zza());
    }
}
