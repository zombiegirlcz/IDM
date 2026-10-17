package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzic implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzic f44090zza = new zzic();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44091zzb;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f44091zzb = new b("confidence", v0.a.r(map));
    }

    private zzic() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
