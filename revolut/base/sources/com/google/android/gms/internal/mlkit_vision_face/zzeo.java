package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes.dex */
final class zzeo implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzeo f43635zza = new zzeo();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43636zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43637zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43638zzd;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43636zzb = new b("logEventKey", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43637zzc = new b("eventCount", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43638zzd = new b("inferenceDurationStats", v0.a.r(map3));
    }

    private zzeo() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzdp zzdpVar = (zzdp) obj2;
        d dVar = (d) obj3;
        dVar.add(f43636zzb, zzdpVar.zza());
        dVar.add(f43637zzc, zzdpVar.zzc());
        dVar.add(f43638zzd, zzdpVar.zzb());
    }
}
