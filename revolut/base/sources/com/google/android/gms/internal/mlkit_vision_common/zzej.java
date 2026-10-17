package com.google.android.gms.internal.mlkit_vision_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzej implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzej f42962zza = new zzej();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f42963zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f42964zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f42965zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f42966zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f42967zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final b f42968zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final b f42969zzh;

    static {
        zzai zzaiVarK = a.k(1);
        HashMap map = new HashMap();
        map.put(zzaiVarK.annotationType(), zzaiVarK);
        f42963zzb = new b("durationMs", v0.a.r(map));
        zzai zzaiVarK2 = a.k(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarK2.annotationType(), zzaiVarK2);
        f42964zzc = new b("imageSource", v0.a.r(map2));
        zzai zzaiVarK3 = a.k(3);
        HashMap map3 = new HashMap();
        map3.put(zzaiVarK3.annotationType(), zzaiVarK3);
        f42965zzd = new b("imageFormat", v0.a.r(map3));
        zzai zzaiVarK4 = a.k(4);
        HashMap map4 = new HashMap();
        map4.put(zzaiVarK4.annotationType(), zzaiVarK4);
        f42966zze = new b("imageByteSize", v0.a.r(map4));
        zzai zzaiVarK5 = a.k(5);
        HashMap map5 = new HashMap();
        map5.put(zzaiVarK5.annotationType(), zzaiVarK5);
        f42967zzf = new b("imageWidth", v0.a.r(map5));
        zzai zzaiVarK6 = a.k(6);
        HashMap map6 = new HashMap();
        map6.put(zzaiVarK6.annotationType(), zzaiVarK6);
        f42968zzg = new b("imageHeight", v0.a.r(map6));
        zzai zzaiVarK7 = a.k(7);
        HashMap map7 = new HashMap();
        map7.put(zzaiVarK7.annotationType(), zzaiVarK7);
        f42969zzh = new b("rotationDegrees", v0.a.r(map7));
    }

    private zzej() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zziq zziqVar = (zziq) obj2;
        d dVar = (d) obj3;
        dVar.add(f42963zzb, zziqVar.zzg());
        dVar.add(f42964zzc, zziqVar.zzb());
        dVar.add(f42965zzd, zziqVar.zza());
        dVar.add(f42966zze, zziqVar.zzc());
        dVar.add(f42967zzf, zziqVar.zze());
        dVar.add(f42968zzg, zziqVar.zzd());
        dVar.add(f42969zzh, zziqVar.zzf());
    }
}
