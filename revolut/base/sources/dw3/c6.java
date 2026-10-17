package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.SelectLoanControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c6 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectLoanControllerContract$InputData f118513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5 f118515c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118517h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118518j;

    public c6(c1 c1Var, z3 z3Var, ViewController viewController, SelectLoanControllerContract$InputData selectLoanControllerContract$InputData) {
        this.f118513a = selectLoanControllerContract$InputData;
        this.f118514b = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        t5 t5Var = new t5(c1Var, z3Var, this, 1, i);
        this.f118515c = t5Var;
        this.d = e4m.b.b(t5Var);
        this.e = e4m.b.b(new t5(c1Var, z3Var, this, 0, i));
        this.f = e4m.b.b(new t5(c1Var, z3Var, this, 2, i));
        this.f118516g = e4m.b.b(new t5(c1Var, z3Var, this, 3, i));
        this.f118517h = e4m.b.b(this.f118515c);
        this.i = e4m.b.b(new t5(c1Var, z3Var, this, 5, i));
        this.f118518j = e4m.b.b(new t5(c1Var, z3Var, this, 4, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        throw null;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118516g.get(), (yji.n) this.f118517h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}
