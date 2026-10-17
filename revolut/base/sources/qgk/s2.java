package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class s2 implements hlk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanDowngradeBlockScreenContract$InputData f246232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f246233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246234c;

    public s2(i0 i0Var, e0 e0Var, PlanDowngradeBlockScreenContract$InputData planDowngradeBlockScreenContract$InputData) {
        this.f246232a = planDowngradeBlockScreenContract$InputData;
        int i = 15;
        this.f246233b = e4m.b.b(new p1(i0Var, this, 1, i));
        this.f246234c = e4m.b.b(new p1(i0Var, this, 0, i));
    }

    @Override // hlk.a
    public final glk.l a() {
        return (glk.l) this.f246234c.get();
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
