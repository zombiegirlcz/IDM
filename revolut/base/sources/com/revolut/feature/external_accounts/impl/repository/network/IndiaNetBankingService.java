package com.revolut.feature.external_accounts.impl.repository.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import yh6.b;
import yh6.e;
import yh6.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/repository/network/IndiaNetBankingService;", "", "Lyh6/b;", "getNetBankingInstitutions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyh6/k;", "topUpRequestDto", "", "methodType", "Lwj0/b;", "idempotencyTag", "Lyh6/e;", "startNetBankingTopUp", "(Lyh6/k;Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compoundId", "Lokhttp3/ResponseBody;", "getNetBankingContent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IndiaNetBankingService {
    @Headers({"Content-Type: text/html"})
    @GET("/topup/{compoundId}/content")
    Object getNetBankingContent(@Path("compoundId") @NotNull String str, @NotNull Continuation<? super ResponseBody> continuation);

    @GET("/topup/methods/net_banking/details")
    Object getNetBankingInstitutions(@NotNull Continuation<? super b> continuation);

    @POST("/topup/{methodType}")
    Object startNetBankingTopUp(@Body @NotNull k kVar, @Path("methodType") @NotNull String str, @Tag wj0.b bVar, @NotNull Continuation<? super e> continuation);
}
