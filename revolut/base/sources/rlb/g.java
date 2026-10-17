package rlb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Input;
import java.util.Set;
import r7d.o;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsOnboardingFlowContract$Input f254989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f254990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f254991c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f254992g;

    public g(e eVar, SavingsOnboardingFlowContract$Input savingsOnboardingFlowContract$Input) {
        this.f254990b = eVar;
        this.f254989a = savingsOnboardingFlowContract$Input;
        int i = 15;
        this.d = e4m.b.b(new o(eVar, this, 1, i));
        this.e = e4m.b.b(new o(eVar, this, 0, i));
        this.f = e4m.b.b(new o(eVar, this, 3, i));
        this.f254992g = e4m.b.b(new o(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
