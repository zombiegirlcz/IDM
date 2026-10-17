package com.revolut.feature.pix.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import l8a.p;
import l8a.q;
import l8a.r;
import l8a.s;
import l8a.s0;
import l8a.w0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\bJ\u001a\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0010\u0010\bJ$\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0014\u0010\bJ$\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001b\u0010\bJ\u001a\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001c\u0010\b¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/impl/data/network/PixAuthorisationsService;", "", "Ll8a/s;", "getPendingAuthorisations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "paymentMethod", "getInactiveAuthorisations", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authorisationId", "Ll8a/s0;", "getAuthorisation", "Ll8a/r;", "body", "createAuthorisation", "(Ll8a/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "approveAuthorisation", "Ll8a/p;", "rejectAuthorisation", "(Ljava/lang/String;Ll8a/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateAuthorisation", "Ll8a/w0;", "updateAuthorisationSettings", "(Ljava/lang/String;Ll8a/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8a/q;", "updateTransactionLimit", "(Ljava/lang/String;Ll8a/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransactionLimit", "cancelNextPayment", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixAuthorisationsService {
    @POST("/payments/authorisations/{authorisationId}/approve")
    Object approveAuthorisation(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super s0> continuation);

    @POST("/payments/authorisations/{authorisationId}/cancel-next-payment")
    Object cancelNextPayment(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super s0> continuation);

    @POST("/payments/authorisations")
    Object createAuthorisation(@Body @NotNull r rVar, @NotNull Continuation<? super s0> continuation);

    @POST("/payments/authorisations/{authorisationId}/deactivate")
    Object deactivateAuthorisation(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super s0> continuation);

    @DELETE("/payments/authorisations/{authorisationId}/transaction-limit")
    Object deleteTransactionLimit(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super s0> continuation);

    @GET("/payments/authorisations/{authorisationId}")
    Object getAuthorisation(@Path("authorisationId") @NotNull String str, @NotNull Continuation<? super s0> continuation);

    @GET("/payments/authorisations/inactive")
    Object getInactiveAuthorisations(@NotNull @Query("paymentMethod") String str, @NotNull Continuation<? super s> continuation);

    @GET("/payments/authorisations/pending")
    Object getPendingAuthorisations(@NotNull Continuation<? super s> continuation);

    @POST("/payments/authorisations/{authorisationId}/reject")
    Object rejectAuthorisation(@Path("authorisationId") @NotNull String str, @Body @NotNull p pVar, @NotNull Continuation<? super s0> continuation);

    @PATCH("/payments/authorisations/{authorisationId}")
    Object updateAuthorisationSettings(@Path("authorisationId") @NotNull String str, @Body @NotNull w0 w0Var, @NotNull Continuation<? super s0> continuation);

    @PATCH("/payments/authorisations/{authorisationId}/transaction-limit")
    Object updateTransactionLimit(@Path("authorisationId") @NotNull String str, @Body @NotNull q qVar, @NotNull Continuation<? super s0> continuation);
}
