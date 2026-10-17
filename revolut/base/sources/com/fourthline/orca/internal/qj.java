package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj f32460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32461b;

    private qj(jj jjVar, e4m.e eVar) {
        this.f32460a = jjVar;
        this.f32461b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public no get() {
        return a(this.f32460a, (v10) this.f32461b.get());
    }

    public static qj a(jj jjVar, e4m.e eVar) {
        return new qj(jjVar, eVar);
    }

    public static no a(jj jjVar, v10 v10Var) {
        no noVarB = jjVar.b(v10Var);
        vc.s.k(noVarB);
        return noVarB;
    }
}
