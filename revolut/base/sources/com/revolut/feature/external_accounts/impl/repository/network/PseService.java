package com.revolut.feature.external_accounts.impl.repository.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import wj0.b;
import yh6.b0;
import yh6.t;
import yh6.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/repository/network/PseService;", "", "Lyh6/t;", "getPseBanks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyh6/w;", "topUpRequestDto", "Lwj0/b;", "idempotencyTag", "Lyh6/b0;", "handlePseBank", "(Lyh6/w;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PseService {
    @GET("topup/methods/pse/details")
    Object getPseBanks(@NotNull Continuation<? super t> continuation);

    @POST("/topup/pse")
    Object handlePseBank(@Body @NotNull w wVar, @Tag b bVar, @NotNull Continuation<? super b0> continuation);
}
