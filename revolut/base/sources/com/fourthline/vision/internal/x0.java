package com.fourthline.vision.internal;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public final class x0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f37089a;

    private x0(s0 s0Var) {
        this.f37089a = s0Var;
    }

    public static CoroutineContext b(s0 s0Var) {
        CoroutineContext coroutineContextProvideCoroutineContext = s0Var.provideCoroutineContext();
        vc.s.k(coroutineContextProvideCoroutineContext);
        return coroutineContextProvideCoroutineContext;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CoroutineContext get() {
        return b(this.f37089a);
    }

    public static x0 a(s0 s0Var) {
        return new x0(s0Var);
    }
}
