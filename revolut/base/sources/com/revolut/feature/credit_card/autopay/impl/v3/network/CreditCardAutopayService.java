package com.revolut.feature.credit_card.autopay.impl.v3.network;

import ac5.a;
import ac5.d;
import ac5.e;
import ac5.k;
import ac5.o;
import ac5.q;
import ac5.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0006J$\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/impl/v3/network/CreditCardAutopayService;", "", "", "facilityId", "Lac5/r;", "getAutopayPayments", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lac5/k;", "body", "Lac5/o;", "createAutopayPayment", "(Ljava/lang/String;Lac5/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lac5/q;", "updateAutopayPayment", "(Ljava/lang/String;Lac5/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lac5/a;", "getAutopayConfig", "Lac5/d;", "", "createDirectDebitMandate", "(Ljava/lang/String;Lac5/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mandateId", "Lac5/e;", "getDirectDebitMandate", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDirectDebitMandate", "selectDirectDebitMandate", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardAutopayService {
    @POST("/credit/{facilityId}/auto-payment/v3")
    Object createAutopayPayment(@Path("facilityId") @NotNull String str, @Body @NotNull k kVar, @NotNull Continuation<? super o> continuation);

    @POST("/credit/{facilityId}/mandate")
    Object createDirectDebitMandate(@Path("facilityId") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super Unit> continuation);

    @DELETE("/credit/{facilityId}/mandate/{mandateId}")
    Object deleteDirectDebitMandate(@Path("facilityId") @NotNull String str, @Path("mandateId") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @GET("/credit/{facilityId}/auto-payment/v3/config")
    Object getAutopayConfig(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("/credit/{facilityId}/auto-payment/v3")
    Object getAutopayPayments(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super r> continuation);

    @GET("/credit/{facilityId}/mandate/{mandateId}")
    Object getDirectDebitMandate(@Path("facilityId") @NotNull String str, @Path("mandateId") @NotNull String str2, @NotNull Continuation<? super e> continuation);

    @POST("/credit/{facilityId}/mandate/{mandateId}/select")
    Object selectDirectDebitMandate(@Path("facilityId") @NotNull String str, @Path("mandateId") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/credit/{facilityId}/auto-payment/v3")
    Object updateAutopayPayment(@Path("facilityId") @NotNull String str, @Body @NotNull q qVar, @NotNull Continuation<? super o> continuation);
}
