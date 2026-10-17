package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardBoletoPaymentAmountContract$InputData f176193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176195c;
    public final e4m.e d;

    public m0(a3 a3Var, x1 x1Var, CreditCardBoletoPaymentAmountContract$InputData creditCardBoletoPaymentAmountContract$InputData) {
        this.f176194b = a3Var;
        this.f176193a = creditCardBoletoPaymentAmountContract$InputData;
        this.f176195c = e4m.b.b(new jdi.i(a3Var, this, 1, 23));
        this.d = e4m.b.b(new jdi.i(a3Var, this, 0, 23));
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
