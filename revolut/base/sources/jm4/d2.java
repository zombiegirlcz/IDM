package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.repay.spei_details.CreditCardRepaySpeiDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardRepaySpeiDetailsScreenContract$InputData f176035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176037c;

    public d2(a3 a3Var, z1 z1Var, CreditCardRepaySpeiDetailsScreenContract$InputData creditCardRepaySpeiDetailsScreenContract$InputData) {
        this.f176035a = creditCardRepaySpeiDetailsScreenContract$InputData;
        int i = 5;
        this.f176036b = e4m.b.b(new f1(a3Var, this, 1, i));
        this.f176037c = e4m.b.b(new f1(a3Var, this, 0, i));
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
