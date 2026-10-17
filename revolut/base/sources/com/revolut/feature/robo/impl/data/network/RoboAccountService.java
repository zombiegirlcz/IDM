package com.revolut.feature.robo.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import slc.a;
import slc.b;
import slc.c;
import slc.d;
import slc.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0018\u0010\f¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/robo/impl/data/network/RoboAccountService;", "", "createPortfolio", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lefm/d0;", "Lslc/c;", "getUserInformation", "()Lefm/d0;", "", "portfolioId", "Lslc/d;", "getPortfolio", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lslc/b;", "body", "", "completePortfolio", "(Ljava/lang/String;Lslc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lslc/a;", "changeTemplate", "(Ljava/lang/String;Lslc/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lslc/e;", "updateGoal", "(Ljava/lang/String;Lslc/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGoal", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RoboAccountService {
    @POST("trading/robo/portfolios/{portfolioId}/change-template")
    Object changeTemplate(@Path("portfolioId") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);

    @POST("trading/robo/portfolios/{portfolioId}/complete")
    Object completePortfolio(@Path("portfolioId") @NotNull String str, @Body @NotNull b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("trading/robo/users/current/portfolios")
    Object createPortfolio(@NotNull Continuation<Object> continuation);

    @DELETE("trading/robo/portfolios/{portfolioId}/goal")
    Object deleteGoal(@Path("portfolioId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("trading/robo/portfolios/{portfolioId}")
    Object getPortfolio(@Path("portfolioId") @NotNull String str, @NotNull Continuation<? super d> continuation);

    @GET("trading/robo/users/current")
    @NotNull
    d0<c> getUserInformation();

    @PATCH("trading/robo/portfolios/{portfolioId}/goal")
    Object updateGoal(@Path("portfolioId") @NotNull String str, @Body @NotNull e eVar, @NotNull Continuation<? super Unit> continuation);
}
