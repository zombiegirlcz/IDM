package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rv3.b f67375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CreditCardOfferFlowContract$Step.PromoOffer f67376x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreditCardOfferFlowContract$Step.PromoOffer promoOffer, i iVar, Continuation continuation, rv3.b bVar) {
        super(2, continuation);
        this.v = iVar;
        this.f67375w = bVar;
        this.f67376x = promoOffer;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f67376x, this.v, continuation, this.f67375w);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        CreditCardOfferFlowContract$Step.PromoOffer promoOffer = this.f67376x;
        i iVar = this.v;
        b bVar = new b(promoOffer, iVar, null, this.f67375w);
        this.u = 1;
        Object objB = pu7.a.B(iVar.k, "handleCreditOfferResult", bVar, this);
        return objB == aVar ? aVar : objB;
    }
}
