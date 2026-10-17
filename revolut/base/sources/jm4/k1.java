package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.flow.CreditCardLimitDecreaseFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k1 implements xki.c, uq4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardLimitDecreaseFlowContract$InputData f176165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f176167c = this;
    public final e4m.e d;

    public k1(a3 a3Var, CreditCardLimitDecreaseFlowContract$InputData creditCardLimitDecreaseFlowContract$InputData) {
        this.f176166b = a3Var;
        this.f176165a = creditCardLimitDecreaseFlowContract$InputData;
        this.d = e4m.b.b(new iwh.k(a3Var, this, 20));
    }

    @Override // uq4.b
    public final uq4.a b() {
        return new s3(this.f176166b, this.f176167c);
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
