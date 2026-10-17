package j1a;

import m1a.q;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vl3.n f170284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f170285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xmg.a f170286c;

    public a(vl3.n nVar, ite.a aVar, xmg.a aVar2) {
        this.f170284a = nVar;
        this.f170285b = aVar;
        this.f170286c = aVar2;
    }

    public final m1a.i a() {
        cl3.a aVarD = this.f170284a.d();
        s.j(aVarD);
        xmg.a aVar = this.f170286c;
        m1a.o oVar = new m1a.o(aVarD, aVar.e());
        gte.a aVarB = this.f170285b.b();
        s.j(aVarB);
        return new m1a.i(oVar, aVarB, new m1a.d(aVar.e()));
    }

    public final q b() {
        dl3.f fVarC = this.f170284a.c();
        s.j(fVarC);
        m1a.a aVar = new m1a.a(fVarC);
        gte.a aVarB = this.f170285b.b();
        s.j(aVarB);
        return new q(aVar, aVarB);
    }
}
