package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m10 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l10 f30919a;

    private m10(l10 l10Var) {
        this.f30919a = l10Var;
    }

    public static tb0 b(l10 l10Var) {
        tb0 tb0VarA = l10Var.a();
        vc.s.k(tb0VarA);
        return tb0VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tb0 get() {
        return b(this.f30919a);
    }

    public static m10 a(l10 l10Var) {
        return new m10(l10Var);
    }
}
