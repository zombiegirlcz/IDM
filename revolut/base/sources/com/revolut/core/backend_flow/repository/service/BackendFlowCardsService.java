package com.revolut.core.backend_flow.repository.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import q90.g;
import q90.h;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/repository/service/BackendFlowCardsService;", "", "", "formId", "itemId", "Lq90/h;", "getCards", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardId", "cardType", "Lq90/g;", "getCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BackendFlowCardsService {
    @GET("forms/{formId}/cards/{cardId}")
    Object getCard(@Path("formId") @NotNull String str, @Path("cardId") @NotNull String str2, @NotNull @Query("cardType") String str3, @NotNull Continuation<? super g> continuation);

    @GET("forms/{formId}/cards")
    Object getCards(@Path("formId") @NotNull String str, @NotNull @Query("itemId") String str2, @NotNull Continuation<? super h> continuation);
}
