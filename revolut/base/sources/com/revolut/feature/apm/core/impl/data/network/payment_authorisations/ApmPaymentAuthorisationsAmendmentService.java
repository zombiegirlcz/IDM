package com.revolut.feature.apm.core.impl.data.network.payment_authorisations;

import dz1.a;
import dz1.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\nJ$\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/payment_authorisations/ApmPaymentAuthorisationsAmendmentService;", "", "", "paymentMethod", "Ldz1/o;", "getPendingAmendments", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "amendmentId", "Ldz1/a;", "getAmendmentById", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "approveAmendment", "rejectAmendment", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmPaymentAuthorisationsAmendmentService {
    @POST("payments/authorisations/amendments/{amendmentId}/approve")
    Object approveAmendment(@Path("amendmentId") @NotNull String str, @NotNull @Query("paymentMethod") String str2, @NotNull Continuation<? super a> continuation);

    @GET("/payments/authorisations/amendments/{amendmentId}")
    Object getAmendmentById(@Path("amendmentId") @NotNull String str, @NotNull @Query("paymentMethod") String str2, @NotNull Continuation<? super a> continuation);

    @GET("/payments/authorisations/amendments")
    Object getPendingAmendments(@NotNull @Query("paymentMethod") String str, @NotNull Continuation<? super o> continuation);

    @POST("payments/authorisations/amendments/{amendmentId}/reject")
    Object rejectAmendment(@Path("amendmentId") @NotNull String str, @NotNull @Query("paymentMethod") String str2, @NotNull Continuation<? super a> continuation);
}
