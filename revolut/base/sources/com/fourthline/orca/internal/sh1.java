package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class sh1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh1 f33014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33016c;

    private sh1(oh1 oh1Var, e4m.e eVar, e4m.e eVar2) {
        this.f33014a = oh1Var;
        this.f33015b = eVar;
        this.f33016c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t9 get() {
        return a(this.f33014a, (kb0) this.f33015b.get(), (zw) this.f33016c.get());
    }

    public static sh1 a(oh1 oh1Var, e4m.e eVar, e4m.e eVar2) {
        return new sh1(oh1Var, eVar, eVar2);
    }

    public static t9 a(oh1 oh1Var, kb0 kb0Var, zw zwVar) {
        t9 t9VarA = oh1Var.a(kb0Var, zwVar);
        vc.s.k(t9VarA);
        return t9VarA;
    }
}
