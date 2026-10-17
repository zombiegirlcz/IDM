package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rv implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qv f32840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32842c;
    private final e4m.e d;
    private final e4m.e e;

    private rv(qv qvVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f32840a = qvVar;
        this.f32841b = eVar;
        this.f32842c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qs get() {
        return a(this.f32840a, (r70) this.f32841b.get(), (ib0) this.f32842c.get(), (us) this.d.get(), (mb.d) this.e.get());
    }

    public static rv a(qv qvVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new rv(qvVar, eVar, eVar2, eVar3, eVar4);
    }

    public static qs a(qv qvVar, r70 r70Var, ib0 ib0Var, us usVar, mb.d dVar) {
        qs qsVarA = qvVar.a(r70Var, ib0Var, usVar, dVar);
        vc.s.k(qsVarA);
        return qsVarA;
    }
}
