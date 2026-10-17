package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.FinancialSituationDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class j3 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinancialSituationDetailsScreenContract$InputData f119025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f119027c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119029h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119030j;

    public j3(c1 c1Var, i3 i3Var, ViewController viewController, FinancialSituationDetailsScreenContract$InputData financialSituationDetailsScreenContract$InputData) {
        this.f119025a = financialSituationDetailsScreenContract$InputData;
        this.f119026b = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, i3Var, this, 1, 18);
        this.f119027c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, i3Var, this, 0, 18));
        this.f = e4m.b.b(new e0(c1Var, i3Var, this, 2, 18));
        this.f119028g = e4m.b.b(new e0(c1Var, i3Var, this, 3, 18));
        this.f119029h = e4m.b.b(this.f119027c);
        this.i = e4m.b.b(new e0(c1Var, i3Var, this, 5, 18));
        this.f119030j = e4m.b.b(new e0(c1Var, i3Var, this, 4, 18));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119028g.get(), (yji.n) this.f119029h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}
