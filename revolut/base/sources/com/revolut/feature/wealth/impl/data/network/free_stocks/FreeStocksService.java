package com.revolut.feature.wealth.impl.data.network.free_stocks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import s7h.l;
import s7h.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/free_stocks/FreeStocksService;", "", "Ls7h/l;", "getFreeStocksCampaign", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls7h/o;", "model", "", "submitStocks", "(Ls7h/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreeStocksService {
    @GET("/trading/free-stocks")
    Object getFreeStocksCampaign(@NotNull Continuation<? super l> continuation);

    @POST("/trading/free-stocks")
    Object submitStocks(@Body @NotNull o oVar, @NotNull Continuation<? super Unit> continuation);
}
