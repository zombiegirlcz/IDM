package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardPrePurchaseDetailsScreenContract$InputData f176380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176382c;
    public final e4m.e d;

    public u1(a3 a3Var, c1 c1Var, CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData) {
        this.f176381b = a3Var;
        this.f176380a = creditCardPrePurchaseDetailsScreenContract$InputData;
        this.f176382c = e4m.b.b(new f1(a3Var, this, 1, 1));
        this.d = e4m.b.b(new f1(a3Var, this, 0, 1));
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
