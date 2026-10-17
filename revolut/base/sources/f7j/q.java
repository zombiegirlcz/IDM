package f7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f132646a;

    static {
        i7j.g[] elements = {i7j.g.FAILED_CRYPTO_LOWER_LIMIT, i7j.g.EXCEEDED_CRYPTO_LIMIT, i7j.g.FAILED_COMMODITY_LOWER_LIMIT, i7j.g.EXCEEDED_BALANCE, i7j.g.AMOUNT_TOO_SMALL};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f132646a = kotlin.collections.d.y0(elements);
    }

    public static final boolean a(ExchangeOrderDraft exchangeOrderDraft) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        MoneyDetails moneyDetailsD = i7j.e.d(exchangeOrderDraft);
        boolean zT = d0.T(f132646a, moneyDetailsD.d);
        wd6.e eVar = exchangeOrderDraft.f99887c;
        boolean z = eVar == wd6.e.BUY && exchangeOrderDraft.f99886b.d == i7j.g.EXCEEDED_BALANCE;
        boolean z3 = eVar == wd6.e.SELL && exchangeOrderDraft.f99885a.d == i7j.g.EXCEEDED_BALANCE;
        Long l2 = moneyDetailsD.f99904b;
        return ((l2 != null ? l2.longValue() : 0L) <= 0 || zT || z || z3) ? false : true;
    }
}
