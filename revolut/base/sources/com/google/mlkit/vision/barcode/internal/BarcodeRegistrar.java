package com.google.mlkit.vision.barcode.internal;

import ce.a;
import ce.b;
import ce.n;
import ch.d;
import ch.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcv;
import com.google.firebase.components.ComponentRegistrar;
import hh.c;
import hh.e;
import hh.f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a aVarB = b.b(f.class);
        aVarB.a(n.c(h.class));
        aVarB.f = c.f152198b;
        b bVarB = aVarB.b();
        a aVarB2 = b.b(e.class);
        aVarB2.a(n.c(f.class));
        aVarB2.a(n.c(d.class));
        aVarB2.a(n.c(h.class));
        aVarB2.f = c.f152199c;
        return zzcv.zzh(bVarB, aVarB2.b());
    }
}
