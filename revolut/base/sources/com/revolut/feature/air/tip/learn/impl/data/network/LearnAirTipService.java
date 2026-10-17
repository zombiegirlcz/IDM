package com.revolut.feature.air.tip.learn.impl.data.network;

import bk1.c;
import bk1.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/air/tip/learn/impl/data/network/LearnAirTipService;", "", "", "securityRef", "productType", "Lretrofit2/Response;", "Lbk1/c;", "getLearnAirTip", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tipId", "Lbk1/e;", "markAirTipAsViewed", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "markAirTipAsOpened", "feature_air_tip_learn_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LearnAirTipService {
    @GET("/trading/user-tips")
    Object getLearnAirTip(@Query("securityRef") String str, @Query("productType") String str2, @NotNull Continuation<? super Response<c>> continuation);

    @POST("/trading/user-tips/{tipId}/open")
    Object markAirTipAsOpened(@Path("tipId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/trading/user-tips/{tipId}/view")
    Object markAirTipAsViewed(@Path("tipId") @NotNull String str, @NotNull Continuation<? super Response<e>> continuation);
}
