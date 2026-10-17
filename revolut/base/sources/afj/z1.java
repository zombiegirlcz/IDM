package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class z1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4550a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimMobilePlanDetailsScreenContract$InputData f4551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4552c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f4553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f4554h;

    public z1(b bVar, m mVar, EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData) {
        this.f4552c = bVar;
        this.f4551b = esimMobilePlanDetailsScreenContract$InputData;
        int i = 9;
        this.d = e4m.b.b(new d(bVar, mVar, this, 0, i));
        this.e = e4m.b.b(new d(bVar, mVar, this, 1, i));
        this.f = e4m.b.b(new d(bVar, mVar, this, 2, i));
        this.f4553g = e4m.b.b(new d(bVar, mVar, this, 4, i));
        this.f4554h = e4m.b.b(new d(bVar, mVar, this, 3, i));
    }

    public final xjj.d b() {
        switch (this.f4550a) {
            case 0:
                b bVar = this.f4552c;
                gte.a aVarB = bVar.f4120a.b();
                vc.s.j(aVarB);
                return new xjj.d(aVarB, new ynj.p(), new ynj.m(), new nd.o(new vnj.a()), new bnj.g(), new bnj.d(bVar.c()));
            case 1:
                b bVar2 = this.f4552c;
                gte.a aVarB2 = bVar2.f4120a.b();
                vc.s.j(aVarB2);
                return new xjj.d(aVarB2, new ynj.p(), new ynj.m(), new nd.o(new vnj.a()), new bnj.g(), new bnj.d(bVar2.c()));
            default:
                b bVar3 = this.f4552c;
                gte.a aVarB3 = bVar3.f4120a.b();
                vc.s.j(aVarB3);
                return new xjj.d(aVarB3, new ynj.p(), new ynj.m(), new nd.o(new vnj.a()), new bnj.g(), new bnj.d(bVar3.c()));
        }
    }

    public final yjj.f c() {
        switch (this.f4550a) {
            case 0:
                yjj.b bVar = new yjj.b();
                xjj.a aVar = new xjj.a();
                b bVar2 = this.f4552c;
                yjj.a aVar2 = new yjj.a(aVar, new yjj.i((gej.a) bVar2.K.get()));
                yjj.h hVar = new yjj.h();
                yjj.l lVar = new yjj.l();
                yjj.c cVar = new yjj.c();
                yjj.m mVar = new yjj.m();
                yjj.e eVar = new yjj.e();
                yjj.d dVar = new yjj.d();
                yjj.k kVar = new yjj.k();
                ynj.m mVar2 = new ynj.m();
                yjj.i iVar = new yjj.i((gej.a) bVar2.K.get());
                tsk.t tVar = new tsk.t(bVar2.f());
                gte.a aVarB = bVar2.f4120a.b();
                vc.s.j(aVarB);
                return new yjj.f(bVar, aVar2, hVar, lVar, cVar, mVar, eVar, dVar, kVar, mVar2, iVar, tVar, aVarB);
            case 1:
                yjj.b bVar3 = new yjj.b();
                xjj.a aVar3 = new xjj.a();
                b bVar4 = this.f4552c;
                yjj.a aVar4 = new yjj.a(aVar3, new yjj.i((gej.a) bVar4.K.get()));
                yjj.h hVar2 = new yjj.h();
                yjj.l lVar2 = new yjj.l();
                yjj.c cVar2 = new yjj.c();
                yjj.m mVar3 = new yjj.m();
                yjj.e eVar2 = new yjj.e();
                yjj.d dVar2 = new yjj.d();
                yjj.k kVar2 = new yjj.k();
                ynj.m mVar4 = new ynj.m();
                yjj.i iVar2 = new yjj.i((gej.a) bVar4.K.get());
                tsk.t tVar2 = new tsk.t(bVar4.f());
                gte.a aVarB2 = bVar4.f4120a.b();
                vc.s.j(aVarB2);
                return new yjj.f(bVar3, aVar4, hVar2, lVar2, cVar2, mVar3, eVar2, dVar2, kVar2, mVar4, iVar2, tVar2, aVarB2);
            default:
                yjj.b bVar5 = new yjj.b();
                xjj.a aVar5 = new xjj.a();
                b bVar6 = this.f4552c;
                yjj.a aVar6 = new yjj.a(aVar5, new yjj.i((gej.a) bVar6.K.get()));
                yjj.h hVar3 = new yjj.h();
                yjj.l lVar3 = new yjj.l();
                yjj.c cVar3 = new yjj.c();
                yjj.m mVar5 = new yjj.m();
                yjj.e eVar3 = new yjj.e();
                yjj.d dVar3 = new yjj.d();
                yjj.k kVar3 = new yjj.k();
                ynj.m mVar6 = new ynj.m();
                yjj.i iVar3 = new yjj.i((gej.a) bVar6.K.get());
                tsk.t tVar3 = new tsk.t(bVar6.f());
                gte.a aVarB3 = bVar6.f4120a.b();
                vc.s.j(aVarB3);
                return new yjj.f(bVar5, aVar6, hVar3, lVar3, cVar3, mVar5, eVar3, dVar3, kVar3, mVar6, iVar3, tVar3, aVarB3);
        }
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f4550a) {
        }
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.e.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f4550a) {
        }
        return ImmutableSet.of();
    }

    public z1(b bVar, x0 x0Var, EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData) {
        this.f4552c = bVar;
        this.f4551b = esimMobilePlanDetailsScreenContract$InputData;
        int i = 7;
        this.d = e4m.b.b(new d(bVar, x0Var, this, 0, i));
        this.e = e4m.b.b(new d(bVar, x0Var, this, 1, i));
        this.f = e4m.b.b(new d(bVar, x0Var, this, 2, i));
        this.f4553g = e4m.b.b(new d(bVar, x0Var, this, 4, i));
        this.f4554h = e4m.b.b(new d(bVar, x0Var, this, 3, i));
    }

    public z1(b bVar, q0 q0Var, EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData) {
        this.f4552c = bVar;
        this.f4551b = esimMobilePlanDetailsScreenContract$InputData;
        int i = 8;
        this.d = e4m.b.b(new d(bVar, q0Var, this, 0, i));
        this.e = e4m.b.b(new d(bVar, q0Var, this, 1, i));
        this.f = e4m.b.b(new d(bVar, q0Var, this, 2, i));
        this.f4553g = e4m.b.b(new d(bVar, q0Var, this, 4, i));
        this.f4554h = e4m.b.b(new d(bVar, q0Var, this, 3, i));
    }
}
