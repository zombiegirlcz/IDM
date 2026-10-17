package com.google.android.gms.internal.mlkit_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgh implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgh f40866zza = new zzgh();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f40867zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f40868zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f40869zzd;

    static {
        zzbc zzbcVarI = a.i(1);
        HashMap map = new HashMap();
        map.put(zzbcVarI.annotationType(), zzbcVarI);
        f40867zzb = new b("modelType", v0.a.r(map));
        zzbc zzbcVarI2 = a.i(2);
        HashMap map2 = new HashMap();
        map2.put(zzbcVarI2.annotationType(), zzbcVarI2);
        f40868zzc = new b("isDownloaded", v0.a.r(map2));
        zzbc zzbcVarI3 = a.i(3);
        HashMap map3 = new HashMap();
        map3.put(zzbcVarI3.annotationType(), zzbcVarI3);
        f40869zzd = new b("modelName", v0.a.r(map3));
    }

    private zzgh() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzmj zzmjVar = (zzmj) obj2;
        d dVar = (d) obj3;
        dVar.add(f40867zzb, zzmjVar.zza());
        dVar.add(f40868zzc, zzmjVar.zzb());
        dVar.add(f40869zzd, (Object) null);
    }
}
