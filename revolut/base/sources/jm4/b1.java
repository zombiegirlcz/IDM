package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b1 implements xki.c, ms4.a, rs4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInstalmentAnticipationFlowContract$InputData f175997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f175998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f175999c = this;
    public final e4m.e d = e4m.b.b(new j1a.k(this, 27));

    public b1(a3 a3Var, CreditCardInstalmentAnticipationFlowContract$InputData creditCardInstalmentAnticipationFlowContract$InputData) {
        this.f175998b = a3Var;
        this.f175997a = creditCardInstalmentAnticipationFlowContract$InputData;
    }

    @Override // ms4.a
    public final e4 b() {
        return new e4(this.f175998b, this.f175999c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // rs4.b
    public final rs4.a j() {
        return new g4(this.f175998b, this.f175999c);
    }
}
