package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l8 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SummaryScreenContract$InputData f119219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119221c;
    public final v7 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119223h;

    public l8(c1 c1Var, x2 x2Var, ViewController viewController, SummaryScreenContract$InputData summaryScreenContract$InputData) {
        this.f119220b = c1Var;
        this.f119219a = summaryScreenContract$InputData;
        this.f119221c = e4m.b.b(e4m.c.a(viewController));
        v7 v7Var = new v7(x2Var, this, 1, 8);
        this.d = v7Var;
        this.e = e4m.b.b(v7Var);
        this.f = e4m.b.b(new v7(x2Var, this, 0, 8));
        this.f119222g = e4m.b.b(this.d);
        this.f119223h = e4m.b.b(new v7(x2Var, this, 2, 8));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119222g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
