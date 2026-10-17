package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.CreditCardCancellationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardCancellationFlowContract$InputData f176242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f176244c = this;
    public final e4m.e d;

    public p0(a3 a3Var, CreditCardCancellationFlowContract$InputData creditCardCancellationFlowContract$InputData) {
        this.f176243b = a3Var;
        this.f176242a = creditCardCancellationFlowContract$InputData;
        this.d = e4m.b.b(new iwh.k(a3Var, this, 12));
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
