package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes23.dex */
public abstract class u4 implements e4m.e {
    public static p5 a(o3 o3Var, TimestampProvider timestampProvider, t5 t5Var, a9 a9Var) {
        p5 p5VarProvideScannerTimeoutConsumer$fourthline_vision_release = o3Var.provideScannerTimeoutConsumer$fourthline_vision_release(timestampProvider, t5Var, a9Var);
        vc.s.k(p5VarProvideScannerTimeoutConsumer$fourthline_vision_release);
        return p5VarProvideScannerTimeoutConsumer$fourthline_vision_release;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
