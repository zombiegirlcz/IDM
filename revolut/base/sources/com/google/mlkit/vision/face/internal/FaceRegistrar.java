package com.google.mlkit.vision.face.internal;

import ce.a;
import ce.b;
import ce.n;
import ch.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import oh.d;
import oh.e;
import oh.j;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a aVarB = b.b(e.class);
        aVarB.a(n.c(h.class));
        aVarB.f = j.f225261b;
        b bVarB = aVarB.b();
        a aVarB2 = b.b(d.class);
        aVarB2.a(n.c(e.class));
        aVarB2.a(n.c(ch.d.class));
        aVarB2.f = j.f225262c;
        return zzbn.zzi(bVarB, aVarB2.b());
    }
}
