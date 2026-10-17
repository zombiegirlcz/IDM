package com.fourthline.orca.internal;

import androidx.content.NavHostController;

/* JADX INFO: loaded from: classes23.dex */
public final class w80 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t80 f34545a;

    private w80(t80 t80Var) {
        this.f34545a = t80Var;
    }

    public static NavHostController b(t80 t80Var) {
        NavHostController navHostControllerA = t80Var.a();
        vc.s.k(navHostControllerA);
        return navHostControllerA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NavHostController get() {
        return b(this.f34545a);
    }

    public static w80 a(t80 t80Var) {
        return new w80(t80Var);
    }
}
