package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzjs implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzjs f41773zza = new zzjs();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41774zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41775zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final b f41776zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final b f41777zze;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41774zzb = new b("imageFormat", v0.a.r(map));
        zzfg zzfgVarD2 = d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41775zzc = new b("originalImageSize", v0.a.r(map2));
        zzfg zzfgVarD3 = d.d(3);
        HashMap map3 = new HashMap();
        map3.put(zzfgVarD3.annotationType(), zzfgVarD3);
        f41776zzd = new b("compressedImageSize", v0.a.r(map3));
        zzfg zzfgVarD4 = d.d(4);
        HashMap map4 = new HashMap();
        map4.put(zzfgVarD4.annotationType(), zzfgVarD4);
        f41777zze = new b("isOdmlImage", v0.a.r(map4));
    }

    private zzjs() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        zzos zzosVar = (zzos) obj2;
        ve.d dVar = (ve.d) obj3;
        dVar.add(f41774zzb, zzosVar.zza());
        dVar.add(f41775zzc, zzosVar.zzb());
        dVar.add(f41776zzd, (Object) null);
        dVar.add(f41777zze, (Object) null);
    }
}
