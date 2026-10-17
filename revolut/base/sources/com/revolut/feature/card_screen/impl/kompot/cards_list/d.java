package com.revolut.feature.card_screen.impl.kompot.cards_list;

import aii.u;
import com.revolut.feature.card_screen.api.CardScreenApi$Toggles;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.card_screen.api.navigation.CardsListDestination;
import com.revolut.feature.card_screen.api.navigation.ReactivateCardFlowDestination;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$InputData;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return d0.E0(CardsCoreApi$Toggles.a(), CardScreenApi$Toggles.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ReactivateCardFlowDestination) {
            return new CardsListFlow(CardsListFlowContract$InputData.ReactivateCard.f65447a);
        }
        if (!(destination instanceof CardsListDestination)) {
            return null;
        }
        CardsListDestination cardsListDestination = (CardsListDestination) destination;
        String f65360a = cardsListDestination.getF65360a();
        CardListPreSelectedVariant f65361b = cardsListDestination.getF65361b();
        return new CardsListFlow(new CardsListFlowContract$InputData.CardList(f65360a, f65361b != null ? e.a(f65361b) : null, cardsListDestination.getF65362c()));
    }
}
