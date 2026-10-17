package kjf;

import djf.c;
import mhf.f;
import mhf.j;
import thf.l;
import tjf.l0;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usg.a f184401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gjf.a f184402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jhf.a f184403c;
    public final fjf.a d;
    public final c e;

    public a(jhf.a aVar, fjf.a aVar2, gjf.a aVar3, c cVar, usg.a aVar4) {
        this.f184401a = aVar4;
        this.f184402b = aVar3;
        this.f184403c = aVar;
        this.d = aVar2;
        this.e = cVar;
    }

    public final l0 a() {
        n nVarB = this.f184401a.b();
        f fVar = (f) this.f184402b.f144274c.get();
        s.j(fVar);
        bjf.a aVar = (bjf.a) this.f184403c;
        com.revolut.domain.interactors.transactions.a aVarC = aVar.c();
        s.j(aVarC);
        j jVarE = aVar.e();
        s.j(jVarE);
        nhf.a aVarA = this.d.a();
        s.j(aVarA);
        l lVarF = this.e.f();
        s.j(lVarF);
        return new l0(nVarB, fVar, aVarC, jVarE, aVarA, lVarF);
    }
}
