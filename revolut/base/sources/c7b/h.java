package c7b;

import c7b.k;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ CobrandedCardsSelectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CobrandedCardsSelectionScreen cobrandedCardsSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cobrandedCardsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((t) this.u.R2()).C2(k.a.f21898a);
        return Unit.f186387a;
    }
}
