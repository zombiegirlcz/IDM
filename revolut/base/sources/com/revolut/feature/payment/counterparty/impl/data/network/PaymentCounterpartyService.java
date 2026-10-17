package com.revolut.feature.payment.counterparty.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import wn9.a;
import wn9.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payment/counterparty/impl/data/network/PaymentCounterpartyService;", "", "", "id", "Lwn9/a;", "getCounterpartyById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getPaymentCounterparties", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn9/b;", "body", "", "updatePaymentCounterparty", "(Ljava/lang/String;Lwn9/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePaymentCounterparty", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentCounterpartyService {
    @DELETE("/counterparties/{id}")
    Object deletePaymentCounterparty(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/counterparties/{id}")
    Object getCounterpartyById(@Path("id") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("/counterparties")
    Object getPaymentCounterparties(@NotNull Continuation<? super List<a>> continuation);

    @PATCH("/counterparties/{id}")
    Object updatePaymentCounterparty(@Path("id") @NotNull String str, @Body @NotNull b bVar, @NotNull Continuation<? super Unit> continuation);
}
