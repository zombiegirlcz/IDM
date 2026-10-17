package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.details.flow.CreditCardPostPurchaseDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class t1 implements xki.c, as4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardPostPurchaseDetailsFlowContract$InputData f176362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f176364c = this;
    public final e4m.e d;

    public t1(a3 a3Var, CreditCardPostPurchaseDetailsFlowContract$InputData creditCardPostPurchaseDetailsFlowContract$InputData) {
        this.f176363b = a3Var;
        this.f176362a = creditCardPostPurchaseDetailsFlowContract$InputData;
        this.d = e4m.b.b(new iwh.k(a3Var, this, 25));
    }

    @Override // as4.b
    public final as4.a c() {
        return new b4(this.f176363b, this.f176364c);
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
