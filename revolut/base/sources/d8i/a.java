package d8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static vrc.a a(MoveMoneyOrderInfo moveMoneyOrderInfo, OrderQuote orderQuote, xi0.b bVar, String str, String str2) {
        AccountWrapper accountWrapper = moveMoneyOrderInfo.d;
        return new vrc.a(accountWrapper.getCurrency(), bVar, accountWrapper.getPocketId(), str, Long.valueOf(a.a.L(e1.m(orderQuote)).f115082a), null, str2);
    }
}
