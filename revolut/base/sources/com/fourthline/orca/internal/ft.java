package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class ft implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ct f28656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28658c;
    private final e4m.e d;

    private ft(ct ctVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f28656a = ctVar;
        this.f28657b = eVar;
        this.f28658c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public pu get() {
        return a(this.f28656a, (cw) this.f28657b.get(), (ov) this.f28658c.get(), (zr) this.d.get());
    }

    public static ft a(ct ctVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new ft(ctVar, eVar, eVar2, eVar3);
    }

    public static pu a(ct ctVar, cw cwVar, ov ovVar, zr zrVar) {
        pu puVarA = ctVar.a(cwVar, ovVar, zrVar);
        vc.s.k(puVarA);
        return puVarA;
    }
}
