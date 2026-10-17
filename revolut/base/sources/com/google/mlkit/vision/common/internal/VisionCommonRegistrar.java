package com.google.mlkit.vision.common.internal;

import ce.a;
import ce.b;
import ce.n;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import jh.d;
import jh.e;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a aVarB = b.b(e.class);
        aVarB.a(new n(d.class, 2, 0));
        aVarB.f = e.f174107b;
        return zzp.zzi(aVarB.b());
    }
}
