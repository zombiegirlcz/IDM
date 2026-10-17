package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzek implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzek f42970zza = new zzek();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42971zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42972zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42973zzd;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42971zzb = new b("modelType", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42972zzc = new b("isDownloaded", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42973zzd = new b("modelName", v0.a.r(map3));
    }

    private zzek() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
