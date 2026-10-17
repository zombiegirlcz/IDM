package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class x2 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FinancialEvidenceFlowContract$InputData f120129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120130c;
    public final x2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120132h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120133j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120136n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120141t;
    public final e4m.e u;
    public final e4m.e v;

    public x2(c1 c1Var, iq3.a aVar, ViewController viewController, FinancialEvidenceFlowContract$InputData financialEvidenceFlowContract$InputData) {
        this.f120130c = c1Var;
        this.f120128a = aVar;
        this.f120129b = financialEvidenceFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f120131g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f120132h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(financialEvidenceFlowContract$InputData));
        int i2 = 24;
        this.f120133j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f120134l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f120135m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f120136n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f120137p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f120138q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f120139r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f120140s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f120141t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 15, i2));
        this.v = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120140s.get(), (yji.n) this.f120141t.get(), (yji.n) this.f120137p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120132h.get(), (yji.d) this.f120139r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f120130c, this.d, 18);
    }
}
