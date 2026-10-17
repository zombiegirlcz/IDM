package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ik0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f29617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29619c;

    private ik0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2) {
        this.f29617a = fk0Var;
        this.f29618b = eVar;
        this.f29619c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public od get() {
        return a(this.f29617a, (gl0) this.f29618b.get(), (i80) this.f29619c.get());
    }

    public static ik0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2) {
        return new ik0(fk0Var, eVar, eVar2);
    }

    public static od a(fk0 fk0Var, gl0 gl0Var, i80 i80Var) {
        od odVarA = fk0Var.a(gl0Var, i80Var);
        vc.s.k(odVarA);
        return odVarA;
    }
}
