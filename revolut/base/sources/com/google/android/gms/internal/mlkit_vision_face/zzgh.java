package com.google.android.gms.internal.mlkit_vision_face;

import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;
import ve.d;

/* JADX INFO: loaded from: classes.dex */
final class zzgh implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzgh f43863zza = new zzgh();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f43864zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f43865zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f43866zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f43867zze;

    static {
        zzcu zzcuVarD = a.d(1);
        HashMap map = new HashMap();
        map.put(zzcuVarD.annotationType(), zzcuVarD);
        f43864zzb = new b("imageFormat", v0.a.r(map));
        zzcu zzcuVarD2 = a.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzcuVarD2.annotationType(), zzcuVarD2);
        f43865zzc = new b("originalImageSize", v0.a.r(map2));
        zzcu zzcuVarD3 = a.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzcuVarD3.annotationType(), zzcuVarD3);
        f43866zzd = new b("compressedImageSize", v0.a.r(map3));
        zzcu zzcuVarD4 = a.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzcuVarD4.annotationType(), zzcuVarD4);
        f43867zze = new b("isOdmlImage", v0.a.r(map4));
    }

    private zzgh() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzkh zzkhVar = (zzkh) obj2;
        d dVar = (d) obj3;
        dVar.add(f43864zzb, zzkhVar.zza());
        dVar.add(f43865zzc, zzkhVar.zzb());
        dVar.add(f43866zzd, (Object) null);
        dVar.add(f43867zze, (Object) null);
    }
}
