package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ws0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f34782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34784c;
    private final e4m.e d;

    private ws0(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f34782a = ms0Var;
        this.f34783b = eVar;
        this.f34784c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw get() {
        return a(this.f34782a, (kw) this.f34783b.get(), (kw) this.f34784c.get(), (kw) this.d.get());
    }

    public static ws0 a(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new ws0(ms0Var, eVar, eVar2, eVar3);
    }

    public static kw a(ms0 ms0Var, kw kwVar, kw kwVar2, kw kwVar3) {
        kw kwVarA = ms0Var.a(kwVar, kwVar2, kwVar3);
        vc.s.k(kwVarA);
        return kwVarA;
    }
}
