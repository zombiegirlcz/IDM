package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes23.dex */
public abstract class u3 implements e4m.e {
    public static l3 a(o3 o3Var, TimestampProvider timestampProvider) {
        l3 l3VarProvideDocumentExpirationDateValidator$fourthline_vision_release = o3Var.provideDocumentExpirationDateValidator$fourthline_vision_release(timestampProvider);
        vc.s.k(l3VarProvideDocumentExpirationDateValidator$fourthline_vision_release);
        return l3VarProvideDocumentExpirationDateValidator$fourthline_vision_release;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
