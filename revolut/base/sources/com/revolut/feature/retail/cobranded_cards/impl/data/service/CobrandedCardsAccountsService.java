package com.revolut.feature.retail.cobranded_cards.impl.data.service;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import w5b.d0;
import w5b.j0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0004J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/data/service/CobrandedCardsAccountsService;", "", "Lw5b/d0;", "getLinkAccountInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCreateAccountInfo", "", "", "body", "Lretrofit2/Response;", "Lw5b/j0;", "linkAccount", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "createAccount", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsAccountsService {
    @POST("co-brands/create-account")
    Object createAccount(@Body @NotNull Map<String, String> map, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("co-brands/create-account")
    Object getCreateAccountInfo(@NotNull Continuation<? super d0> continuation);

    @GET("co-brands/link-account")
    Object getLinkAccountInfo(@NotNull Continuation<? super d0> continuation);

    @POST("co-brands/link-account")
    Object linkAccount(@Body @NotNull Map<String, String> map, @NotNull Continuation<? super Response<j0>> continuation);
}
