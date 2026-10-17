package com.google.android.gms.internal.mlkit_vision_barcode;

import a0.d;
import java.io.IOException;
import java.util.HashMap;
import ve.b;
import ve.c;

/* JADX INFO: loaded from: classes.dex */
final class zzim implements c {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzim f41623zza = new zzim();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41624zzb;

    static {
        zzfg zzfgVarD = d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41624zzb = new b("format", v0.a.r(map));
    }

    private zzim() {
    }

    @Override // ve.a
    public final /* bridge */ /* synthetic */ void encode(Object obj2, Object obj3) throws IOException {
        ((ve.d) obj3).add(f41624zzb, ((zzth) obj2).zza());
    }
}
