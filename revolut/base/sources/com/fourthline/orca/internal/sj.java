package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class sj implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f33034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33036c;
    private final e4m.e d;
    private final e4m.e e;

    private sj(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f33034a = rjVar;
        this.f33035b = eVar;
        this.f33036c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f33034a, (cj) this.f33035b.get(), (al) this.f33036c.get(), (ry) this.d.get(), (el) this.e.get());
    }

    public static sj a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new sj(rjVar, eVar, eVar2, eVar3, eVar4);
    }

    public static wd1 a(rj rjVar, cj cjVar, al alVar, ry ryVar, el elVar) {
        wd1 wd1VarA = rjVar.a(cjVar, alVar, ryVar, elVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
