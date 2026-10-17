package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class gc implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec f28843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28845c;
    private final e4m.e d;

    private gc(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f28843a = ecVar;
        this.f28844b = eVar;
        this.f28845c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gb get() {
        return a(this.f28843a, (oc) this.f28844b.get(), (v10) this.f28845c.get(), (sg0) this.d.get());
    }

    public static gc a(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new gc(ecVar, eVar, eVar2, eVar3);
    }

    public static gb a(ec ecVar, oc ocVar, v10 v10Var, sg0 sg0Var) {
        gb gbVarA = ecVar.a(ocVar, v10Var, sg0Var);
        vc.s.k(gbVarA);
        return gbVarA;
    }
}
