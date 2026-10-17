package c7b;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CobrandedCardsSelectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CobrandedCardsSelectionScreen cobrandedCardsSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cobrandedCardsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((t) this.u.R2()).f21911r.a();
        return Unit.f186387a;
    }
}
