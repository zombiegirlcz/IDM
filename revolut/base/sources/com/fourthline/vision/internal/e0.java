package com.fourthline.vision.internal;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes23.dex */
public final class e0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f36120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36122c;

    private e0(c0 c0Var, e4m.e eVar, e4m.e eVar2) {
        this.f36120a = c0Var;
        this.f36121b = eVar;
        this.f36122c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x get() {
        return a(this.f36120a, (s) this.f36121b.get(), (CoroutineContext) this.f36122c.get());
    }

    public static e0 a(c0 c0Var, e4m.e eVar, e4m.e eVar2) {
        return new e0(c0Var, eVar, eVar2);
    }

    public static x a(c0 c0Var, s sVar, CoroutineContext coroutineContext) {
        x xVarProvideCameraFocusManager = c0Var.provideCameraFocusManager(sVar, coroutineContext);
        vc.s.k(xVarProvideCameraFocusManager);
        return xVarProvideCameraFocusManager;
    }
}
