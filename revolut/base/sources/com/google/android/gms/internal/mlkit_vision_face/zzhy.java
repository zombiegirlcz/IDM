package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzhy implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzhy f44074zza = new zzhy();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44075zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44076zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44077zzd;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f44075zzb = new b("detectorOptions", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f44076zzc = new b("errorCode", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f44077zzd = new b("durationMs", v0.a.r(map3));
    }

    private zzhy() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
