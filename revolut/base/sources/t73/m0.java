package t73;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import com.revolut.feature.cards_core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ CardsCarouselScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(CardsCarouselScreen cardsCarouselScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cardsCarouselScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m0) create((NewRevolutCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.u.R2();
        h93.g0 g0Var = (h93.g0) ((q0) ((vkm.j2) gVar.f65434h0.f22677a).getValue()).e.f224257a;
        if (g0Var != null) {
            gVar.R2(R$string.card_security_details_card_cvv_copied, "COPY_CVV", true, g0Var.f150130c);
        }
        return Unit.f186387a;
    }
}
