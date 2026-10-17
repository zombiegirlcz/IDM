package com.fourthline.vision.internal;

import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes23.dex */
public final class k1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f36438a;

    private k1(s0 s0Var) {
        this.f36438a = s0Var;
    }

    public static SensorManager b(s0 s0Var) {
        SensorManager sensorManagerProvideSensorManager = s0Var.provideSensorManager();
        vc.s.k(sensorManagerProvideSensorManager);
        return sensorManagerProvideSensorManager;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SensorManager get() {
        return b(this.f36438a);
    }

    public static k1 a(s0 s0Var) {
        return new k1(s0Var);
    }
}
