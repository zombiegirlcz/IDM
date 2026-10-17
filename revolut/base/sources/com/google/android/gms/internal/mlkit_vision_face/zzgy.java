package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzgy implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgy f43959zza = new zzgy();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43960zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43961zzc;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43960zzb = new b("deviceInfos", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43961zzc = new b("errorInfo", v0.a.r(map2));
    }

    private zzgy() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
