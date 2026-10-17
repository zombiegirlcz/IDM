package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlan f82557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan f82558x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, CobrandedCardsPlan cobrandedCardsPlan, CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan withPlan, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f82557w = cobrandedCardsPlan;
        this.f82558x = withPlan;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f82557w, this.f82558x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan withPlan = this.f82558x;
            c cVar = this.v;
            a aVar2 = new a(cVar, this.f82557w, withPlan, null);
            this.u = 1;
            if (cVar.p2(this, aVar2) == aVar) {
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
