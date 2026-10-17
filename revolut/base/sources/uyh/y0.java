package uyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y0 {
    public static final com.revolut.feature_crypto_order_flow.api.exchange.a a(CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails) {
        Intrinsics.checkNotNullParameter(cryptoExchangeContract$MoneyDetails, "<this>");
        xi0.b bVar = cryptoExchangeContract$MoneyDetails.f96683a;
        Long l2 = cryptoExchangeContract$MoneyDetails.f96684b;
        return new com.revolut.feature_crypto_order_flow.api.exchange.a(bVar, l2 != null ? new q0i.b(l2.longValue()) : null, cryptoExchangeContract$MoneyDetails.f96685c, cryptoExchangeContract$MoneyDetails.d, cryptoExchangeContract$MoneyDetails.e);
    }
}
