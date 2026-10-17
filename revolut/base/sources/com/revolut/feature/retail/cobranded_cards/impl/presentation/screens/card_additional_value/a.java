package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value;

import a7b.l;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderContext;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import r10.f;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlan f82555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan f82556x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, CobrandedCardsPlan cobrandedCardsPlan, CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan withPlan, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f82555w = cobrandedCardsPlan;
        this.f82556x = withPlan;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f82555w, this.f82556x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        CobrandedCardsPlan cobrandedCardsPlan = this.f82555w;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = cVar.f82563t;
            CobrandedCardsCardOrderContext cobrandedCardsCardOrderContextA = com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.a.a(cobrandedCardsPlan, null, null, this.f82556x.f82552b, 3);
            this.u = 1;
            obj2 = fVar.x0(cobrandedCardsCardOrderContextA, cobrandedCardsCardOrderContextA.d, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.C2(new l((e93.f) obj2, cobrandedCardsPlan.f82308h));
        return Unit.f186387a;
    }
}
