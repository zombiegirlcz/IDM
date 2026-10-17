package com.fourthline.vision.internal;

import android.hardware.camera2.CameraManager;
import android.view.Display;

/* JADX INFO: loaded from: classes23.dex */
public final class f0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f36152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36154c;
    private final e4m.e d;

    private f0(c0 c0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f36152a = c0Var;
        this.f36153b = eVar;
        this.f36154c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return a(this.f36152a, (CameraManager) this.f36153b.get(), (Display) this.f36154c.get(), (la) this.d.get());
    }

    public static f0 a(c0 c0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new f0(c0Var, eVar, eVar2, eVar3);
    }

    public static b0 a(c0 c0Var, CameraManager cameraManager, Display display, la laVar) {
        b0 b0VarProvideCameraInfoProvider = c0Var.provideCameraInfoProvider(cameraManager, display, laVar);
        vc.s.k(b0VarProvideCameraInfoProvider);
        return b0VarProvideCameraInfoProvider;
    }
}
