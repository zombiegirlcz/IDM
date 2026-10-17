package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.SelectFamilyPlanFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class r1 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectFamilyPlanFlowContract$InputData f246214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f246215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246216c;

    public r1(i0 i0Var, SelectFamilyPlanFlowContract$InputData selectFamilyPlanFlowContract$InputData) {
        this.f246214a = selectFamilyPlanFlowContract$InputData;
        this.f246215b = e4m.b.b(new p1(i0Var, this, 0, 1));
        this.f246216c = e4m.b.b(new p1(i0Var, this, 1, 1));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f246215b.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
