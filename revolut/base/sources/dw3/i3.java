package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.FinancialSituationConfirmationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FinancialSituationConfirmationFlowContract$InputData f118951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118952c;
    public final i3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118954h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118955j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118958n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118963t;
    public final e4m.e u;

    public i3(c1 c1Var, iq3.a aVar, ViewController viewController, FinancialSituationConfirmationFlowContract$InputData financialSituationConfirmationFlowContract$InputData) {
        this.f118952c = c1Var;
        this.f118950a = aVar;
        this.f118951b = financialSituationConfirmationFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        this.f = e4m.b.b(new g3(c1Var, this, 2));
        this.f118953g = e4m.b.b(new g3(c1Var, this, 1));
        this.f118954h = e4m.b.b(new g3(c1Var, this, 0));
        this.i = e4m.b.b(e4m.c.a(financialSituationConfirmationFlowContract$InputData));
        this.f118955j = e4m.b.b(new g3(c1Var, this, 7));
        this.k = e4m.b.b(new g3(c1Var, this, 6));
        this.f118956l = e4m.b.b(new g3(c1Var, this, 10));
        this.f118957m = e4m.b.b(new g3(c1Var, this, 11));
        this.f118958n = e4m.b.b(new g3(c1Var, this, 9));
        this.o = e4m.b.b(new g3(c1Var, this, 8));
        this.f118959p = e4m.b.b(new g3(c1Var, this, 5));
        this.f118960q = e4m.b.b(new g3(c1Var, this, 4));
        this.f118961r = e4m.b.b(new g3(c1Var, this, 3));
        this.f118962s = e4m.b.b(new g3(c1Var, this, 12));
        this.f118963t = e4m.b.b(new g3(c1Var, this, 13));
        this.u = e4m.b.b(new g3(c1Var, this, 14));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118962s.get(), (yji.n) this.f118963t.get(), (yji.n) this.f118959p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118954h.get(), (yji.d) this.f118961r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118952c, this.d, 0);
    }
}
