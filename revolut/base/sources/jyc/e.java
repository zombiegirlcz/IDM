package jyc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements vyc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SotFlowContract$Step.EvidenceList f179369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f179370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f179371c;
    public final e4m.c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jqa.h f179372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f179373h;
    public final jqa.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f179374j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f179375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f179376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f179377n;
    public final e4m.e o;

    public e(h hVar, ViewController viewController, SotFlowContract$Step.EvidenceList evidenceList) {
        this.f179371c = hVar;
        this.f179369a = evidenceList;
        this.f179370b = viewController;
        e4m.c cVarA = e4m.c.a(viewController);
        this.d = cVarA;
        this.e = e4m.b.b(cVarA);
        int i = 6;
        this.f = e4m.b.b(new jqa.h(hVar, this, 2, i));
        this.f179372g = new jqa.h(hVar, this, 3, i);
        this.f179373h = e4m.b.b(new jqa.h(hVar, this, 4, i));
        this.i = new jqa.h(hVar, this, 5, i);
        this.f179374j = e4m.b.b(new jqa.h(hVar, this, 6, i));
        this.k = e4m.b.b(this.d);
        this.f179375l = e4m.b.b(new jqa.h(hVar, this, 7, i));
        this.f179376m = e4m.b.b(new jqa.h(hVar, this, 1, i));
        this.f179377n = e4m.b.b(new jqa.h(hVar, this, 0, i));
        this.o = e4m.b.b(new jqa.h(hVar, this, 8, i));
    }

    public final u96.b b() {
        l70.e eVar = this.f179371c.f179385g;
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f179371c.f179385g;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) this.f179373h.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.o.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f179377n.get());
    }
}
