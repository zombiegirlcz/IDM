package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rv3.b f67373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CreditCardOfferFlowContract$Step.PromoOffer f67374x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CreditCardOfferFlowContract$Step.PromoOffer promoOffer, i iVar, Continuation continuation, rv3.b bVar) {
        super(1, continuation);
        this.v = iVar;
        this.f67373w = bVar;
        this.f67374x = promoOffer;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f67374x, this.v, continuation, this.f67373w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CreditCardOfferFlowContract$Step.PromoOffer promoOffer = this.f67374x;
            i iVar = this.v;
            a aVar2 = new a(promoOffer, iVar, null, this.f67373w);
            this.u = 1;
            if (iVar.p2(this, aVar2) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
