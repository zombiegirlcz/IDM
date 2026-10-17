package com.revolut.feature.apm.core.impl.money_requests.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import rz1.a;
import wj0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\u000bJ$\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/money_requests/data/network/ApmMoneyRequestsActionsService;", "", "", "id", "Lwj0/b;", "idempotencyTag", "Lrz1/b;", "approveMoneyRequest", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrz1/a;", "body", "(Ljava/lang/String;Lrz1/a;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectMoneyRequest", "Lretrofit2/Response;", "", "cancelMoneyRequest", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmMoneyRequestsActionsService {
    @POST("apm/money-requests/{id}/accept")
    Object approveMoneyRequest(@Path("id") @NotNull String str, @Body @NotNull a aVar, @Tag @NotNull b bVar, @NotNull Continuation<? super rz1.b> continuation);

    @POST("apm/money-requests/{id}/accept")
    Object approveMoneyRequest(@Path("id") @NotNull String str, @Tag @NotNull b bVar, @NotNull Continuation<? super rz1.b> continuation);

    @DELETE("apm/money-requests/{id}")
    Object cancelMoneyRequest(@Path("id") @NotNull String str, @Tag @NotNull b bVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("apm/money-requests/{id}/reject")
    Object rejectMoneyRequest(@Path("id") @NotNull String str, @Tag @NotNull b bVar, @NotNull Continuation<? super rz1.b> continuation);
}
