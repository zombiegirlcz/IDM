package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class x3 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDirectDebitV3FlowContract$InputData f176437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3 f176439c = this;
    public final e4m.e d;

    public x3(a3 a3Var, CreditCardDirectDebitV3FlowContract$InputData creditCardDirectDebitV3FlowContract$InputData) {
        this.f176438b = a3Var;
        this.f176437a = creditCardDirectDebitV3FlowContract$InputData;
        this.d = e4m.b.b(new c3(a3Var, this, 2));
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
