package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class q2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementFinancingDetailsScreenContract$InputData f176268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176270c;
    public final e4m.e d;

    public q2(a3 a3Var, CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData) {
        this.f176269b = a3Var;
        this.f176268a = creditCardStatementFinancingDetailsScreenContract$InputData;
        this.f176270c = e4m.b.b(new f1(a3Var, this, 1, 12));
        this.d = e4m.b.b(new f1(a3Var, this, 0, 12));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
