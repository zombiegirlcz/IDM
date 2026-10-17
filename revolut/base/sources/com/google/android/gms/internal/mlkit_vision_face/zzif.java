package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzif implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzif f44098zza = new zzif();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44099zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44100zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44101zzd;

    static {
        zzcu zzcuVarD = a.d(3);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f44099zzb = new b("languageOption", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(4);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f44100zzc = new b("isUsingLegacyApi", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(5);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f44101zzd = new b("sdkVersion", v0.a.r(map3));
    }

    private zzif() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
