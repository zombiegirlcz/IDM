package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class x41 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v41 f34884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34886c;

    private x41(v41 v41Var, e4m.e eVar, e4m.e eVar2) {
        this.f34884a = v41Var;
        this.f34885b = eVar;
        this.f34886c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i1 get() {
        return a(this.f34884a, (to) this.f34885b.get(), (wf) this.f34886c.get());
    }

    public static x41 a(v41 v41Var, e4m.e eVar, e4m.e eVar2) {
        return new x41(v41Var, eVar, eVar2);
    }

    public static i1 a(v41 v41Var, to toVar, wf wfVar) {
        i1 i1VarA = v41Var.a(toVar, wfVar);
        vc.s.k(i1VarA);
        return i1VarA;
    }
}
