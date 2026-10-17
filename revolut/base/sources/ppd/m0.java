package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSortersDetailsContract$InputData f238477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238479c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f238481h;

    public m0(n nVar, j0 j0Var, ViewController viewController, IncomeSortersDetailsContract$InputData incomeSortersDetailsContract$InputData) {
        this.f238478b = nVar;
        this.f238477a = incomeSortersDetailsContract$InputData;
        this.f238479c = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.d = e4m.b.b(new j(nVar, j0Var, this, 1, i));
        this.e = e4m.b.b(new j(nVar, j0Var, this, 0, i));
        this.f = e4m.b.b(new j(nVar, j0Var, this, 3, i));
        this.f238480g = e4m.b.b(new j(nVar, j0Var, this, 2, i));
        this.f238481h = e4m.b.b(new j(nVar, j0Var, this, 4, i));
    }

    public final cqd.d b() {
        n nVar = this.f238478b;
        end.d dVarH = nVar.f238489g.h();
        nmc.d dVarD = nVar.J.d();
        gte.a aVarB = nVar.f238482a.b();
        vc.s.j(aVarB);
        pqd.a aVar = new pqd.a(new end.f(dVarD, aVarB, new ufl.b(new tfl.a())));
        m3j.l lVarG = ((b3j.p) nVar.K).g();
        dl3.f fVarC = nVar.L.c();
        vc.s.j(fVarC);
        return new cqd.d(dVarH, aVar, lVarG, fVarC);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f238480g.get());
    }
}
