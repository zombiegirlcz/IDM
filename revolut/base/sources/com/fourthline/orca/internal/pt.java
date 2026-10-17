package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class pt implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ot f32039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32040b;

    private pt(ot otVar, e4m.e eVar) {
        this.f32039a = otVar;
        this.f32040b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j30 get() {
        return a(this.f32039a, (sg0) this.f32040b.get());
    }

    public static pt a(ot otVar, e4m.e eVar) {
        return new pt(otVar, eVar);
    }

    public static j30 a(ot otVar, sg0 sg0Var) {
        j30 j30VarA = otVar.a(sg0Var);
        vc.s.k(j30VarA);
        return j30VarA;
    }
}
