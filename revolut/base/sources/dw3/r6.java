package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class r6 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SolicitorSelectionFlowContract$InputData f119679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119680c;
    public final r6 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119682h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119683j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119686n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119691t;
    public final e4m.e u;

    public r6(c1 c1Var, iq3.a aVar, ViewController viewController, SolicitorSelectionFlowContract$InputData solicitorSelectionFlowContract$InputData) {
        this.f119680c = c1Var;
        this.f119678a = aVar;
        this.f119679b = solicitorSelectionFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f119681g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f119682h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(solicitorSelectionFlowContract$InputData));
        int i2 = 16;
        this.f119683j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f119684l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f119685m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f119686n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f119687p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f119688q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f119689r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f119690s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f119691t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119690s.get(), (yji.n) this.f119691t.get(), (yji.n) this.f119687p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119682h.get(), (yji.d) this.f119689r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119680c, this.d, 8);
    }
}
