package com.fourthline.orca.internal;

import androidx.view.result.ActivityResultRegistry;

/* JADX INFO: loaded from: classes23.dex */
public final class a5 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26705b;

    private a5(e4 e4Var, e4m.e eVar) {
        this.f26704a = e4Var;
        this.f26705b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qe1 get() {
        return a(this.f26704a, (ActivityResultRegistry) this.f26705b.get());
    }

    public static a5 a(e4 e4Var, e4m.e eVar) {
        return new a5(e4Var, eVar);
    }

    public static qe1 a(e4 e4Var, ActivityResultRegistry activityResultRegistry) {
        qe1 qe1VarA = e4Var.a(activityResultRegistry);
        vc.s.k(qe1VarA);
        return qe1VarA;
    }
}
