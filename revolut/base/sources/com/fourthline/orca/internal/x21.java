package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class x21 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v21 f34833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34835c;

    private x21(v21 v21Var, e4m.e eVar, e4m.e eVar2) {
        this.f34833a = v21Var;
        this.f34834b = eVar;
        this.f34835c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w70 get() {
        return a(this.f34833a, (u21) this.f34834b.get(), (c00) this.f34835c.get());
    }

    public static x21 a(v21 v21Var, e4m.e eVar, e4m.e eVar2) {
        return new x21(v21Var, eVar, eVar2);
    }

    public static w70 a(v21 v21Var, u21 u21Var, c00 c00Var) {
        w70 w70VarA = v21Var.a(u21Var, c00Var);
        vc.s.k(w70VarA);
        return w70VarA;
    }
}
