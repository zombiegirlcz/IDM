package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class g4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f28743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28744b;

    private g4(e4 e4Var, e4m.e eVar) {
        this.f28743a = e4Var;
        this.f28744b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i3 get() {
        return a(this.f28743a, (d3) this.f28744b.get());
    }

    public static g4 a(e4 e4Var, e4m.e eVar) {
        return new g4(e4Var, eVar);
    }

    public static i3 a(e4 e4Var, d3 d3Var) {
        i3 i3VarA = e4Var.a(d3Var);
        vc.s.k(i3VarA);
        return i3VarA;
    }
}
