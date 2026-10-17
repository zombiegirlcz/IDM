package com.fourthline.orca.internal;

import com.fourthline.orca.Orca;

/* JADX INFO: loaded from: classes23.dex */
public final class r31 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p31 f32625a;

    private r31(p31 p31Var) {
        this.f32625a = p31Var;
    }

    public static Orca.a b(p31 p31Var) {
        Orca.a aVarB = p31Var.b();
        vc.s.k(aVarB);
        return aVarB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Orca.a get() {
        return b(this.f32625a);
    }

    public static r31 a(p31 p31Var) {
        return new r31(p31Var);
    }
}
