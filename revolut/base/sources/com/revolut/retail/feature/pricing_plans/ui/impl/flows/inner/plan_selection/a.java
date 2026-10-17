package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.PlanSelectionCoreFlowContract$Step;
import dok.g;
import gim.i;
import hha.d;
import jhk.m;
import jhk.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ d u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f103087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hha.i f103088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PricingPlanOffer f103089y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, d dVar2, b bVar, hha.i iVar, PricingPlanOffer pricingPlanOffer, Continuation continuation) {
        super(1, continuation);
        this.u = dVar;
        this.v = dVar2;
        this.f103087w = bVar;
        this.f103088x = iVar;
        this.f103089y = pricingPlanOffer;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, this.v, this.f103087w, this.f103088x, this.f103089y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.u;
        d dVar2 = this.v;
        boolean zH = g.h(dVar, dVar2);
        b bVar = this.f103087w;
        if (zH) {
            h.t2(bVar, bVar.f103097y, new PlanSelectionCoreFlowContract$Step.PlanDowngrade(dVar2.f152287a, this.f103088x, this.f103089y), true, null, false, 12);
        } else {
            d dVar3 = this.v;
            hha.i iVar = this.f103088x;
            PricingPlanOffer pricingPlanOffer = this.f103089y;
            bVar.l2(new t(bVar, new m(bVar, dVar3, iVar, pricingPlanOffer, 1), this.u, dVar3, iVar, pricingPlanOffer, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
