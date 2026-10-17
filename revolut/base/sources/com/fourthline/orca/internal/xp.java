package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class xp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f35069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35071c;

    private xp(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        this.f35069a = hpVar;
        this.f35070b = eVar;
        this.f35071c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f35069a, (or) this.f35070b.get(), (iq) this.f35071c.get());
    }

    public static xp a(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        return new xp(hpVar, eVar, eVar2);
    }

    public static wd1 a(hp hpVar, or orVar, iq iqVar) {
        wd1 wd1VarA = hpVar.a(orVar, iqVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
