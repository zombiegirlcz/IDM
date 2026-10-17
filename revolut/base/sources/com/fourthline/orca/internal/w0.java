package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class w0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f34484a;

    private w0(p0 p0Var) {
        this.f34484a = p0Var;
    }

    public static od b(p0 p0Var) {
        od odVarA = p0Var.a();
        vc.s.k(odVarA);
        return odVarA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public od get() {
        return b(this.f34484a);
    }

    public static w0 a(p0 p0Var) {
        return new w0(p0Var);
    }
}
