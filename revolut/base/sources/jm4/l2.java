package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import dw3.k6;
import dw3.k9;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l2 implements xki.c, vk4.a, xk4.a, ok4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardSetupAutopayFlowContract$InputData f176184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f176186c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l2(a3 a3Var, CreditCardSetupAutopayFlowContract$InputData creditCardSetupAutopayFlowContract$InputData) {
        this.f176185b = a3Var;
        this.f176184a = creditCardSetupAutopayFlowContract$InputData;
        int i = 8;
        this.d = e4m.b.b(new f1(a3Var, this, 1, i));
        this.e = e4m.b.b(new f1(a3Var, this, 0, i));
        this.f = e4m.b.b(new f1(a3Var, this, 2, i));
    }

    @Override // vk4.a
    public final q3 b() {
        return new q3(this.f176185b, this.f176186c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // xk4.a
    public final k6 j() {
        return new k6(this.f176185b, this.f176186c, 2);
    }

    @Override // ok4.a
    public final k9 s() {
        return new k9(this.f176185b, this.f176186c, 3);
    }
}
