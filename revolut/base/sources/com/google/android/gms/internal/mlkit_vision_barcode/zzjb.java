package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzjb implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzjb f41693zza = new zzjb();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41694zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41695zzc;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41694zzb = new b("detectorOptions", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41695zzc = new b("errorCode", v0.a.r(map2));
    }

    private zzjb() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
