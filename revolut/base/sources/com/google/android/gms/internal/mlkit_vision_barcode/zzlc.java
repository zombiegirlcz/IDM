package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzlc implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzlc f41956zza = new zzlc();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41957zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41958zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41959zzd;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41957zzb = new b("textEnhancementParam", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41958zzc = new b("autoWhiteBalanceEnabled", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41959zzd = new b("lightnessEnhancementParam", v0.a.r(map3));
    }

    private zzlc() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
