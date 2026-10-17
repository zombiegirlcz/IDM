package mpf;

import ang.f;
import vc.s;
import vtc.k0;
import w39.b;
import wtc.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f207814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xmg.a f207815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f49.a f207816c;
    public final h4e.a d;

    public a(xmg.a aVar, k0 k0Var, h4e.a aVar2, f49.a aVar3) {
        this.f207814a = k0Var;
        this.f207815b = aVar;
        this.f207816c = aVar3;
        this.d = aVar2;
    }

    public final lal.a a() {
        g0 g0VarD = this.f207814a.d();
        f fVarE = this.f207815b.e();
        b bVarA = this.f207816c.a();
        s.j(bVarA);
        j4e.a aVar = (j4e.a) this.d.d.get();
        s.j(aVar);
        return new lal.a(g0VarD, fVarE, bVarA, aVar);
    }
}
