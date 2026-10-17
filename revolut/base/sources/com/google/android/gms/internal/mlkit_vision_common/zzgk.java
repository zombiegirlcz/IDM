package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzgk implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgk f43194zza = new zzgk();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43195zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43196zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43197zzd;

    static {
        zzai zzaiVarK = a.k(3);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f43195zzb = new b("languageOption", v0.a.r(map));
        zzai zzaiVarK2 = a.k(4);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f43196zzc = new b("isUsingLegacyApi", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(5);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f43197zzd = new b("sdkVersion", v0.a.r(map3));
    }

    private zzgk() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
