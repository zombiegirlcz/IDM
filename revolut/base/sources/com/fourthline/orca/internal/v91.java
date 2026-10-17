package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class v91 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r91 f34276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34277b;

    private v91(r91 r91Var, e4m.e eVar) {
        this.f34276a = r91Var;
        this.f34277b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uo get() {
        return a(this.f34276a, (gj) this.f34277b.get());
    }

    public static v91 a(r91 r91Var, e4m.e eVar) {
        return new v91(r91Var, eVar);
    }

    public static uo a(r91 r91Var, gj gjVar) {
        uo uoVarA = r91Var.a(gjVar);
        vc.s.k(uoVarA);
        return uoVarA;
    }
}
