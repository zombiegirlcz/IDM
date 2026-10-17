package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.PlanReferralsClaimFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 implements dik.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f245872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanReferralsClaimFlowContract$InputData f245873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f245874c;
    public final a1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f245876h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f245877j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f245878l;

    public a1(i0 i0Var, agk.a aVar, PlanReferralsClaimFlowContract$InputData planReferralsClaimFlowContract$InputData) {
        this.f245874c = i0Var;
        this.f245872a = aVar;
        this.f245873b = planReferralsClaimFlowContract$InputData;
        int i = 20;
        this.e = e4m.b.b(new m(i0Var, this, 2, i));
        this.f = e4m.b.b(new m(i0Var, this, 3, i));
        this.f245875g = e4m.b.b(new m(i0Var, this, 4, i));
        this.f245876h = e4m.b.b(new m(i0Var, this, 1, i));
        this.i = e4m.b.b(new m(i0Var, this, 5, i));
        this.f245877j = e4m.b.b(new m(i0Var, this, 0, i));
        this.k = e4m.b.b(new m(i0Var, this, 6, i));
        this.f245878l = e4m.b.b(new m(i0Var, this, 7, i));
    }

    @Override // vmk.a
    public final n2 b() {
        return new n2(this.f245874c, this.d, 0);
    }

    @Override // klk.b
    public final t2 c() {
        return new t2(this.f245874c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.addAll((Iterable) this.f245877j.get());
        return j6.a.g(this.k, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
