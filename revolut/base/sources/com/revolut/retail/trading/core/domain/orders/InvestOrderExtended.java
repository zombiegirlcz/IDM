package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/InvestOrderExtended;", "Landroid/os/Parcelable;", "Lcom/revolut/retail/trading/core/domain/orders/InvestCommodityOrderExtended;", "Lcom/revolut/retail/trading/core/domain/orders/InvestFundOrderExtended;", "Lcom/revolut/retail/trading/core/domain/orders/InvestMarginOrderExtended;", "Lcom/revolut/retail/trading/core/domain/orders/InvestMutualFundOrderExtended;", "Lcom/revolut/retail/trading/core/domain/orders/InvestOptionOrderExtended;", "Lcom/revolut/retail/trading/core/domain/orders/InvestSecuritiesOrderExtended;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestOrderExtended extends Parcelable {
    InvestOrder getOrder();
}
