package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import dnk.d;
import ffk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vii.b;
import vkm.q;
import wk2.x;
import wkk.e;
import wkk.f;
import wkk.j;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements f {

    @NotNull
    public static final wkk.h Companion = new wkk.h();
    public final PlanBenefitsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ymk.a f103464p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f103465q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i4b.f f103466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f103467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f103468t;
    public final b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f103469w;

    public a(n stateMapper, PlanBenefitsScreenContract$InputData inputData, ymk.a planPageLayoutInteractor, t pricingPlanInteractor, i4b.f pricingPlanProvider, d benefitIdsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planPageLayoutInteractor, "planPageLayoutInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanProvider, "pricingPlanProvider");
        Intrinsics.checkNotNullParameter(benefitIdsMapper, "benefitIdsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f103464p = planPageLayoutInteractor;
        this.f103465q = pricingPlanInteractor;
        this.f103466r = pricingPlanProvider;
        this.f103467s = benefitIdsMapper;
        this.f103468t = featureToggleInteractor;
        this.u = new b();
        this.v = mra.d.b(this, new e(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.f103469w = hx7.e.a(this, new wde.f(this, 18));
    }

    @Override // yji.l
    public final void I1() {
        a aVar;
        PlanBenefitsScreenContract$PlanReference planBenefitsScreenContract$PlanReference = this.o.f103457a;
        Continuation continuation = null;
        if (planBenefitsScreenContract$PlanReference instanceof PlanBenefitsScreenContract$PlanReference.Id) {
            aVar = this;
            l.a1(aVar, rd0.e.b(this.f103465q.r(((PlanBenefitsScreenContract$PlanReference.Id) planBenefitsScreenContract$PlanReference).f103461a)), null, null, new j(this, null, 1), 3);
        } else {
            aVar = this;
            if (!(planBenefitsScreenContract$PlanReference instanceof PlanBenefitsScreenContract$PlanReference.Tier)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(aVar.v, new x(planBenefitsScreenContract$PlanReference, 3));
        }
        a aVar2 = aVar;
        l.a1(aVar2, q.Q(aVar.u, new w2a.q(continuation, this, 17)), null, null, new j(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f103469w;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
