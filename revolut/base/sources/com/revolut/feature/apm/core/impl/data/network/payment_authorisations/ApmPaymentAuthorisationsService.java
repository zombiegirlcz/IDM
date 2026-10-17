package com.revolut.feature.apm.core.impl.data.network.payment_authorisations;

import dz1.b;
import dz1.i;
import dz1.l;
import dz1.q;
import dz1.r;
import k02.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0006J\u001a\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0006J\u001a\u0010\u001b\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0006¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/payment_authorisations/ApmPaymentAuthorisationsService;", "", "", "paymentMethod", "Ldz1/r;", "getPaymentAuthorisations", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInactivePaymentAuthorisations", "authorisationId", "Lk02/e;", "getPaymentAuthorisationsById", "Ldz1/i;", "body", "createPaymentAuthorisations", "(Ldz1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldz1/l;", "updatePaymentAuthorisation", "(Ljava/lang/String;Ldz1/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Ldz1/b;", "approvePaymentAuthorisations", "(Ljava/lang/String;Ldz1/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldz1/q;", "rejectPaymentAuthorisations", "(Ljava/lang/String;Ldz1/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivatePaymentAuthorisation", "pausePaymentAuthorisation", "unpausePaymentAuthorisation", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmPaymentAuthorisationsService {
    @POST("/payments/authorisations/{id}/approve")
    Object approvePaymentAuthorisations(@Path("id") @NotNull String str, @Body @NotNull b bVar, @NotNull Continuation<? super e> continuation);

    @POST("/payments/authorisations")
    Object createPaymentAuthorisations(@Body @NotNull i iVar, @NotNull Continuation<? super e> continuation);

    @POST("/payments/authorisations/{authorisationId}/deactivate")
    Object deactivatePaymentAuthorisation(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @GET("/payments/authorisations/inactive")
    Object getInactivePaymentAuthorisations(@NotNull @Query("paymentMethod") String str, @NotNull Continuation<? super r> continuation);

    @GET("/payments/authorisations/pending")
    Object getPaymentAuthorisations(@NotNull @Query("paymentMethod") String str, @NotNull Continuation<? super r> continuation);

    @GET("/payments/authorisations/{authorisationId}")
    Object getPaymentAuthorisationsById(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @POST("/payments/authorisations/{authorisationId}/pause")
    Object pausePaymentAuthorisation(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @POST("/payments/authorisations/{id}/reject")
    Object rejectPaymentAuthorisations(@Path("id") @NotNull String str, @Body @NotNull q qVar, @NotNull Continuation<? super e> continuation);

    @POST("/payments/authorisations/{authorisationId}/unpause")
    Object unpausePaymentAuthorisation(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @PATCH("/payments/authorisations/{authorisationId}")
    Object updatePaymentAuthorisation(@Path("authorisationId") @NotNull String str, @Body @NotNull l lVar, @NotNull Continuation<? super e> continuation);
}
