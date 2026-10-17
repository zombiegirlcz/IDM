package t73;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ CardsCarouselScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(CardsCarouselScreen cardsCarouselScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cardsCarouselScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((NewRevolutCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.u.R2()).Y2(true);
        return Unit.f186387a;
    }
}
