package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.PlanContextualSelectionFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements thk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f245865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanContextualSelectionFlowContract$InputData f245866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f245867c;
    public final a0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f245869h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f245870j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f245871l;

    public a0(i0 i0Var, agk.a aVar, PlanContextualSelectionFlowContract$InputData planContextualSelectionFlowContract$InputData) {
        this.f245867c = i0Var;
        this.f245865a = aVar;
        this.f245866b = planContextualSelectionFlowContract$InputData;
        int i = 7;
        this.e = e4m.b.b(new m(i0Var, this, 2, i));
        this.f = e4m.b.b(new m(i0Var, this, 3, i));
        this.f245868g = e4m.b.b(new m(i0Var, this, 4, i));
        this.f245869h = e4m.b.b(new m(i0Var, this, 1, i));
        this.i = e4m.b.b(new m(i0Var, this, 5, i));
        this.f245870j = e4m.b.b(new m(i0Var, this, 0, i));
        this.k = e4m.b.b(new m(i0Var, this, 6, i));
        this.f245871l = e4m.b.b(new m(i0Var, this, 7, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.addAll((Iterable) this.f245870j.get());
        return j6.a.g(this.k, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
