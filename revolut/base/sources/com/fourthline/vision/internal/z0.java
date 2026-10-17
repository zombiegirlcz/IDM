package com.fourthline.vision.internal;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes23.dex */
public final class z0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f37176a;

    private z0(s0 s0Var) {
        this.f37176a = s0Var;
    }

    public static HandlerThread b(s0 s0Var) {
        HandlerThread handlerThreadProvideHandlerThread = s0Var.provideHandlerThread();
        vc.s.k(handlerThreadProvideHandlerThread);
        return handlerThreadProvideHandlerThread;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HandlerThread get() {
        return b(this.f37176a);
    }

    public static z0 a(s0 s0Var) {
        return new z0(s0Var);
    }
}
