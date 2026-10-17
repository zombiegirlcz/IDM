package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.PlanKeepFlowContract$InputData;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f246153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanKeepFlowContract$InputData f246154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246155c;
    public final n0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246157h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246158j;
    public final e4m.e k;

    public n0(i0 i0Var, agk.a aVar, PlanKeepFlowContract$InputData planKeepFlowContract$InputData) {
        this.f246155c = i0Var;
        this.f246153a = aVar;
        this.f246154b = planKeepFlowContract$InputData;
        int i = 13;
        this.e = e4m.b.b(new m(i0Var, this, 2, i));
        this.f = e4m.b.b(new m(i0Var, this, 3, i));
        this.f246156g = e4m.b.b(new m(i0Var, this, 4, i));
        this.f246157h = e4m.b.b(new m(i0Var, this, 1, i));
        this.i = e4m.b.b(new m(i0Var, this, 5, i));
        this.f246158j = e4m.b.b(new m(i0Var, this, 0, i));
        this.k = e4m.b.b(new m(i0Var, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f246158j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
