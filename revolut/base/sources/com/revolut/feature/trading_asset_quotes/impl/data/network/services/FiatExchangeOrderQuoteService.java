package com.revolut.feature.trading_asset_quotes.impl.data.network.services;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import vcf.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0001\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading_asset_quotes/impl/data/network/services/FiatExchangeOrderQuoteService;", "", "", "fromRef", "toRef", "orderType", "targetRate", "amountIn", "baseRateAsset", "amount", "", "standing", "walletId", "fromPocketId", "toPocketId", "fromSource", "marginQuoteFor", "Lvcf/a;", "getOrderQuote", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_trading_asset_quotes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FiatExchangeOrderQuoteService {
    @GET("trading-access/assets/quotes")
    Object getOrderQuote(@Query("fromRef") String str, @NotNull @Query("toRef") String str2, @NotNull @Query("orderType") String str3, @Query("targetRate") String str4, @NotNull @Query("amountIn") String str5, @NotNull @Query("baseRateAsset") String str6, @NotNull @Query("amount") String str7, @Query("standing") boolean z, @Query("walletId") String str8, @Query("fromPocketId") String str9, @Query("toPocketId") String str10, @Query("fromSource") String str11, @Query("marginQuoteFor") String str12, @NotNull Continuation<? super a> continuation);
}
