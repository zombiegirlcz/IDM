package com.revolut.feature.external_accounts.impl.repository.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import wj0.b;
import yh6.k;
import yh6.m;
import yh6.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/repository/network/IndiaUpiService;", "", "", "methodType", "Lyh6/m;", "getUpiApps", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyh6/k;", "topUpRequestDto", "Lwj0/b;", "idempotencyTag", "Lyh6/q;", "handleIndiaUpiApp", "(Lyh6/k;Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IndiaUpiService {
    @GET("topup/methods/{methodType}/details")
    Object getUpiApps(@Path("methodType") @NotNull String str, @NotNull Continuation<? super m> continuation);

    @POST("/topup/{methodType}")
    Object handleIndiaUpiApp(@Body @NotNull k kVar, @Path("methodType") @NotNull String str, @Tag b bVar, @NotNull Continuation<? super q> continuation);
}
