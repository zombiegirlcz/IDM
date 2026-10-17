package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzey implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzey f43043zza = new zzey();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43044zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43045zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43046zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43047zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f43048zzf;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43044zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43045zzc = new b("options", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43046zzd = new b("detectedBarcodeFormats", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f43047zze = new b("detectedBarcodeValueTypes", v0.a.r(map4));
        zzai zzaiVarK5 = a.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        f43048zzf = new b("imageInfo", v0.a.r(map5));
    }

    private zzey() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
