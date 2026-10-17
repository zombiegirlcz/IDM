package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class id implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gd f29558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29559b;

    private id(gd gdVar, e4m.e eVar) {
        this.f29558a = gdVar;
        this.f29559b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cd get() {
        return a(this.f29558a, (gz0) this.f29559b.get());
    }

    public static id a(gd gdVar, e4m.e eVar) {
        return new id(gdVar, eVar);
    }

    public static cd a(gd gdVar, gz0 gz0Var) {
        cd cdVarA = gdVar.a(gz0Var);
        vc.s.k(cdVarA);
        return cdVarA;
    }
}
