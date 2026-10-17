package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 implements bik.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f246224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanOfferFlowContract$InputData f246225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246226c;
    public final s0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246228h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246229j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f246230l;

    public s0(i0 i0Var, agk.a aVar, PlanOfferFlowContract$InputData planOfferFlowContract$InputData) {
        this.f246226c = i0Var;
        this.f246224a = aVar;
        this.f246225b = planOfferFlowContract$InputData;
        int i = 15;
        this.e = e4m.b.b(new m(i0Var, this, 2, i));
        this.f = e4m.b.b(new m(i0Var, this, 3, i));
        this.f246227g = e4m.b.b(new m(i0Var, this, 4, i));
        this.f246228h = e4m.b.b(new m(i0Var, this, 1, i));
        this.i = e4m.b.b(new m(i0Var, this, 5, i));
        this.f246229j = e4m.b.b(new m(i0Var, this, 0, i));
        this.k = e4m.b.b(new m(i0Var, this, 6, i));
        this.f246230l = e4m.b.b(new m(i0Var, this, 7, i));
    }

    @Override // vmk.a
    public final n2 b() {
        return new n2(this.f246226c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.addAll((Iterable) this.f246229j.get());
        return j6.a.g(this.k, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
