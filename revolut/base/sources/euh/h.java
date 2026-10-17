package euh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ea2.p;
import java.util.Set;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements muh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseQuestionScreenContract$InputData f129593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f129594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f129595c;
    public final e4m.c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f129596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f129597h;
    public final p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f129598j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f129599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f129600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f129601n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f129602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f129603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f129604r;

    public h(d dVar, e eVar, ViewController viewController, BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData) {
        this.f129594b = dVar;
        this.f129595c = eVar;
        this.f129593a = baseQuestionScreenContract$InputData;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 13;
        this.f = e4m.b.b(new p(dVar, this, 2, i));
        this.f129596g = new p(dVar, this, 3, i);
        this.f129597h = e4m.b.b(new p(dVar, this, 4, i));
        this.i = new p(dVar, this, 5, i);
        this.f129598j = e4m.b.b(new p(dVar, this, 6, i));
        this.k = e4m.b.b(this.d);
        this.f129599l = e4m.b.b(new p(dVar, this, 7, i));
        this.f129600m = e4m.b.b(new p(dVar, this, 1, i));
        this.f129601n = e4m.b.b(new p(dVar, this, 0, i));
        this.o = e4m.b.b(new p(dVar, this, 8, i));
        this.f129602p = e4m.b.b(new p(dVar, this, 10, i));
        this.f129603q = e4m.b.b(new p(dVar, this, 11, i));
        this.f129604r = e4m.b.b(new p(dVar, this, 9, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f129594b.f129576g;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f129594b.f129576g;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.f129597h.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f129601n.get());
    }
}
