package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes23.dex */
public final class g0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f36222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36223b;

    private g0(c0 c0Var, e4m.e eVar) {
        this.f36222a = c0Var;
        this.f36223b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CameraManager get() {
        return a(this.f36222a, (Context) this.f36223b.get());
    }

    public static g0 a(c0 c0Var, e4m.e eVar) {
        return new g0(c0Var, eVar);
    }

    public static CameraManager a(c0 c0Var, Context context) {
        CameraManager cameraManagerProvideCameraManager = c0Var.provideCameraManager(context);
        vc.s.k(cameraManagerProvideCameraManager);
        return cameraManagerProvideCameraManager;
    }
}
