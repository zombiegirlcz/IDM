package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzmm implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzmm f42112zza = new zzmm();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42113zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42114zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42115zzd;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f42113zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f42114zzc = new b("imageInfo", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f42115zzd = new b("recognizerOptions", v0.a.r(map3));
    }

    private zzmm() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
