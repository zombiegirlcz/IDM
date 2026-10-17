package a7b;

import aw0.n6;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CobrandedCardsAdditionalValueScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cobrandedCardsAdditionalValueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) cobrandedCardsAdditionalValueScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) cobrandedCardsAdditionalValueScreen.d();
                CobrandedCardsAdditionalValueScreenContract$InputData cobrandedCardsAdditionalValueScreenContract$InputData = cVar.o;
                CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan withPlan = cobrandedCardsAdditionalValueScreenContract$InputData instanceof CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan ? (CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan) cobrandedCardsAdditionalValueScreenContract$InputData : null;
                if (withPlan == null) {
                    r6.b.D("AdditionalValueScreen must not have CTA when InputData.CurrentPlan");
                } else {
                    CobrandedCardsPlan cobrandedCardsPlan = withPlan.f82551a;
                    CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration = cobrandedCardsPlan.i;
                    if (cobrandedCardsCardConfiguration != null) {
                        cVar.C2(new n(cobrandedCardsPlan, cobrandedCardsPlan.f82308h, cobrandedCardsCardConfiguration));
                    } else if (cobrandedCardsPlan.f82309j == r5b.i.DOWNGRADE) {
                        cVar.C2(new m(cobrandedCardsPlan));
                    } else {
                        cVar.l2(new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.b(cVar, cobrandedCardsPlan, withPlan, null), new r(cVar, 0));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
