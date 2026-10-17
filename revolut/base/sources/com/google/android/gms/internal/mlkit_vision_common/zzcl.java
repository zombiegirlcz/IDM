package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzcl implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcl f42731zza = new zzcl();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42732zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42733zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42734zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42735zze;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42732zzb = new b("errorCode", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42733zzc = new b("imageInfo", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42734zzd = new b("isColdCall", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f42735zze = new b("options", v0.a.r(map4));
    }

    private zzcl() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
