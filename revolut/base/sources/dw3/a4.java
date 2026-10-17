package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.LoanSelectorControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a4 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanSelectorControllerContract$InputData f118263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f118265c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118267h;

    public a4(c1 c1Var, g4 g4Var, ViewController viewController, LoanSelectorControllerContract$InputData loanSelectorControllerContract$InputData) {
        this.f118263a = loanSelectorControllerContract$InputData;
        this.f118264b = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        g3 g3Var = new g3(g4Var, this, 1, i);
        this.f118265c = g3Var;
        this.d = e4m.b.b(g3Var);
        this.e = e4m.b.b(new g3(g4Var, this, 0, i));
        this.f = e4m.b.b(this.f118265c);
        this.f118266g = e4m.b.b(new g3(g4Var, this, 3, i));
        this.f118267h = e4m.b.b(new g3(g4Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
