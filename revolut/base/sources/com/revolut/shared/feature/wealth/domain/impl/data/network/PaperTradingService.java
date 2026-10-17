package com.revolut.shared.feature.wealth.domain.impl.data.network;

import kdl.c;
import kdl.f;
import kdl.l;
import kdl.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH§@¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\rH§@¢\u0006\u0004\b\u0014\u0010\u0004¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/PaperTradingService;", "", "Lkdl/f;", "getIndustries", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ref", "Lkdl/l;", "getInstrumentIndustry", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idempotencyKey", "Lkdl/c;", "request", "", "allocateOrders", "(Ljava/lang/String;Lkdl/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkdl/r;", "swapOrders", "(Ljava/lang/String;Lkdl/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leaveGame", "rejoinGame", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaperTradingService {
    @POST("paper-trading/orders/allocation")
    Object allocateOrders(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @GET("paper-trading/industries")
    Object getIndustries(@NotNull Continuation<? super f> continuation);

    @GET("paper-trading/instruments/{ref}/industry")
    Object getInstrumentIndustry(@Path("ref") @NotNull String str, @NotNull Continuation<? super l> continuation);

    @POST("paper-trading/user/leave")
    Object leaveGame(@NotNull Continuation<? super Unit> continuation);

    @POST("paper-trading/user/rejoin")
    Object rejoinGame(@NotNull Continuation<? super Unit> continuation);

    @POST("paper-trading/orders/swap")
    Object swapOrders(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull r rVar, @NotNull Continuation<? super Unit> continuation);
}
