package lul;

import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.trading.orders.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {
    public static HtmlLocalisedClause a(TradingLegalEntityInformation tradingLegalEntityInformation) throws Throwable {
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        hel.b bVar = tradingLegalEntityInformation.f105106a;
        int i = bVar == null ? -1 : b.f200252a[bVar.ordinal()];
        if (i == 1) {
            return new HtmlLocalisedClause(R$string.trading_orders_dialog_cbp_exchange_disclosure_description_gb, (List) null, (Integer) null, (Object) null, 30);
        }
        if (i == 2) {
            return new HtmlLocalisedClause(R$string.trading_orders_dialog_cbp_exchange_disclosure_description_eea, (List) null, (Integer) null, (Object) null, 30);
        }
        hx7.e.n(new Exception("Trading entity is not supported"));
        return null;
    }
}
