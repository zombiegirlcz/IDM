package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$CreditOfferConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreenContract$OfferContentPayload;
import com.revolut.kompot.navigable.TransitionAnimation;
import cv3.t;
import cv3.u;
import g84.m;
import hha.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IntendedPricingPlan f67377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hha.d f67378x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, IntendedPricingPlan intendedPricingPlan, hha.d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f67377w = intendedPricingPlan;
        this.f67378x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f67377w, this.f67378x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g84.e eVar = iVar.f67384q;
            u.Companion.getClass();
            u uVarB = t.b(this.f67377w, "intendedPlan");
            this.u = 1;
            if (((m) eVar).g(null, uVarB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.t2(iVar, iVar.z, new CreditCardOfferFlowContract$Step.OfferContent(new CreditCardOfferFlowContract$CreditOfferConfig.RegularOffer(new TopItemOfferContentScreenContract$OfferContentPayload(iVar.f67387t.b(s.f(this.f67378x)))), null), false, TransitionAnimation.NONE.f98393a, false, 8);
        return Unit.f186387a;
    }
}
