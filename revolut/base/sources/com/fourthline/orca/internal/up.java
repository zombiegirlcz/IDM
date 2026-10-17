package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class up implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f34155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34157c;

    private up(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        this.f34155a = hpVar;
        this.f34156b = eVar;
        this.f34157c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mq get() {
        return a(this.f34155a, (c80) this.f34156b.get(), (sg0) this.f34157c.get());
    }

    public static up a(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        return new up(hpVar, eVar, eVar2);
    }

    public static mq a(hp hpVar, c80 c80Var, sg0 sg0Var) {
        mq mqVarB = hpVar.b(c80Var, sg0Var);
        vc.s.k(mqVarB);
        return mqVarB;
    }
}
