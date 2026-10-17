package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzln implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzln f44792zza = new zzln();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44793zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44794zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44795zzd;

    static {
        zzcx zzcxVarL = a.l(1);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44793zzb = new b("inferenceCommonLogEvent", v0.a.r(map));
        zzcx zzcxVarL2 = a.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarL2.annotationType(), zzcxVarL2);
        f44794zzc = new b("imageInfo", v0.a.r(map2));
        zzcx zzcxVarL3 = a.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarL3.annotationType(), zzcxVarL3);
        f44795zzd = new b("recognizerOptions", v0.a.r(map3));
    }

    private zzln() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzrz zzrzVar = (zzrz) obj2;
        d dVar = (d) obj3;
        dVar.add(f44793zzb, zzrzVar.zzb());
        dVar.add(f44794zzc, zzrzVar.zza());
        dVar.add(f44795zzd, zzrzVar.zzc());
    }
}
