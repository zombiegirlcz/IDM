package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementFinancingConfirmationScreenContract$InputData f176247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176249c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176251h;

    public p2(a3 a3Var, r2 r2Var, ViewController viewController, CreditCardStatementFinancingConfirmationScreenContract$InputData creditCardStatementFinancingConfirmationScreenContract$InputData) {
        this.f176248b = a3Var;
        this.f176247a = creditCardStatementFinancingConfirmationScreenContract$InputData;
        this.f176249c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new f1(a3Var, this, 2, 11));
        this.e = e4m.b.b(new f1(a3Var, this, 1, 11));
        this.f = e4m.b.b(new f1(a3Var, this, 0, 11));
        this.f176250g = e4m.b.b(new f1(a3Var, this, 4, 11));
        this.f176251h = e4m.b.b(new f1(a3Var, this, 3, 11));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
