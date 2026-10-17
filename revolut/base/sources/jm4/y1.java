package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y1 implements xki.c, ys4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardRepayCustomAmountFlowContract$InputData f176445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1 f176447c = this;
    public final e4m.e d = e4m.b.b(new n1(this, 4));

    public y1(a3 a3Var, CreditCardRepayCustomAmountFlowContract$InputData creditCardRepayCustomAmountFlowContract$InputData) {
        this.f176446b = a3Var;
        this.f176445a = creditCardRepayCustomAmountFlowContract$InputData;
    }

    @Override // ys4.a
    public final j4 b() {
        return new j4(this.f176446b, this.f176447c, 1);
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
