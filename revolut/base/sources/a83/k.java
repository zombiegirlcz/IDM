package a83;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CardListScreen cardListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (model.u instanceof h93.f0) {
            CardListScreen.Companion companion = CardListScreen.INSTANCE;
            CardListScreen cardListScreen = this.v;
            ScreenContentRecyclerView cardsListScreenRecyclerView = cardListScreen.d3().d;
            Intrinsics.checkNotNullExpressionValue(cardsListScreenRecyclerView, "cardsListScreenRecyclerView");
            koi.b bVarF = yp0.y.f(cardsListScreenRecyclerView, model.f53228a);
            if (bVarF != null) {
                ((ItemTouchHelper) cardListScreen.T.getValue()).startDrag(bVarF);
                x xVarR2 = cardListScreen.R2();
                Object obj3 = model.u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                String cardId = ((h93.f0) obj3).f150110a;
                com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar2 = (com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a) xVarR2;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                aVar2.H2(aVar2.Q, new a08.o(aVar2, cardId, 16));
            }
        }
        return Unit.f186387a;
    }
}
