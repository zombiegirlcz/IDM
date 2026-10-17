package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.RevolutTransactionsSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u5 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutTransactionsSelectionScreenContract$InputData f119918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f119920c;
    public final t5 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119922h;
    public final e4m.e i;

    public u5(c1 c1Var, q qVar, ViewController viewController, RevolutTransactionsSelectionScreenContract$InputData revolutTransactionsSelectionScreenContract$InputData) {
        this.f119919b = c1Var;
        this.f119918a = revolutTransactionsSelectionScreenContract$InputData;
        this.f119920c = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        t5 t5Var = new t5(c1Var, qVar, this, 1, i);
        this.d = t5Var;
        this.e = e4m.b.b(t5Var);
        this.f = e4m.b.b(new t5(c1Var, qVar, this, 0, i));
        this.f119921g = e4m.b.b(this.d);
        this.f119922h = e4m.b.b(new t5(c1Var, qVar, this, 3, i));
        this.i = e4m.b.b(new t5(c1Var, qVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119921g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
