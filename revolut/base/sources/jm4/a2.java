package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a2 implements xki.c, ys4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardRepayFutureInstalmentsFlowContract$InputData f175960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f175961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f175962c = this;
    public final e4m.e d = e4m.b.b(new n1(this, 5));

    public a2(a3 a3Var, CreditCardRepayFutureInstalmentsFlowContract$InputData creditCardRepayFutureInstalmentsFlowContract$InputData) {
        this.f175961b = a3Var;
        this.f175960a = creditCardRepayFutureInstalmentsFlowContract$InputData;
    }

    @Override // ys4.a
    public final j4 b() {
        return new j4(this.f175961b, this.f175962c, 0);
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
