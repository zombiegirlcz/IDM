package com.revolut.feature_crypto_order_details.api.navigation;

import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import hx7.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final CryptoOrderDetailsInputData a(ExchangeOrder exchangeOrder) {
        Intrinsics.checkNotNullParameter(exchangeOrder, "<this>");
        return q.P(exchangeOrder) ? new CryptoOrderDetailsInputData.TpslInputData(exchangeOrder) : new CryptoOrderDetailsInputData.StopLimitInputData(exchangeOrder);
    }
}
