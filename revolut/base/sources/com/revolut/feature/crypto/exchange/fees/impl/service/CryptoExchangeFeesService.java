package com.revolut.feature.crypto.exchange.fees.impl.service;

import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacade;
import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacadeV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H§@¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/service/CryptoExchangeFeesService;", "", "getCryptoExchangeFees", "", "Lcom/revolut/feature/crypto/exchange/fees/impl/model/CryptoExchangeFeesFacade;", "pricingPlanIds", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentCryptoExchangeFees", "Lcom/revolut/feature/crypto/exchange/fees/impl/model/CryptoExchangeFeesFacadeV2;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoExchangeFeesService {
    @GET("/crypto-pricing/tiers")
    Object getCryptoExchangeFees(@NotNull @Query("planId") List<String> list, @NotNull Continuation<? super List<CryptoExchangeFeesFacade>> continuation);

    @GET("/crypto-pricing/current")
    Object getCurrentCryptoExchangeFees(@NotNull Continuation<? super CryptoExchangeFeesFacadeV2> continuation);
}
