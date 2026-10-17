package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzfw implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzfw f43797zza = new zzfw();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43798zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43799zzc;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43798zzb = new b("options", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43799zzc = new b("errorCode", v0.a.r(map2));
    }

    private zzfw() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
