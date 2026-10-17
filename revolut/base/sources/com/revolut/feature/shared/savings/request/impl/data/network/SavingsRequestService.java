package com.revolut.feature.shared.savings.request.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import scd.c;
import wj0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/request/impl/data/network/SavingsRequestService;", "", "", "Lscd/c;", "getSavingAccountRequests", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwj0/b;", "idempotencyTag", "requestSavingAccount", "(Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requestId", "", "deleteSavingAccount", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remindSavingAccount", "feature_shared_savings_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsRequestService {
    @DELETE("/youth/savings/account-requests/{id}")
    Object deleteSavingAccount(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/youth/savings/account-requests")
    Object getSavingAccountRequests(@NotNull Continuation<? super List<c>> continuation);

    @POST("/youth/savings/account-requests/{id}/remind")
    Object remindSavingAccount(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/youth/savings/account-requests")
    Object requestSavingAccount(@Tag @NotNull b bVar, @NotNull Continuation<? super c> continuation);
}
