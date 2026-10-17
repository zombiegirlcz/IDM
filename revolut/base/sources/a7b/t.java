package a7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueRowContent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanAdditionalValueRowContent.Link f1834w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar, CobrandedCardsPlanAdditionalValueRowContent.Link link, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f1834w = link;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f1834w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        x xVar = this.v.f82560q;
        String str = this.f1834w.f82325b;
        lg0.a aVar2 = lg0.a.OPEN_BROWSER;
        Boolean bool = Boolean.FALSE;
        this.u = 1;
        Object objL1 = xVar.L1(str, aVar2, bool, this);
        return objL1 == aVar ? aVar : objL1;
    }
}
