package com.revolut.feature.card_screen.impl.kompot.cards_list;

import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$InputData;
import n63.h;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements h {
    public final CardsListFlow a(CardListPreSelectedVariant cardListPreSelectedVariant) {
        return new CardsListFlow(new CardsListFlowContract$InputData.CardList(cardListPreSelectedVariant != null ? e.a(cardListPreSelectedVariant) : null, 4));
    }
}
