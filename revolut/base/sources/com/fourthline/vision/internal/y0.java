package com.fourthline.vision.internal;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes23.dex */
public final class y0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f37127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f37128b;

    private y0(s0 s0Var, e4m.e eVar) {
        this.f37127a = s0Var;
        this.f37128b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Handler get() {
        return a(this.f37127a, (HandlerThread) this.f37128b.get());
    }

    public static y0 a(s0 s0Var, e4m.e eVar) {
        return new y0(s0Var, eVar);
    }

    public static Handler a(s0 s0Var, HandlerThread handlerThread) {
        Handler handlerProvideHandler = s0Var.provideHandler(handlerThread);
        vc.s.k(handlerProvideHandler);
        return handlerProvideHandler;
    }
}
