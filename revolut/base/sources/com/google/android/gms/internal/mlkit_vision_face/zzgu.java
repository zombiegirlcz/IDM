package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzgu implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgu f43943zza = new zzgu();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43944zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43945zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43946zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43947zze;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43944zzb = new b("isChargingRequired", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43945zzc = new b("isWifiRequired", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43946zzd = new b("isDeviceIdleRequired", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43947zze = new b("canDownloadInBackground", v0.a.r(map4));
    }

    private zzgu() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
