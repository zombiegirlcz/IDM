package com.fourthline.vision.internal;

import android.hardware.camera2.CameraManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes23.dex */
public final class d0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f36089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36091c;
    private final e4m.e d;

    private d0(c0 c0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f36089a = c0Var;
        this.f36090b = eVar;
        this.f36091c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s get() {
        return a(this.f36089a, (CameraManager) this.f36090b.get(), (Handler) this.f36091c.get(), (b0) this.d.get());
    }

    public static d0 a(c0 c0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new d0(c0Var, eVar, eVar2, eVar3);
    }

    public static s a(c0 c0Var, CameraManager cameraManager, Handler handler, b0 b0Var) {
        s sVarProvideCamera2 = c0Var.provideCamera2(cameraManager, handler, b0Var);
        vc.s.k(sVarProvideCamera2);
        return sVarProvideCamera2;
    }
}
