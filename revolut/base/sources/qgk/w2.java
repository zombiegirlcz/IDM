package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class w2 implements hlk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanDowngradeBlockScreenContract$InputData f246308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f246309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246310c;
    public final e4m.e d;

    public w2(i0 i0Var, x xVar, PlanDowngradeBlockScreenContract$InputData planDowngradeBlockScreenContract$InputData) {
        this.f246309b = xVar;
        this.f246308a = planDowngradeBlockScreenContract$InputData;
        int i = 20;
        this.f246310c = e4m.b.b(new p1(i0Var, this, 1, i));
        this.d = e4m.b.b(new p1(i0Var, this, 0, i));
    }

    @Override // hlk.a
    public final glk.l a() {
        return (glk.l) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f246309b.f246318m.get());
    }
}
