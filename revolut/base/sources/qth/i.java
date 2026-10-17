package qth;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import ql7.v1;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowFlowContract$InputData f249150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f249151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f249152c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f249153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f249154h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f249155j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f249156l;

    public i(g gVar, ViewController viewController, WorkflowFlowContract$InputData workflowFlowContract$InputData) {
        this.f249151b = gVar;
        this.f249150a = workflowFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.e = e4m.b.b(new v1(gVar, this, 1, i));
        this.f = e4m.b.b(new v1(gVar, this, 0, i));
        this.f249153g = e4m.b.b(new v1(gVar, this, 2, i));
        this.f249154h = e4m.b.b(new v1(gVar, this, 3, i));
        this.i = e4m.b.b(new v1(gVar, this, 6, i));
        this.f249155j = e4m.b.b(new v1(gVar, this, 5, i));
        this.k = e4m.b.b(new v1(gVar, this, 4, i));
        this.f249156l = e4m.b.b(new v1(gVar, this, 7, i));
    }

    public final kvh.h b() {
        g gVar = this.f249151b;
        v60.e eVarA = gVar.i.a();
        s.j(eVarA);
        sf0.h hVarB = gVar.f249137j.b();
        s.j(hVarB);
        return new kvh.h(hVarB, eVarA);
    }

    public final pth.e c() {
        pbi.e eVar = (pbi.e) this.f249151b.d.f223655h.get();
        s.j(eVar);
        return new pth.e(this.f249150a, eVar);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f249153g.get(), (n) this.f249154h.get(), (n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }

    public final rth.j j() {
        pth.e eVarC = c();
        g gVar = this.f249151b;
        ra0.h hVarA = gVar.e.a();
        s.j(hVarA);
        atb.d dVar = (atb.d) gVar.f.d.get();
        s.j(dVar);
        return new rth.j(eVarC, hVarA, dVar);
    }
}
