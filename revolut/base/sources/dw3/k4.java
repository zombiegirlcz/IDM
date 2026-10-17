package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.MortgageValuationSummaryControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k4 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MortgageValuationSummaryControllerContract$InputData f119110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119112c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119114h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119115j;

    public k4(c1 c1Var, j4 j4Var, ViewController viewController, MortgageValuationSummaryControllerContract$InputData mortgageValuationSummaryControllerContract$InputData) {
        this.f119111b = c1Var;
        this.f119110a = mortgageValuationSummaryControllerContract$InputData;
        this.f119112c = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        e0 e0Var = new e0(c1Var, j4Var, this, 1, i);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, j4Var, this, 0, i));
        this.f119113g = e4m.b.b(new e0(c1Var, j4Var, this, 2, i));
        this.f119114h = e4m.b.b(new e0(c1Var, j4Var, this, 3, i));
        this.i = e4m.b.b(this.d);
        this.f119115j = e4m.b.b(new e0(c1Var, j4Var, this, 4, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f119113g.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119114h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f119113g.get());
    }
}
