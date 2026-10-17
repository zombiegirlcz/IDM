package l4b;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3b.a f192079a;

    public a0(m3b.a assetPriceMapper) {
        Intrinsics.checkNotNullParameter(assetPriceMapper, "assetPriceMapper");
        this.f192079a = assetPriceMapper;
    }

    public final CellDetailsActionDelegate.Model a(nel.n instrument, MarginQuote marginQuote, e2b.a orderType, BigDecimal targetRate) {
        int i;
        BigDecimal price;
        BigDecimal scale;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        int[] iArr = z.f192090a;
        int i2 = iArr[orderType.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_stocks_buy_order_price;
        } else if (i2 == 2) {
            i = R$string.wealth_trading_orders_limit_price;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_orders_stop_price;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i3 = iArr[orderType.ordinal()];
        if (i3 == 1) {
            price = marginQuote.f.f104793b;
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            price = targetRate;
        }
        String currencyCode = marginQuote.f82111b.f104718b.f104720b;
        ((m3b.b) this.f192079a).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        int i5 = R$drawable.uikit_icn_24_arrow_rates;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
        Float fValueOf = Float.valueOf(16.0f);
        ImageClause imageClause = new ImageClause(i5, numValueOf, fValueOf, fValueOf, 16);
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        AssetClause assetClause = new AssetClause(ONE, new AssetClauseType.Stock(0), instrument.e, null, o9.NON_SENSITIVE, 8);
        TextClause textClause = new TextClause("=", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Integer num = instrument.f214603n;
        return new CellDetailsActionDelegate.Model("ID_CELL_PRICE", textLocalisedClause, 0, null, CompositeClause.a(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(imageClause, assetClause, textClause, new AssetClause((num == null || (scale = price.setScale(num.intValue(), RoundingMode.HALF_UP)) == null) ? price : scale, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), currencyCode, null, null, 24))), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 11), false, false, u0.LARGE, null, 0, 0, 32544);
    }
}
