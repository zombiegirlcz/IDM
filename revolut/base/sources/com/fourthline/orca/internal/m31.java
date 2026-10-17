package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class m31 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4m.e f30975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30977c;

    private m31(e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f30975a = eVar;
        this.f30976b = eVar2;
        this.f30977c = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l31 get() {
        return a((o80) this.f30975a.get(), (bg) this.f30976b.get(), (c80) this.f30977c.get());
    }

    public static m31 a(e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new m31(eVar, eVar2, eVar3);
    }

    public static l31 a(o80 o80Var, bg bgVar, c80 c80Var) {
        return new l31(o80Var, bgVar, c80Var);
    }
}
