package com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts;

import java.util.UUID;
import jj0.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import sdl.d1;
import sdl.r;
import sdl.x0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ4\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u0012\u001a\u00020\nH§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/trading_accounts/TradingAccountsService;", "", "Lsdl/x0;", "getTradingAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "id", "Lsdl/d1;", "getTradingProductDetails", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "availableAccountId", "accountType", "beneficiaryId", "Lsdl/r;", "createTradingAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountId", "productCode", "", "offboardProduct", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingAccountsService {
    @POST("/trading/accounts")
    Object createTradingAccount(@Query("availableAccountId") String str, @Query("accountType") String str2, @Query("beneficiaryId") String str3, @NotNull Continuation<? super r> continuation);

    @d(tokenId = "Widget")
    @GET("/trading/accounts")
    Object getTradingAccounts(@NotNull Continuation<? super x0> continuation);

    @GET("/trading/products/{id}")
    Object getTradingProductDetails(@Path("id") @NotNull UUID uuid, @NotNull Continuation<? super d1> continuation);

    @DELETE("/trading-access/accounts/{accountId}/products/{productCode}")
    Object offboardProduct(@Path("accountId") @NotNull String str, @Path("productCode") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);
}
