package com.revolut.feature.apm.core.impl.money_requests.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import rz1.c;
import rz1.e;
import rz1.f;
import rz1.h;
import wj0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\tH§@¢\u0006\u0004\b\u0014\u0010\u0011¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/money_requests/data/network/ApmMoneyRequestsService;", "", "Lrz1/e;", "body", "Lwj0/b;", "idempotencyTag", "Lrz1/f;", "createMoneyRequest", "(Lrz1/e;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lretrofit2/Response;", "", "confirmMoneyRequest", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrz1/h;", "getOpenMoneyRequest", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethod", "Lrz1/c;", "getQuote", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmMoneyRequestsService {
    @POST("apm/money-requests/{id}/confirm")
    Object confirmMoneyRequest(@Path("id") @NotNull String str, @Tag @NotNull b bVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("apm/money-requests")
    Object createMoneyRequest(@Body @NotNull e eVar, @Tag @NotNull b bVar, @NotNull Continuation<? super f> continuation);

    @GET("apm/money-requests/{id}")
    Object getOpenMoneyRequest(@Path("id") @NotNull String str, @NotNull Continuation<? super h> continuation);

    @GET("money-request/quote")
    Object getQuote(@NotNull @Query("paymentMethod") String str, @NotNull Continuation<? super c> continuation);
}
