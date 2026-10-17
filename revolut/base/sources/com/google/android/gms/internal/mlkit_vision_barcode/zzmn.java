package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzmn implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzmn f42116zza = new zzmn();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42117zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42118zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42119zzd;

    static {
        zzfg zzfgVarD = d.d(3);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42117zzb = new b("languageOption", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(4);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42118zzc = new b("isUsingLegacyApi", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(5);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42119zzd = new b("sdkVersion", v0.a.r(map3));
    }

    private zzmn() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
