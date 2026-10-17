package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.flow.CreditCardTransactionsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z2 implements xki.c, uv4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardTransactionsFlowContract$InputData f176468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2 f176470c = this;
    public final e4m.e d = e4m.b.b(new n1(this, 11));

    public z2(a3 a3Var, CreditCardTransactionsFlowContract$InputData creditCardTransactionsFlowContract$InputData) {
        this.f176469b = a3Var;
        this.f176468a = creditCardTransactionsFlowContract$InputData;
    }

    @Override // uv4.a
    public final n4 b() {
        return new n4(this.f176469b, this.f176470c, 0);
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
