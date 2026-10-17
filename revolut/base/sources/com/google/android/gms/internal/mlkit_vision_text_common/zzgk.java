package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgk implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgk f44611zza = new zzgk();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44612zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44613zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44614zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f44615zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final b f44616zzf;

    static {
        zzcx zzcxVarL = a.l(1);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44612zzb = new b("errorCode", v0.a.r(map));
        zzcx zzcxVarL2 = a.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarL2.annotationType(), zzcxVarL2);
        f44613zzc = new b("hasResult", v0.a.r(map2));
        zzcx zzcxVarL3 = a.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarL3.annotationType(), zzcxVarL3);
        f44614zzd = new b("isColdCall", v0.a.r(map3));
        zzcx zzcxVarL4 = a.l(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarL4.annotationType(), zzcxVarL4);
        f44615zze = new b("imageInfo", v0.a.r(map4));
        zzcx zzcxVarL5 = a.l(5);
        HashMap map5 = new HashMap();
        map5.put(zzcxVarL5.annotationType(), zzcxVarL5);
        f44616zzf = new b("recognizerOptions", v0.a.r(map5));
    }

    private zzgk() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzes zzesVar = (zzes) obj2;
        d dVar = (d) obj3;
        dVar.add(f44612zzb, zzesVar.zza());
        dVar.add(f44613zzc, (Object) null);
        dVar.add(f44614zzd, zzesVar.zzc());
        dVar.add(f44615zze, (Object) null);
        dVar.add(f44616zzf, zzesVar.zzb());
    }
}
