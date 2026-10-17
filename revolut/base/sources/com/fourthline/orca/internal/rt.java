package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ot f32826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32827b;

    private rt(ot otVar, e4m.e eVar) {
        this.f32826a = otVar;
        this.f32827b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d40 get() {
        return a(this.f32826a, (l70) this.f32827b.get());
    }

    public static rt a(ot otVar, e4m.e eVar) {
        return new rt(otVar, eVar);
    }

    public static d40 a(ot otVar, l70 l70Var) {
        d40 d40VarA = otVar.a(l70Var);
        vc.s.k(d40VarA);
        return d40VarA;
    }
}
