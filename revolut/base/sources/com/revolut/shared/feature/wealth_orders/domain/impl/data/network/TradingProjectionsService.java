package com.revolut.shared.feature.wealth_orders.domain.impl.data.network;

import iil.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J8\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth_orders/domain/impl/data/network/TradingProjectionsService;", "", "", "type", "securityRef", "startDate", "period", "Liil/a;", "getTradingProjections", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_wealth_orders_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingProjectionsService {
    @GET("/trading/projections/{type}")
    Object getTradingProjections(@Path("type") @NotNull String str, @NotNull @Query("securityRef") String str2, @NotNull @Query("startDate") String str3, @NotNull @Query("period") String str4, @NotNull Continuation<? super a> continuation);
}
