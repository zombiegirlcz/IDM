package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.DocumentsRemediationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k2 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentsRemediationFlowContract$InputData f119083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119084c;
    public final k2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119086h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119087j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119090n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119095t;
    public final e4m.e u;

    public k2(c1 c1Var, iq3.a aVar, ViewController viewController, DocumentsRemediationFlowContract$InputData documentsRemediationFlowContract$InputData) {
        this.f119084c = c1Var;
        this.f119082a = aVar;
        this.f119083b = documentsRemediationFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 15;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119085g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119086h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(documentsRemediationFlowContract$InputData));
        int i2 = 15;
        this.f119087j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119088l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119089m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119090n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119091p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119092q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119093r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119094s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119095t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119094s.get(), (yji.n) this.f119095t.get(), (yji.n) this.f119091p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119086h.get(), (yji.d) this.f119093r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119084c, this.d, 7);
    }
}
