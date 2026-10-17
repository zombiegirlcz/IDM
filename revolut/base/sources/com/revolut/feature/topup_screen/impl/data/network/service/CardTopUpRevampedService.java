package com.revolut.feature.topup_screen.impl.data.network.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pue.a;
import pue.c;
import pue.d;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\t2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/CardTopUpRevampedService;", "", "Lpue/c;", "body", "Lwj0/b;", "idempotencyTag", "Lpue/b;", "createTopUp", "(Lpue/c;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpue/a;", "createPennyTopUp", "(Lpue/a;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transactionId", "walletId", "Lpue/d;", "getCardTopUpState", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardTopUpRevampedService {
    @POST("/topup/penny")
    Object createPennyTopUp(@Body @NotNull a aVar, @Tag @NotNull b bVar, @NotNull Continuation<? super pue.b> continuation);

    @POST("/topup/v2/create")
    Object createTopUp(@Body @NotNull c cVar, @Tag @NotNull b bVar, @NotNull Continuation<? super pue.b> continuation);

    @GET("/topup/card/{transactionId}/status")
    Object getCardTopUpState(@Path("transactionId") @NotNull String str, @Query("walletId") String str2, @NotNull Continuation<? super d> continuation);
}
