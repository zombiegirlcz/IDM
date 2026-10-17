package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zznc implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zznc f42204zza = new zznc();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42205zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42206zzc;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42205zzb = new b("language", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42206zzc = new b("errorCode", v0.a.r(map2));
    }

    private zznc() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
