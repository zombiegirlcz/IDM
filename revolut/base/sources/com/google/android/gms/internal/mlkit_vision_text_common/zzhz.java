package com.google.android.gms.internal.mlkit_vision_text_common;

import ch.qos.logback.core.util.a;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes16.dex */
final class zzhz implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzhz f44663zza = new zzhz();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f44664zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f44665zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f44666zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f44667zze;

    static {
        zzcx zzcxVarL = a.l(1);
        HashMap map = new HashMap();
        map.put(zzcxVarL.annotationType(), zzcxVarL);
        f44664zzb = new b("imageFormat", v0.a.r(map));
        zzcx zzcxVarL2 = a.l(2);
        HashMap map2 = new HashMap();
        map2.put(zzcxVarL2.annotationType(), zzcxVarL2);
        f44665zzc = new b("originalImageSize", v0.a.r(map2));
        zzcx zzcxVarL3 = a.l(3);
        HashMap map3 = new HashMap();
        map3.put(zzcxVarL3.annotationType(), zzcxVarL3);
        f44666zzd = new b("compressedImageSize", v0.a.r(map3));
        zzcx zzcxVarL4 = a.l(4);
        HashMap map4 = new HashMap();
        map4.put(zzcxVarL4.annotationType(), zzcxVarL4);
        f44667zze = new b("isOdmlImage", v0.a.r(map4));
    }

    private zzhz() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzod zzodVar = (zzod) obj2;
        d dVar = (d) obj3;
        dVar.add(f44664zzb, zzodVar.zza());
        dVar.add(f44665zzc, zzodVar.zzb());
        dVar.add(f44666zzd, (Object) null);
        dVar.add(f44667zze, (Object) null);
    }
}
