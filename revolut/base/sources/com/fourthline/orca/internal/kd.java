package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class kd implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gd f30201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30203c;

    private kd(gd gdVar, e4m.e eVar, e4m.e eVar2) {
        this.f30201a = gdVar;
        this.f30202b = eVar;
        this.f30203c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ux get() {
        return a(this.f30201a, (cd) this.f30202b.get(), (bd) this.f30203c.get());
    }

    public static kd a(gd gdVar, e4m.e eVar, e4m.e eVar2) {
        return new kd(gdVar, eVar, eVar2);
    }

    public static ux a(gd gdVar, cd cdVar, bd bdVar) {
        ux uxVarA = gdVar.a(cdVar, bdVar);
        vc.s.k(uxVarA);
        return uxVarA;
    }
}
