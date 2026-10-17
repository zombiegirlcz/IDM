package com.fourthline.orca.internal;

import androidx.view.result.ActivityResultRegistry;

/* JADX INFO: loaded from: classes23.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f28700a;

    private g(d dVar) {
        this.f28700a = dVar;
    }

    public static ActivityResultRegistry b(d dVar) {
        ActivityResultRegistry activityResultRegistryD = dVar.d();
        vc.s.k(activityResultRegistryD);
        return activityResultRegistryD;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityResultRegistry get() {
        return b(this.f28700a);
    }

    public static g a(d dVar) {
        return new g(dVar);
    }
}
