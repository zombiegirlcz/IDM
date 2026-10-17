package com.google.mlkit.vision.text.internal;

import ce.a;
import ce.b;
import ce.n;
import ch.d;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import nd.k;
import nd.l;
import rh.g;
import rh.h;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a aVarB = b.b(h.class);
        aVarB.a(n.c(ch.h.class));
        aVarB.f = new k(9);
        b bVarB = aVarB.b();
        a aVarB2 = b.b(g.class);
        aVarB2.a(n.c(h.class));
        aVarB2.a(n.c(d.class));
        aVarB2.f = new l();
        return zzbk.zzi(bVarB, aVarB2.b());
    }
}
