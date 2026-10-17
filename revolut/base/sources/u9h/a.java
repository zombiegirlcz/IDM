package u9h;

import e9h.d;
import g9h.c;
import hd.r;
import jbh.e;
import sgm.e3;
import vc.s;
import whl.f;
import ybl.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9h.a f278479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f278480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f278481c;

    public a(h9h.a aVar, ite.a aVar2, f fVar) {
        this.f278479a = aVar;
        this.f278480b = fVar;
        this.f278481c = aVar2;
    }

    public final r a() {
        h9h.a aVar = this.f278479a;
        ryc.a aVarL = aVar.l();
        l lVarF = aVar.f();
        e eVarC = aVar.C();
        c cVar = new c();
        f fVar = this.f278480b;
        su9.c cVarC = fVar.c();
        ite.a aVar2 = this.f278481c;
        gte.a aVarB = aVar2.b();
        s.j(aVarB);
        e3 e3Var = new e3(cVar, cVarC, aVarB);
        d dVarD = aVar.D();
        rul.e eVarB = fVar.b();
        gte.a aVarB2 = aVar2.b();
        s.j(aVarB2);
        return new r(aVarL, lVarF, eVarC, e3Var, dVarD, eVarB, aVarB2);
    }
}
