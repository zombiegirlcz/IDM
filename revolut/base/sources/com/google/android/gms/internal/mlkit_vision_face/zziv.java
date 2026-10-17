package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zziv implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zziv f44179zza = new zziv();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44180zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44181zzc;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f44180zzb = new b("result", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f44181zzc = new b("ok", v0.a.r(map2));
    }

    private zziv() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
