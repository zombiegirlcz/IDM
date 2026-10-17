package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r5b.i;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static CobrandedCardsCardOrderContext a(CobrandedCardsPlan cobrandedCardsPlan, CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration, CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration2, String str, int i) {
        if ((i & 1) != 0) {
            cobrandedCardsCardConfiguration = cobrandedCardsPlan.f82308h;
        }
        CobrandedCardsCardConfiguration physicalCardConfiguration = cobrandedCardsCardConfiguration;
        if ((i & 2) != 0) {
            cobrandedCardsCardConfiguration2 = cobrandedCardsPlan.i;
        }
        CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration3 = cobrandedCardsCardConfiguration2;
        if ((i & 4) != 0) {
            str = null;
        }
        String str2 = str;
        Intrinsics.checkNotNullParameter(cobrandedCardsPlan, "<this>");
        Intrinsics.checkNotNullParameter(physicalCardConfiguration, "physicalCardConfiguration");
        String str3 = cobrandedCardsPlan.f82304a;
        String str4 = cobrandedCardsPlan.f82305b;
        i iVar = cobrandedCardsPlan.f82309j;
        int i2 = iVar == null ? -1 : e6b.a.f122962a[iVar.ordinal()];
        CobrandedCardsCardOrderAction cobrandedCardsCardOrderAction = CobrandedCardsCardOrderAction.Subscribe.f82512a;
        if (i2 != -1) {
            if (i2 == 1) {
                cobrandedCardsCardOrderAction = CobrandedCardsCardOrderAction.Keep.f82510a;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    cobrandedCardsCardOrderAction = CobrandedCardsCardOrderAction.SubscribeWithBenefits.f82513a;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cobrandedCardsCardOrderAction = CobrandedCardsCardOrderAction.Downgrade.f82509a;
                }
            }
        }
        return new CobrandedCardsCardOrderContext(str3, str4, cobrandedCardsCardOrderAction, physicalCardConfiguration, cobrandedCardsCardConfiguration3, str2);
    }
}
