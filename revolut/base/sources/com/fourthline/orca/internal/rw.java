package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class rw implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ow f32848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32849b;

    private rw(ow owVar, e4m.e eVar) {
        this.f32848a = owVar;
        this.f32849b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tp0 get() {
        return a(this.f32848a, (sg0) this.f32849b.get());
    }

    public static rw a(ow owVar, e4m.e eVar) {
        return new rw(owVar, eVar);
    }

    public static tp0 a(ow owVar, sg0 sg0Var) {
        tp0 tp0VarB = owVar.b(sg0Var);
        vc.s.k(tp0VarB);
        return tp0VarB;
    }
}
