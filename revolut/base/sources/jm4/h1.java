package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h1 implements xki.c, ms4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInstalmentRepayFlowContract$InputData f176101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f176103c = this;
    public final e4m.e d;

    public h1(a3 a3Var, CreditCardInstalmentRepayFlowContract$InputData creditCardInstalmentRepayFlowContract$InputData) {
        this.f176102b = a3Var;
        this.f176101a = creditCardInstalmentRepayFlowContract$InputData;
        this.d = e4m.b.b(new iwh.k(a3Var, this, 18));
    }

    @Override // ms4.a
    public final e4 b() {
        return new e4(this.f176102b, this.f176103c, 1);
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
