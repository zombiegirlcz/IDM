package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class vl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f34389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34391c;

    private vl(ol olVar, e4m.e eVar, e4m.e eVar2) {
        this.f34389a = olVar;
        this.f34390b = eVar;
        this.f34391c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wm get() {
        return a(this.f34389a, (r70) this.f34390b.get(), (xm) this.f34391c.get());
    }

    public static vl a(ol olVar, e4m.e eVar, e4m.e eVar2) {
        return new vl(olVar, eVar, eVar2);
    }

    public static wm a(ol olVar, r70 r70Var, xm xmVar) {
        wm wmVarA = olVar.a(r70Var, xmVar);
        vc.s.k(wmVarA);
        return wmVarA;
    }
}
