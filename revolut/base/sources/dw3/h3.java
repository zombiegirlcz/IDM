package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinancialSituationChangesScreenContract$InputData f118868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f118870c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118872h;

    public h3(c1 c1Var, i3 i3Var, ViewController viewController, FinancialSituationChangesScreenContract$InputData financialSituationChangesScreenContract$InputData) {
        this.f118868a = financialSituationChangesScreenContract$InputData;
        this.f118869b = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        g3 g3Var = new g3(i3Var, this, 1, i);
        this.f118870c = g3Var;
        this.d = e4m.b.b(g3Var);
        this.e = e4m.b.b(new g3(i3Var, this, 0, i));
        this.f = e4m.b.b(this.f118870c);
        this.f118871g = e4m.b.b(new g3(i3Var, this, 3, i));
        this.f118872h = e4m.b.b(new g3(i3Var, this, 2, i));
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
