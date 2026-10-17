package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes16.dex */
final class zzcz implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcz f42794zza = new zzcz();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42795zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42796zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42797zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42798zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42799zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f42800zzg;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42795zzb = new b("cameraSource", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42796zzc = new b("eventType", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42797zzd = new b("requestedPreviewHeight", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f42798zze = new b("requestedPreviewWidth", v0.a.r(map4));
        zzai zzaiVarK5 = a.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        f42799zzf = new b("actualPreviewHeight", v0.a.r(map5));
        zzai zzaiVarK6 = a.k(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarK6.annotationType(), zzaiVarK6);
        f42800zzg = new b("actualPreviewWidth", v0.a.r(map6));
    }

    private zzcz() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        throw null;
    }
}
