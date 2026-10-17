package com.fourthline.vision.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class w0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f37042a;

    private w0(s0 s0Var) {
        this.f37042a = s0Var;
    }

    public static Context b(s0 s0Var) {
        Context contextProvideContext = s0Var.provideContext();
        vc.s.k(contextProvideContext);
        return contextProvideContext;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return b(this.f37042a);
    }

    public static w0 a(s0 s0Var) {
        return new w0(s0Var);
    }
}
