package c7e;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.card_management.api.cardlimit.CardLimitDestination;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((g6e.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g6e.c cVar = (g6e.c) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = cVar.f140918a;
        if (obj3 instanceof LargeActionButtonDelegate.Model) {
            LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj3;
            n nVar = this.v.f21937m;
            String str = model.f52613a;
            Object obj4 = model.i;
            switch (str.hashCode()) {
                case -668887872:
                    if (str.equals("LINKED_CARD_INFO_CONFIRM_ITEM_ID")) {
                        j60.a.v(nVar.f21965l, false, null, 3);
                    }
                    break;
                case -300977780:
                    if (str.equals("LINKED_CARD_INFO_SEE_CARD_ITEM_ID")) {
                        if (!(obj4 instanceof f0)) {
                            obj4 = null;
                        }
                        f0 card = (f0) obj4;
                        if (card != null) {
                            nVar.getClass();
                            Intrinsics.checkNotNullParameter(card, "card");
                            nVar.A2(new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(card.f150110a, 6, false, false), null, 47));
                        }
                    }
                    break;
                case -140772388:
                    if (str.equals("LINKED_CARD_INFO_UNLINK_CARD_ITEM_ID")) {
                        if (!(obj4 instanceof f0)) {
                            obj4 = null;
                        }
                        f0 revolutCard = (f0) obj4;
                        if (revolutCard != null) {
                            nVar.getClass();
                            Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
                            nVar.T2(new m(nVar, revolutCard, null), new yi5.b(27));
                        }
                    }
                    break;
                case 395614929:
                    if (str.equals("LINKED_CARD_SPENDING_LIMIT_ITEM_ID")) {
                        if (!(obj4 instanceof f0)) {
                            obj4 = null;
                        }
                        f0 revolutCard2 = (f0) obj4;
                        if (revolutCard2 != null) {
                            nVar.getClass();
                            Intrinsics.checkNotNullParameter(revolutCard2, "revolutCard");
                            nVar.A2(new CardLimitDestination(revolutCard2.f150110a));
                        }
                    }
                    break;
                case 1842342570:
                    if (str.equals("LINKED_CARD_WEALTH_PROTECTION_ITEM_ID")) {
                        nVar.getClass();
                        nVar.A2(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.WealthProtection.f85392a, false, (String) null, true, 22));
                    }
                    break;
            }
        }
        return Unit.f186387a;
    }
}
