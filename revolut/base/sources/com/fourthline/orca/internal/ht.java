package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ht implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct f29400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29402c;

    private ht(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        this.f29400a = ctVar;
        this.f29401b = eVar;
        this.f29402c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cw get() {
        return a(this.f29400a, (r70) this.f29401b.get(), (ib0) this.f29402c.get());
    }

    public static ht a(ct ctVar, e4m.e eVar, e4m.e eVar2) {
        return new ht(ctVar, eVar, eVar2);
    }

    public static cw a(ct ctVar, r70 r70Var, ib0 ib0Var) {
        cw cwVarA = ctVar.a(r70Var, ib0Var);
        vc.s.k(cwVarA);
        return cwVarA;
    }
}
