package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzke implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzke f41837zza = new zzke();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41838zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41839zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41840zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41841zze;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41838zzb = new b("options", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41839zzc = new b("latencyMs", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41840zzd = new b("frameCount", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f41841zze = new b("errorCode", v0.a.r(map4));
    }

    private zzke() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
