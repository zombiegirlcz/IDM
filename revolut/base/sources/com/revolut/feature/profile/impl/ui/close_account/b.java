package com.revolut.feature.profile.impl.ui.close_account;

import com.revolut.feature.profile.impl.ui.close_account.SelfTerminationFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mhd.o0;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f81357w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f81357w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f81357w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            o0 o0Var = new o0(cVar, this.f81357w, null, 4);
            this.u = 1;
            obj2 = cVar.p2(this, o0Var);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        PricingPlanOfferPrompt pricingPlanOfferPrompt = (PricingPlanOfferPrompt) obj2;
        if (pricingPlanOfferPrompt instanceof PricingPlanOfferPrompt.Available) {
            h.t2(cVar, cVar.u, new SelfTerminationFlowContract$Step.PlanOffer((PricingPlanOfferPrompt.Available) pricingPlanOfferPrompt), false, null, false, 14);
        } else {
            if (!(pricingPlanOfferPrompt instanceof PricingPlanOfferPrompt.Unavailable)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.I2();
        }
        return Unit.f186387a;
    }
}
