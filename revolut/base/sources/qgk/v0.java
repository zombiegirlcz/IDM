package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class v0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanPagerFlowContract$InputData f246285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f246287c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246288g;

    public v0(i0 i0Var, PlanPagerFlowContract$InputData planPagerFlowContract$InputData) {
        this.f246286b = i0Var;
        this.f246285a = planPagerFlowContract$InputData;
        this.d = e4m.b.b(new m(i0Var, this, 0, 17));
        this.e = e4m.b.b(new m(i0Var, this, 2, 17));
        this.f = e4m.g.a(new m(i0Var, this, 3, 17));
        this.f246288g = e4m.b.b(new m(i0Var, this, 1, 17));
    }

    public final dnk.l b() {
        return new dnk.l(this.f246286b.e.g(), 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
