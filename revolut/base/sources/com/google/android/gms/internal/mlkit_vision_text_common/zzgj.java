package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzgj implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgj f44607zza = new zzgj();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44608zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44609zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44610zzd;

    static {
        zzcx zzcxVarL = a.l(1);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44608zzb = new b("logEventKey", v0.a.r(map));
        zzcx zzcxVarL2 = a.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarL2.annotationType(), zzcxVarL2);
        f44609zzc = new b("eventCount", v0.a.r(map2));
        zzcx zzcxVarL3 = a.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarL3.annotationType(), zzcxVarL3);
        f44610zzd = new b("inferenceDurationStats", v0.a.r(map3));
    }

    private zzgj() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzeu zzeuVar = (zzeu) obj2;
        d dVar = (d) obj3;
        dVar.add(f44608zzb, zzeuVar.zza());
        dVar.add(f44609zzc, zzeuVar.zzc());
        dVar.add(f44610zzd, zzeuVar.zzb());
    }
}
