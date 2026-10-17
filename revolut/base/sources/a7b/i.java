package a7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueRowContent;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsAdditionalValueScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsAdditionalValueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CobrandedCardsPlanAdditionalValueRowContent.Link) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CobrandedCardsPlanAdditionalValueRowContent.Link link = (CobrandedCardsPlanAdditionalValueRowContent.Link) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) this.v.d();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        cVar.l2(new u(cVar, link, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
