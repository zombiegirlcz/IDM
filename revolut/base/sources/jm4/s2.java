package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementFinancingSetupScreenContract$InputData f176350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176352c;
    public final e4m.e d;
    public final e4m.e e;
    public final f1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1 f176353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176354h;
    public final e4m.e i;

    public s2(a3 a3Var, r2 r2Var, ViewController viewController, CreditCardStatementFinancingSetupScreenContract$InputData creditCardStatementFinancingSetupScreenContract$InputData) {
        this.f176350a = creditCardStatementFinancingSetupScreenContract$InputData;
        this.f176351b = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.f176352c = e4m.b.b(new f1(a3Var, this, 2, i));
        this.d = e4m.b.b(new f1(a3Var, this, 1, i));
        this.e = e4m.b.b(new f1(a3Var, this, 0, i));
        this.f = new f1(a3Var, this, 5, i);
        this.f176353g = new f1(a3Var, this, 6, i);
        this.f176354h = e4m.b.b(new f1(a3Var, this, 4, i));
        this.i = e4m.b.b(new f1(a3Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
