package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzjg implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzjg f41714zza = new zzjg();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41715zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41716zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41717zzd;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41715zzb = new b("modelType", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41716zzc = new b("isSuccessful", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41717zzd = new b("modelName", v0.a.r(map3));
    }

    private zzjg() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
