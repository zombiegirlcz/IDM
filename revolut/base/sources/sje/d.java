package sje;

import aw0.o9;
import aw0.wa;
import bje.i;
import bje.j;
import bje.l;
import bje.m;
import bje.n;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.earn.assets.shared.api.navigation.EarnAssetsScreenDestination;
import com.revolut.feature.crypto.strategies.api.navigation.destinations.CryptoStrategiesDestination;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXPromoDestination;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qf1.k;
import zh9.u0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements pf1.a {
    @Override // pf1.a
    public final k a(qf1.d dVar) throws Exception {
        int i;
        int i2;
        TextLocalisedClause textLocalisedClause;
        PercentageClause.Format.Custom custom;
        bje.c item = (bje.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        for (qf1.f fVar : qf1.f.a()) {
            String id10 = fVar.getId();
            String str = item.f15598a;
            n nVar = item.f15599b;
            if (Intrinsics.f(id10, str)) {
                int i3 = c.f263713a[fVar.ordinal()];
                if (i3 == 1) {
                    i = R$drawable.uikit_icn_24_bitcoin;
                } else if (i3 == 2) {
                    i = R$drawable.uikit_icn_24_percent;
                } else if (i3 == 3) {
                    i = R$drawable.uikit_icn_24_lightbulb;
                } else if (i3 == 4) {
                    i = R$drawable.uikit_icn_24_calendar_recurring;
                } else {
                    if (i3 != 5) {
                        throw new Exception("Incorrect itemId " + fVar);
                    }
                    i = R$drawable.uikit_icn_24_candlestick_chart;
                }
                int i5 = i;
                boolean z = nVar instanceof m;
                if (z) {
                    i2 = R$string.crypto_add_new_product_trading_title;
                } else if ((nVar instanceof bje.g) || (nVar instanceof bje.h)) {
                    i2 = R$string.crypto_add_new_product_earn_title;
                } else if ((nVar instanceof i) || (nVar instanceof j)) {
                    i2 = R$string.crypto_add_new_product_learn_title;
                } else if (nVar instanceof l) {
                    i2 = R$string.crypto_add_new_product_strategies_title;
                } else {
                    if (!(nVar instanceof bje.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$string.crypto_add_new_product_revolut_x_title;
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
                if (z) {
                    textLocalisedClause = new TextLocalisedClause(R$string.crypto_add_new_product_trading_subtitle, null, null, 14);
                } else if (nVar instanceof bje.g) {
                    int i6 = R$string.crypto_add_new_product_earn_subtitle;
                    bje.g gVar = (bje.g) nVar;
                    double d = gVar.f15603a;
                    vtd.a aVar = gVar.f15604b;
                    int i21 = c.f263714b[aVar.ordinal()];
                    if (i21 == 1) {
                        custom = new PercentageClause.Format.Custom(2, 6, null, wa.STRIP_ONE_TRAILING_ZERO, null);
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        custom = new PercentageClause.Format.Custom(2, 6, null, wa.SHOW_ALL_ZEROES, null);
                    }
                    textLocalisedClause = new TextLocalisedClause(i6, u.c(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new PercentageClause(d, custom, (Custom) null, 4), new TextClause(aVar.name(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)))), null, 12);
                } else if (nVar instanceof bje.h) {
                    textLocalisedClause = new TextLocalisedClause(R$string.crypto_add_new_product_earn_fallback_subtitle, null, null, 14);
                } else if (nVar instanceof i) {
                    textLocalisedClause = new TextLocalisedClause(R$string.crypto_add_new_product_learn_fallback_subtitle, null, null, 14);
                } else if (nVar instanceof j) {
                    textLocalisedClause = new TextLocalisedClause(R$string.crypto_add_new_product_learn_subtitle, null, null, 14);
                } else if (nVar instanceof l) {
                    textLocalisedClause = new TextLocalisedClause(R$string.crypto_add_new_product_strategies_subtitle, null, null, 14);
                } else {
                    if (!(nVar instanceof bje.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.crypto_add_new_product_revolut_x_subtitle, null, null, 14);
                }
                return new k(i5, textLocalisedClause2, textLocalisedClause, null, null, null, 56);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // pf1.a
    public final /* bridge */ List b(qf1.d dVar) {
        return super.b((bje.c) dVar);
    }

    @Override // pf1.a
    public final qf1.j c(qf1.d dVar) throws Exception {
        ParcelableDestination parcelableDestinationC;
        bje.c item = (bje.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        for (qf1.f fVar : qf1.f.a()) {
            if (Intrinsics.f(fVar.getId(), item.f15598a)) {
                int i = c.f263713a[fVar.ordinal()];
                if (i == 1) {
                    parcelableDestinationC = u0.c(CryptoInvestFeatureConfig.Invest.f71500a);
                } else if (i == 2) {
                    parcelableDestinationC = EarnAssetsScreenDestination.f70788b;
                } else if (i == 3) {
                    parcelableDestinationC = new LearnKompotFeatureConfig.Home.Destination(null);
                } else if (i == 4) {
                    parcelableDestinationC = CryptoStrategiesDestination.f70999a;
                } else {
                    if (i != 5) {
                        throw new Exception("Incorrect itemId " + this);
                    }
                    parcelableDestinationC = RevolutXPromoDestination.f84265a;
                }
                return new qf1.h(parcelableDestinationC);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
