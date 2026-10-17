package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanBenefitsScreenContract$InputData f246235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246237c;
    public final e4m.e d;
    public final e4m.e e;

    public t(i0 i0Var, PlanBenefitsScreenContract$InputData planBenefitsScreenContract$InputData) {
        this.f246236b = i0Var;
        this.f246235a = planBenefitsScreenContract$InputData;
        int i = 2;
        this.f246237c = e4m.g.a(new m(i0Var, this, 2, i));
        this.d = e4m.b.b(new m(i0Var, this, 1, i));
        this.e = e4m.b.b(new m(i0Var, this, 0, i));
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
