package com.revolut.feature.checkout.impl.services;

import ci3.c;
import ii3.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/checkout/impl/services/CheckoutService;", "", "", "walletId", "", "checkCampaignAssignment", "", "Lci3/c;", "getPreorders", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "", "cancelPreorders", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardId", "Lii3/a;", "body", "updatePreorder", "(Ljava/lang/String;Lii3/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_checkout_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckoutService {
    @DELETE("preorders")
    Object cancelPreorders(@NotNull @Query("id") List<String> list, @NotNull Continuation<? super Unit> continuation);

    @GET("preorders")
    Object getPreorders(@Query("walletId") String str, @Query("checkCampaignAssignment") Boolean bool, @NotNull Continuation<? super List<c>> continuation);

    @PUT("my-card/issue/preorder")
    Object updatePreorder(@NotNull @Query("cardId") String str, @Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);
}
