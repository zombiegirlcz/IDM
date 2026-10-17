package a7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueRowContent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanAdditionalValueRowContent.Link f1835w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar, CobrandedCardsPlanAdditionalValueRowContent.Link link, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f1835w = link;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.v, this.f1835w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        CobrandedCardsPlanAdditionalValueRowContent.Link link = this.f1835w;
        com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar = this.v;
        t tVar = new t(cVar, link, null);
        this.u = 1;
        Object objP2 = cVar.p2(this, tVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
