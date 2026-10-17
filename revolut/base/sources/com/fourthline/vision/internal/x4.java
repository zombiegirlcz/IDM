package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes23.dex */
public abstract class x4 implements e4m.e {
    public static w5 a(o3 o3Var, TimestampProvider timestampProvider, oa oaVar) {
        w5 w5VarProvideTimeoutFactory = o3Var.provideTimeoutFactory(timestampProvider, oaVar);
        vc.s.k(w5VarProvideTimeoutFactory);
        return w5VarProvideTimeoutFactory;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
