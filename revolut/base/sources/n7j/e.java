package n7j;

import aw0.k7;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.commodity.order_flow.impl.R$string;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l7j.l;
import l7j.m;
import n33.l0;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgm.c f213164a;

    public e(kgm.c itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f213164a = itemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        l7j.g domainState = (l7j.g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ExchangeOrderDraft exchangeOrderDraft = domainState.f192670a;
        MoneyDetails moneyDetails = exchangeOrderDraft.f99886b;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f99885a;
        wd6.e eVar = exchangeOrderDraft.f99887c;
        Long l2 = moneyDetails.f99904b;
        dj0.d dVar = new dj0.d(l2 != null ? l2.longValue() : 0L, exchangeOrderDraft.f99886b.f99903a);
        int[] iArr = d.f213162a;
        int i2 = iArr[eVar.ordinal()];
        if (i2 == 1) {
            dVar = dVar.l();
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.NON_SENSITIVE, 4);
        wd6.h hVar = exchangeOrderDraft.e;
        int i3 = iArr[eVar.ordinal()];
        if (i3 == 1) {
            switch (d.f213163b[hVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    i = R$string.wealth_commodities_order_flow_common_header_description_buy;
                    break;
                case 4:
                    i = R$string.wealth_commodities_order_flow_common_header_description_recurring_buy;
                    break;
                case 5:
                case 6:
                case 7:
                    throw new IllegalStateException(hVar + " order type is not supported");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_commodities_order_flow_common_header_description_sell;
        }
        l lVar = new l(moneyClause, new TextLocalisedClause(i, u.c(new CurrencyClause(moneyDetails2.f99903a, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), new CurrencyImage(moneyDetails2.f99903a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14));
        l7j.k kVar = new l7j.k(new TextLocalisedClause(R$string.wealth_commodities_order_flow_order_review_screen_disclaimer, null, null, 14));
        Data orderQuote = domainState.f192671b;
        ExchangeOrderDraft exchangeOrderDraft2 = domainState.f192670a;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(exchangeOrderDraft2, "exchangeOrderDraft");
        return new m(lVar, kVar, d0.E0(v.l(domainState.d.f224257a), (List) iii.c.f(orderQuote, new n5k.c(17), new l0(28), new m88.c(exchangeOrderDraft2, this.f213164a, 20))));
    }
}
