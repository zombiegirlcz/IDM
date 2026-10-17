package com.trustdockekyc.core.backend.internal.infrastructure.api;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.projectapi.PostVerificationsResponse;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.projectapi.PostVerificationsTransactionsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0003\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/p;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/projectapi/PostVerificationsResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "verificationId", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/projectapi/PostVerificationsTransactionsResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface p {
    @POST("/verifications/{verification_id}/transactions")
    Object a(@Path("verification_id") @NotNull String str, @NotNull Continuation<? super PostVerificationsTransactionsResponse> continuation);

    @POST("/verifications")
    Object a(@NotNull Continuation<? super PostVerificationsResponse> continuation);
}
