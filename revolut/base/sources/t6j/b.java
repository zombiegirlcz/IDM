package t6j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import i7j.e;
import i7j.g;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pyd.c;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final Amount a(Amount amount, BigDecimal bigDecimal, xi0.b bVar, l4i.a aVar) {
        if (amount == null) {
            return null;
        }
        return (bigDecimal == null || Intrinsics.f(amount.f104718b.f104720b, bVar.f306286a)) ? amount : l4i.a.e(c.L(l4i.a.b(amount), bigDecimal, bVar));
    }

    public static final v6j.c b(ExchangeOrderDraft exchangeOrderDraft, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        MoneyDetails moneyDetailsD = e.d(exchangeOrderDraft);
        BigDecimal bigDecimal = exchangeOrderDraft.f99888g;
        MoneyDetails moneyDetails = exchangeOrderDraft.f99885a;
        if (moneyDetailsD.d == g.FAILED_COMMODITY_LOWER_LIMIT) {
            int i = a.f268357a[exchangeOrderDraft.f99887c.ordinal()];
            if (i == 1) {
                xi0.b bVar = exchangeOrderDraft.f99886b.f99903a;
                Limit.LowerRestrictionLimit lowerRestrictionLimitA = e.a(exchangeOrderDraft);
                Amount amountA = a(lowerRestrictionLimitA != null ? c(lowerRestrictionLimitA, bVar) : null, bigDecimal, bVar, amountConverter);
                if (amountA != null) {
                    return new v6j.a(amountA, moneyDetails.f99903a);
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                xi0.b bVar2 = moneyDetails.f99903a;
                BigDecimal bigDecimal2 = bigDecimal != null ? new BigDecimal(String.valueOf(Math.abs(1.0d) / Math.abs(bigDecimal.doubleValue()))) : null;
                Limit.LowerRestrictionLimit lowerRestrictionLimitA2 = e.a(exchangeOrderDraft);
                Amount amountA2 = a(lowerRestrictionLimitA2 != null ? c(lowerRestrictionLimitA2, bVar2) : null, bigDecimal2, bVar2, amountConverter);
                if (amountA2 != null) {
                    return new v6j.b(amountA2, bVar2);
                }
            }
        }
        return null;
    }

    public static final Amount c(Limit.LowerRestrictionLimit lowerRestrictionLimit, xi0.b bVar) {
        Asset asset;
        Amount amount = lowerRestrictionLimit.f104744b;
        return Intrinsics.f((amount == null || (asset = amount.f104718b) == null) ? null : asset.f104720b, bVar.f306286a) ? amount : lowerRestrictionLimit.f104745c;
    }
}
