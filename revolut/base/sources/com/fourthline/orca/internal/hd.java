package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class hd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gd f29220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29222c;

    private hd(gd gdVar, e4m.e eVar, e4m.e eVar2) {
        this.f29220a = gdVar;
        this.f29221b = eVar;
        this.f29222c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bd get() {
        return a(this.f29220a, (gz0) this.f29221b.get(), (od) this.f29222c.get());
    }

    public static hd a(gd gdVar, e4m.e eVar, e4m.e eVar2) {
        return new hd(gdVar, eVar, eVar2);
    }

    public static bd a(gd gdVar, gz0 gz0Var, od odVar) {
        bd bdVarA = gdVar.a(gz0Var, odVar);
        vc.s.k(bdVarA);
        return bdVarA;
    }
}
