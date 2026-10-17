package e7b;

import c7b.k;
import c7b.l;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderAction;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreenContract$InputData;
import e2j.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsTypeSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CobrandedCardsTypeSelectionScreen cobrandedCardsTypeSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsTypeSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.Q.getValue();
        String listId = model.f53228a;
        h hVar = (h) eVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData = hVar.o;
        CobrandedCardsCardOrderAction cobrandedCardsCardOrderAction = cobrandedCardsTypeSelectionScreenContract$InputData.f82567a.f82516c;
        if (Intrinsics.f(cobrandedCardsCardOrderAction, CobrandedCardsCardOrderAction.Keep.f82510a)) {
            hVar.C2(k.a.f21898a);
        } else if (Intrinsics.f(cobrandedCardsCardOrderAction, CobrandedCardsCardOrderAction.Downgrade.f82509a)) {
            CobrandedCardsPlan cobrandedCardsPlan = cobrandedCardsTypeSelectionScreenContract$InputData.f82568b;
            if (cobrandedCardsPlan == null) {
                throw new IllegalStateException("CobrandedCardsTypeSelectionScreen requires plan for Downgrade action");
            }
            if (Intrinsics.f(listId, "list_id_virtual_card")) {
                cobrandedCardsCardConfiguration = cobrandedCardsTypeSelectionScreenContract$InputData.f82567a.e;
                if (cobrandedCardsCardConfiguration == null) {
                    throw new IllegalStateException("Virtual card row clicked but virtualCardConfiguration is null");
                }
            } else {
                cobrandedCardsCardConfiguration = cobrandedCardsTypeSelectionScreenContract$InputData.f82567a.d;
            }
            hVar.C2(new l(cobrandedCardsPlan, cobrandedCardsCardConfiguration));
        } else {
            if (!Intrinsics.f(cobrandedCardsCardOrderAction, CobrandedCardsCardOrderAction.SubscribeWithBenefits.f82513a) && !Intrinsics.f(cobrandedCardsCardOrderAction, CobrandedCardsCardOrderAction.Subscribe.f82512a) && !Intrinsics.f(cobrandedCardsCardOrderAction, CobrandedCardsCardOrderAction.Order.f82511a)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar.l2(new dz6.o(hVar, listId, null, 26), new j(hVar, 24));
        }
        return Unit.f186387a;
    }
}
