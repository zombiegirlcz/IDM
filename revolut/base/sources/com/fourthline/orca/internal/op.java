package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class op implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f31708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31709b;

    private op(hp hpVar, e4m.e eVar) {
        this.f31708a = hpVar;
        this.f31709b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j30 get() {
        return a(this.f31708a, (sg0) this.f31709b.get());
    }

    public static op a(hp hpVar, e4m.e eVar) {
        return new op(hpVar, eVar);
    }

    public static j30 a(hp hpVar, sg0 sg0Var) {
        j30 j30VarA = hpVar.a(sg0Var);
        vc.s.k(j30VarA);
        return j30VarA;
    }
}
