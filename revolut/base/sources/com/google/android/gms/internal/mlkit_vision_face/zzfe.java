package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzfe implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzfe f43722zza = new zzfe();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43723zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43724zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43725zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43726zze;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43723zzb = new b("remoteModelOptions", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43724zzc = new b("localModelOptions", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43725zzd = new b("errorCodes", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43726zze = new b("modelInitializationMs", v0.a.r(map4));
    }

    private zzfe() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
