package t73;

import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardsCarouselScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(CardsCarouselScreen cardsCarouselScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardsCarouselScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(this.v, continuation, 0);
            default:
                return new d0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardsCarouselScreen cardsCarouselScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cardsCarouselScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) cardsCarouselScreen.R2();
                v73.a aVar3 = gVar.H;
                h93.f0 card = (h93.f0) ((q0) ((vkm.j2) gVar.f65434h0.f22677a).getValue()).d.f224257a;
                if (card != null) {
                    v73.j jVar = (v73.j) aVar3;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(card, "card");
                    jVar.T2(new v06.i(jVar, card, null, 16), new yi5.b(27));
                }
                break;
        }
        return Unit.f186387a;
    }
}
