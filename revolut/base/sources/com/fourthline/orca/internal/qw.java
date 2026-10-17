package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class qw implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ow f32546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32547b;

    private qw(ow owVar, e4m.e eVar) {
        this.f32546a = owVar;
        this.f32547b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public uw get() {
        return a(this.f32546a, (sg0) this.f32547b.get());
    }

    public static qw a(ow owVar, e4m.e eVar) {
        return new qw(owVar, eVar);
    }

    public static uw a(ow owVar, sg0 sg0Var) {
        uw uwVarA = owVar.a(sg0Var);
        vc.s.k(uwVarA);
        return uwVarA;
    }
}
