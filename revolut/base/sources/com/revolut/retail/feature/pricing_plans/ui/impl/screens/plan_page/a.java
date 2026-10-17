package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page;

import ahd.c;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import ffk.t;
import hx7.e;
import i4b.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yik.d;
import ymk.l;
import ymk.o;
import ymk.r;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements o {
    public final PlanPageScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f103608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ymk.a f103609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final enk.o f103610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final enk.o f103611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final enk.o f103612t;
    public final d u;
    public final dnk.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f103613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f103614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f103615y;

    public a(n stateMapper, PlanPageScreenContract$InputData inputData, t pricingPlanInteractor, ymk.a planPageLayoutInteractor, enk.o planPageScrollerEventsObserver, enk.o planPageScrollerEventsDispatcher, enk.o planPageVisibilityEventsDispatcher, d sourceMapper, dnk.d benefitIdsMapper, f descriptionClickHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planPageLayoutInteractor, "planPageLayoutInteractor");
        Intrinsics.checkNotNullParameter(planPageScrollerEventsObserver, "planPageScrollerEventsObserver");
        Intrinsics.checkNotNullParameter(planPageScrollerEventsDispatcher, "planPageScrollerEventsDispatcher");
        Intrinsics.checkNotNullParameter(planPageVisibilityEventsDispatcher, "planPageVisibilityEventsDispatcher");
        Intrinsics.checkNotNullParameter(sourceMapper, "sourceMapper");
        Intrinsics.checkNotNullParameter(benefitIdsMapper, "benefitIdsMapper");
        Intrinsics.checkNotNullParameter(descriptionClickHandler, "descriptionClickHandler");
        this.o = inputData;
        this.f103608p = pricingPlanInteractor;
        this.f103609q = planPageLayoutInteractor;
        this.f103610r = planPageScrollerEventsObserver;
        this.f103611s = planPageScrollerEventsDispatcher;
        this.f103612t = planPageVisibilityEventsDispatcher;
        this.u = sourceMapper;
        this.v = benefitIdsMapper;
        this.f103613w = descriptionClickHandler;
        this.f103614x = mra.d.b(this, new l(new Data(null, null, true, 3, null), new Data(inputData.f103605c, null, true, 2, null), false, 0), stateMapper, null, false, 12);
        this.f103615y = e.a(this, new yi3.d(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        PlanPageScreenContract$InputData planPageScreenContract$InputData = this.o;
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(this.f103608p.r(planPageScreenContract$InputData.f103603a)), null, null, new r(this, continuation, 1), 3);
        String planId = planPageScreenContract$InputData.f103603a;
        yji.l.a1(this, ymk.a.a(this.f103609q, planId, planPageScreenContract$InputData.d, this.u.a(planPageScreenContract$InputData.f103604b)), null, null, new r(this, continuation, 0), 3);
        enk.o oVar = this.f103610r;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        yji.l.a1(this, new c(oVar.f127845a, planId, 1), null, null, new rf9.h(this, continuation, 27), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f103615y;
    }

    @Override // cli.z
    public final g getState() {
        return this.f103614x;
    }
}
