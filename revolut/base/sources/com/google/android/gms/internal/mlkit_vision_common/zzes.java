package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzes implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzes f43019zza = new zzes();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43020zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43021zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43022zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43023zze;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43020zzb = new b("isChargingRequired", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43021zzc = new b("isWifiRequired", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43022zzd = new b("isDeviceIdleRequired", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f43023zze = new b("canDownloadInBackground", v0.a.r(map4));
    }

    private zzes() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
