package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v61 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u61 f34259a;

    private v61(u61 u61Var) {
        this.f34259a = u61Var;
    }

    public static m51 b(u61 u61Var) {
        m51 m51VarA = u61Var.a();
        vc.s.k(m51VarA);
        return m51VarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m51 get() {
        return b(this.f34259a);
    }

    public static v61 a(u61 u61Var) {
        return new v61(u61Var);
    }
}
