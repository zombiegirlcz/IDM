package com.revolut.feature.card_screen.impl.kompot.cards_list;

import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_screen.api.navigation.CardListPreSelectedVariant;
import com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$PreSelectedVariant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import y73.h;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e {
    public static final CardsListFlowContract$PreSelectedVariant a(CardListPreSelectedVariant cardListPreSelectedVariant) {
        Intrinsics.checkNotNullParameter(cardListPreSelectedVariant, "<this>");
        if (cardListPreSelectedVariant instanceof CardListPreSelectedVariant.Tab) {
            n63.c cVar = ((CardListPreSelectedVariant.Tab) cardListPreSelectedVariant).f65344a;
            int i = cVar == null ? -1 : h.f311342a[cVar.ordinal()];
            return new CardsListFlowContract$PreSelectedVariant.Tab(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : SelectedTab.JUNIOR : SelectedTab.FREELANCER : SelectedTab.JOINT : SelectedTab.DEBIT : SelectedTab.CRYPTO);
        }
        if (cardListPreSelectedVariant instanceof CardListPreSelectedVariant.DependingOnLastOpenAccount) {
            return new CardsListFlowContract$PreSelectedVariant.DependingOnLastOpenAccount(((CardListPreSelectedVariant.DependingOnLastOpenAccount) cardListPreSelectedVariant).f65343a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
