package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzfk implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzfk f40840zza = new zzfk();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f40841zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f40842zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f40843zzd;

    static {
        zzbc zzbcVarI = a.i(1);
        HashMap map = new HashMap();
        map.put(zzbcVarI.annotationType(), zzbcVarI);
        f40841zzb = new b("modelType", v0.a.r(map));
        zzbc zzbcVarI2 = a.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarI2.annotationType(), zzbcVarI2);
        f40842zzc = new b("isSuccessful", v0.a.r(map2));
        zzbc zzbcVarI3 = a.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarI3.annotationType(), zzbcVarI3);
        f40843zzd = new b("modelName", v0.a.r(map3));
    }

    private zzfk() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzlo zzloVar = (zzlo) obj2;
        d dVar = (d) obj3;
        dVar.add(f40841zzb, zzloVar.zza());
        dVar.add(f40842zzc, zzloVar.zzb());
        dVar.add(f40843zzd, (Object) null);
    }
}
