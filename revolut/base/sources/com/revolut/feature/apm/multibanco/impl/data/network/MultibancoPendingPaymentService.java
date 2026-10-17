package com.revolut.feature.apm.multibanco.impl.data.network;

import e72.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/data/network/MultibancoPendingPaymentService;", "", "", "Le72/e;", "getPendingPayments", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "", "postConfirmPendingPayment", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postRejectPendingPayment", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoPendingPaymentService {
    @GET("mbway/payments")
    Object getPendingPayments(@NotNull Continuation<? super List<e>> continuation);

    @POST("mbway/payments/{id}/confirm")
    Object postConfirmPendingPayment(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("mbway/payments/{id}/reject")
    Object postRejectPendingPayment(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
