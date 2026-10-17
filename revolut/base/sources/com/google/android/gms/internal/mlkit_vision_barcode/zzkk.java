package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzkk implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzkk f41880zza = new zzkk();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41881zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41882zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41883zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41884zze;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41881zzb = new b("modelInfo", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41882zzc = new b("initialDownloadConditions", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41883zzd = new b("updateDownloadConditions", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f41884zze = new b("isModelUpdateEnabled", v0.a.r(map4));
    }

    private zzkk() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
