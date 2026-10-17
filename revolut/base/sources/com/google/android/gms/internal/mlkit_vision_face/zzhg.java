package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes.dex */
final class zzhg implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzhg f43996zza = new zzhg();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43997zzb;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43997zzb = new b("errorCode", v0.a.r(map));
    }

    private zzhg() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        ((d) obj3).add(f43997zzb, ((zzlo) obj2).zza());
    }
}
