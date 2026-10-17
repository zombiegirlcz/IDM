package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzlo implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzlo f44796zza = new zzlo();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44797zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44798zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44799zzd;

    static {
        zzcx zzcxVarL = a.l(3);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44797zzb = new b("languageOption", v0.a.r(map));
        zzcx zzcxVarL2 = a.l(4);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarL2.annotationType(), zzcxVarL2);
        f44798zzc = new b("isUsingLegacyApi", v0.a.r(map2));
        zzcx zzcxVarL3 = a.l(5);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarL3.annotationType(), zzcxVarL3);
        f44799zzd = new b("sdkVersion", v0.a.r(map3));
    }

    private zzlo() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        d dVar = (d) obj3;
        dVar.add(f44797zzb, ((zzsd) obj2).zza());
        dVar.add(f44798zzc, (Object) null);
        dVar.add(f44799zzd, (Object) null);
    }
}
