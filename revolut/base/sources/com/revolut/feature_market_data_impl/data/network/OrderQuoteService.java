package com.revolut.feature_market_data_impl.data.network;

import e8l.d;
import efm.d0;
import h4i.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u000f¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_market_data_impl/data/network/OrderQuoteService;", "", "", "ccyPair", "side", "orderSide", "", "amount", "Lefm/d0;", "Lj59/a;", "getQuoteLimits", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lefm/d0;", "id", "Le8l/d;", "getRetailFeeBreakdown", "(Ljava/lang/String;)Lefm/d0;", "getCryptoExchangeFeeBreakdown", "currencyPair", "Lh4i/a;", "getLimits", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderQuoteService {
    @GET("/crypto-exchange/fee-breakdown/{id}")
    @NotNull
    d0<d> getCryptoExchangeFeeBreakdown(@Path("id") @NotNull String id10);

    @GET("/assets/exchange-limit")
    @NotNull
    d0<a> getLimits(@NotNull @Query("currencyPair") String currencyPair);

    @GET("quote/limits/{ccyPair}")
    @NotNull
    d0<j59.a> getQuoteLimits(@Path("ccyPair") @NotNull String ccyPair, @NotNull @Query("side") String side, @NotNull @Query("orderSide") String orderSide, @Query("amount") long amount);

    @GET("/fee-breakdown/{id}")
    @NotNull
    d0<d> getRetailFeeBreakdown(@Path("id") @NotNull String id10);
}
