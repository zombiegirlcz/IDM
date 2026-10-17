package com.fourthline.vision.internal;

import androidx.view.result.ActivityResultRegistry;

/* JADX INFO: loaded from: classes23.dex */
public final class t0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f36924a;

    private t0(s0 s0Var) {
        this.f36924a = s0Var;
    }

    public static ActivityResultRegistry b(s0 s0Var) {
        ActivityResultRegistry activityResultRegistryProvideActivityResultRegistry = s0Var.provideActivityResultRegistry();
        vc.s.k(activityResultRegistryProvideActivityResultRegistry);
        return activityResultRegistryProvideActivityResultRegistry;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityResultRegistry get() {
        return b(this.f36924a);
    }

    public static t0 a(s0 s0Var) {
        return new t0(s0Var);
    }
}
