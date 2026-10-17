package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lt6.b;
import lt6.f;
import mt6.a;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0080\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/AcquiringPaymentsService;", "", "", "search", "", "from", "to", "", "states", "paymentMethods", "currencies", "pageToken", "", "limit", "Llt6/f;", "getPayments", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Llt6/b;", "getPayment", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmt6/a;", "getTimeline", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AcquiringPaymentsService {
    @GET("/acquiring/merchant/payments/{id}")
    Object getPayment(@Path("id") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @GET("/acquiring/merchant/payments")
    Object getPayments(@Query("search") String str, @Query("from") Long l2, @Query("to") Long l3, @Query("state") List<String> list, @Query("paymentMethod") List<String> list2, @Query("currency") List<String> list3, @Query("pageToken") String str2, @Query("limit") int i, @NotNull Continuation<? super f> continuation);

    @GET("/acquiring/merchant/payments/{id}/timeline")
    Object getTimeline(@Path("id") @NotNull String str, @NotNull Continuation<? super List<a>> continuation);
}
