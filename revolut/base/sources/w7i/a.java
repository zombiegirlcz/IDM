package w7i;

import c8i.i0;
import cri.d;
import mri.w;
import n7i.p;
import t7i.i;
import vbd.c;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f295547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final usg.a f295548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f295549c;
    public final zdl.c d;
    public final nj0.a e;
    public final d f;

    public a(nj0.a aVar, ite.a aVar2, u7i.c cVar, u7i.c cVar2, d dVar, c cVar3, usg.a aVar3, zdl.c cVar4) {
        this.f295547a = cVar3;
        this.f295548b = aVar3;
        this.f295549c = aVar2;
        this.d = cVar4;
        this.e = aVar;
        this.f = dVar;
    }

    public final t7i.b a() {
        w wVarA = ((ozl.a) this.f).a();
        s.j(wVarA);
        return new t7i.b(wVarA);
    }

    public final i b() {
        ybl.d dVarH = this.d.h();
        s.j(dVarH);
        wj0.a aVarI = ((nj0.d) this.e).i();
        s.j(aVarI);
        return new i(dVarH, aVarI, new p());
    }

    public final t7i.p c() {
        vbd.b bVar = (vbd.b) this.f295547a;
        ubd.i iVar = (ubd.i) bVar.f287507l.get();
        s.j(iVar);
        com.revolut.feature.shared.savings.impl.core.error.c cVar = (com.revolut.feature.shared.savings.impl.core.error.c) bVar.k.get();
        s.j(cVar);
        i0 i0Var = new i0();
        n nVarB = this.f295548b.b();
        gte.a aVarB = this.f295549c.b();
        s.j(aVarB);
        return new t7i.p(iVar, cVar, i0Var, nVarB, aVarB);
    }
}
