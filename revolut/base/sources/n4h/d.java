package n4h;

import aw0.o9;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import d9.e1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import nel.y0;
import nel.z0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static TextLocalisedClause a(z0 z0Var, List list, n nVar) {
        if (!(z0Var instanceof y0)) {
            return new TextLocalisedClause(com.revolut.shared.feature.wealth.models.trading_accounts.b.b(list) ? R$string.wealth_trading_account_selector_isa_subtitle : com.revolut.shared.feature.wealth.models.trading_accounts.b.d(list) ? R$string.wealth_trading_account_selector_jisa_subtitle : com.revolut.shared.feature.wealth.models.trading_accounts.b.g(list) ? R$string.wealth_trading_account_selector_pea_subtitle : R$string.wealth_trading_orders_account_selector_gia_buy_subtitle, null, null, 14);
        }
        kel.n nVar2 = ((y0) z0Var).f214639a;
        BigDecimal bigDecimal = nVar2.f183174b;
        if (e1.I(bigDecimal) || e1.C(bigDecimal)) {
            return new TextLocalisedClause(com.revolut.shared.feature.wealth.models.trading_accounts.b.b(list) ? R$string.wealth_trading_account_selector_isa_subtitle : com.revolut.shared.feature.wealth.models.trading_accounts.b.d(list) ? R$string.wealth_trading_account_selector_jisa_subtitle : com.revolut.shared.feature.wealth.models.trading_accounts.b.g(list) ? R$string.wealth_trading_account_selector_pea_subtitle : R$string.wealth_trading_orders_account_selector_gia_buy_subtitle, null, null, 14);
        }
        if (io3.h.i(nVar.f214597c)) {
            int i = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_trading_orders_account_selector_sell_bonds_format;
            BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
            Intrinsics.checkNotNullExpressionValue(bigDecimal2, "stripTrailingZeros(...)");
            return new TextLocalisedClause(i, v.k(new NumberClause(bigDecimal2, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, o9.SENSITIVE, 4), new TextClause(nVar2.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        BigDecimal bigDecimal3 = f.f212444b;
        if (bigDecimal.compareTo(bigDecimal3) < 0) {
            int i2 = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_trading_orders_account_selector_sell_threshold_format;
            BigDecimal bigDecimal4 = bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros();
            Intrinsics.checkNotNullExpressionValue(bigDecimal4, "stripTrailingZeros(...)");
            return new TextLocalisedClause(i2, v.k(new NumberClause(bigDecimal4, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, o9.SENSITIVE, 4), new TextClause(nVar2.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        int i3 = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_trading_orders_account_selector_sell_format;
        BigDecimal bigDecimal5 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        Intrinsics.checkNotNullExpressionValue(bigDecimal5, "stripTrailingZeros(...)");
        return new TextLocalisedClause(i3, v.k(new NumberClause(bigDecimal5, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, o9.SENSITIVE, 4), new TextClause(nVar2.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }
}
