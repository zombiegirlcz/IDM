package com.revolut.feature_retail_user_declarations.purpose.service;

import hci.a;
import hci.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/service/PurposeOfAccountService;", "", "Lhci/b;", "purposes", "Lretrofit2/Response;", "", "submitPurposes", "(Lhci/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhci/a;", "getCatalog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PurposeOfAccountService {
    @GET("/account-purposes/catalog")
    Object getCatalog(@NotNull Continuation<? super a> continuation);

    @PUT("/account-purposes")
    Object submitPurposes(@Body @NotNull b bVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
