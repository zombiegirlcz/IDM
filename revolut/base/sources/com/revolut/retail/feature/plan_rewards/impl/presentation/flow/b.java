package com.revolut.retail.feature.plan_rewards.impl.presentation.flow;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPromptErrorModel;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import nii.z;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f102551w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f102551w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f102551w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            gi2.i iVar = new gi2.i(dVar, this.f102551w, null, 22);
            this.u = 1;
            objP2 = dVar.p2(this, iVar);
            if (objP2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objP2 = obj2;
        }
        PricingPlanOfferPrompt pricingPlanOfferPrompt = (PricingPlanOfferPrompt) objP2;
        if (pricingPlanOfferPrompt instanceof PricingPlanOfferPrompt.Available) {
            h.w2(dVar.u, new MonthlyDrawsFlowContract$Step.PromoOffer((PricingPlanOfferPrompt.Available) pricingPlanOfferPrompt), ModalDestination.Style.POPUP.f98311a);
            return Unit.f186387a;
        }
        if (!(pricingPlanOfferPrompt instanceof PricingPlanOfferPrompt.Unavailable)) {
            throw new NoWhenBranchMatchedException();
        }
        PricingPlanOfferPromptErrorModel pricingPlanOfferPromptErrorModel = ((PricingPlanOfferPrompt.Unavailable) pricingPlanOfferPrompt).f102848a;
        return dVar.X1(new y0(null, new z(pricingPlanOfferPromptErrorModel.f102850b, pricingPlanOfferPromptErrorModel.f102851c, null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
    }
}
