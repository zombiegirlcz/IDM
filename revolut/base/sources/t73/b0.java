package t73;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.i9;
import com.revolut.core.ui_kit.delegates.j9;
import com.revolut.core.ui_kit.delegates.k9;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardsCarouselScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(CardsCarouselScreen cardsCarouselScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardsCarouselScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b0 b0Var = new b0(this.v, continuation);
        b0Var.u = obj2;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((NewRevolutCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NewRevolutCardDelegate.Model model = (NewRevolutCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g1 g1VarS3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) g1VarS3;
        cli.y yVar = gVar.f65434h0;
        Intrinsics.checkNotNullParameter(model, "model");
        NewRevolutCardDelegate.a aVar2 = model.f52813j;
        if (aVar2 instanceof i9) {
            gVar.H2(yVar, new d(7));
        } else if (aVar2 instanceof k9) {
            gVar.H2(yVar, new d(8));
        } else if (!(aVar2 instanceof j9) && aVar2 != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
