package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzlx implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzlx f42036zza = new zzlx();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42037zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42038zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42039zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42040zze;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42037zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42038zzc = new b("options", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42039zzd = new b("identifyLanguageResult", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f42040zze = new b("identifyPossibleLanguagesResult", v0.a.r(map4));
    }

    private zzlx() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
