package t73;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardsCarouselScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(CardsCarouselScreen cardsCarouselScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardsCarouselScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g0 g0Var = new g0(this.v, continuation);
        g0Var.u = obj2;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((NewRevolutCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NewRevolutCardDelegate.Model model = (NewRevolutCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g1 g1VarS3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) g1VarS3;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.card_screen.common.cards.presentation.listitems.CardsCarouselItemParcel");
        h93.f0 f0Var = ((t63.a) obj3).f268173a;
        cli.y yVar = gVar.f65434h0;
        if (!Intrinsics.f(((q0) ((vkm.j2) yVar.f22677a).getValue()).d.f224257a, f0Var)) {
            gVar.H2(yVar, new avc.o(f0Var, 13));
        }
        return Unit.f186387a;
    }
}
