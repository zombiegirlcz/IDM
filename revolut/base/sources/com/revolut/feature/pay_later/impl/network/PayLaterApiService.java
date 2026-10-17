package com.revolut.feature.pay_later.impl.network;

import dj9.a;
import dj9.b0;
import dj9.c;
import dj9.d;
import dj9.e0;
import dj9.f0;
import dj9.g0;
import dj9.h;
import dj9.j;
import dj9.k;
import dj9.o;
import dj9.p;
import dj9.s;
import dj9.t;
import dj9.u;
import dj9.z;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 L2\u00020\u0001:\u0001MJ\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u0004J$\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H'¢\u0006\u0004\b\u0011\u0010\bJ\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00172\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001a0\u00052\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010%\u001a\u00020#H'¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020 2\b\b\u0001\u0010)\u001a\u00020#2\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020 2\b\b\u0001\u0010.\u001a\u00020#H'¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00052\b\b\u0001\u0010.\u001a\u00020#H'¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0005H'¢\u0006\u0004\b5\u0010\bJ\u001a\u00107\u001a\u0002062\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u0002092\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b:\u00108J$\u0010=\u001a\u00020<2\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010;\u001a\u00020#H§@¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020@2\b\b\u0001\u0010?\u001a\u00020#H§@¢\u0006\u0004\bA\u00108J\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00052\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\bC\u00103J\u0010\u0010E\u001a\u00020DH§@¢\u0006\u0004\bE\u0010\u0004J\u0010\u0010G\u001a\u00020FH§@¢\u0006\u0004\bG\u0010\u0004J\u001a\u0010J\u001a\u00020H2\b\b\u0001\u0010I\u001a\u00020HH§@¢\u0006\u0004\bJ\u0010K¨\u0006NÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pay_later/impl/network/PayLaterApiService;", "", "Ldj9/a;", "getAccountConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lefm/d0;", "Ldj9/u;", "getPayLaterState", "()Lefm/d0;", "Ldj9/z;", "getPayLaterSwitchOptions", "", "purchaseAmount", "currentPocketBalance", "getPayLaterPurchaseSimulation", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldj9/u$a;", "turnOffPayLater", "Ldj9/b0;", "bodyDto", "Ldj9/u$b;", "turnOnPayLater", "(Ldj9/b0;)Lefm/d0;", "", "limit", "minUpdateDateTime", "", "Ldj9/o;", "getPayLaterPlans", "(ILjava/lang/Long;)Lefm/d0;", "Ldj9/s;", "repayDto", "Lefm/b;", "repay", "(Ldj9/s;)Lefm/b;", "", "facilityId", "transactionId", "Ldj9/t;", "getTransactionRepayments", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "requestId", "Ldj9/c;", "amountDto", "repayCustomAmount", "(Ljava/lang/String;Ldj9/c;)Lefm/b;", "planId", "cancelPlan", "(Ljava/lang/String;)Lefm/b;", "Ldj9/k;", "getPlanDetails", "(Ljava/lang/String;)Lefm/d0;", "Ldj9/d;", "getFeeSettings", "Ldj9/f0;", "getRightToCancelIntroContent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldj9/g0;", "getRightToCancelSummaryContent", "idempotencyKey", "Ldj9/e0;", "cancelFacility", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "creditLimitId", "", "deactivateCreditLimit", "Lrx4/b;", "getAgreements", "Ldj9/h;", "getInstalmentTypes", "Ldj9/j;", "getPaymentOptions", "Ldj9/p;", "body", "updatePaymentPreferredTerm", "(Ldj9/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayLaterApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f78870a;

    /* JADX INFO: renamed from: com.revolut.feature.pay_later.impl.network.PayLaterApiService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f78870a = new Companion();

        private Companion() {
        }
    }

    @POST("/paylater/v2/credit-limits/{facilityId}/cancellation/confirm")
    Object cancelFacility(@Path("facilityId") @NotNull String str, @Header("X-Idempotency-Key") @NotNull String str2, @NotNull Continuation<? super e0> continuation);

    @POST("/paylater/instalment-plans/{planId}/cancel")
    @NotNull
    b cancelPlan(@Path("planId") @NotNull String planId);

    @POST("/paylater/v2/credit-limits/{creditLimitId}/deactivate")
    Object deactivateCreditLimit(@Path("creditLimitId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/paylater/v2/account")
    Object getAccountConfig(@NotNull Continuation<? super a> continuation);

    @GET("/credit-application/credit-facility-v2/{facilityId}/agreement")
    @NotNull
    d0<rx4.b> getAgreements(@Path("facilityId") @NotNull String facilityId);

    @GET("/paylater/credit-limits/fee-settings")
    @NotNull
    d0<d> getFeeSettings();

    @GET("/paylater/v2/instalment-types")
    Object getInstalmentTypes(@NotNull Continuation<? super h> continuation);

    @GET("/paylater/v2/instalment-plans")
    @NotNull
    d0<List<o>> getPayLaterPlans(@Query("limit") int limit, @Query("minUpdateDateTime") Long minUpdateDateTime);

    @GET("/paylater/switch/options/simulate")
    Object getPayLaterPurchaseSimulation(@Query("purchaseAmount") long j2, @Query("currentBalance") long j3, @NotNull Continuation<? super z> continuation);

    @GET("/paylater/switch/status")
    @NotNull
    d0<u> getPayLaterState();

    @GET("/paylater/switch/options")
    Object getPayLaterSwitchOptions(@NotNull Continuation<? super z> continuation);

    @GET("/paylater/v2/payment-options")
    Object getPaymentOptions(@NotNull Continuation<? super j> continuation);

    @GET("/paylater/instalment-plans/{planId}/details")
    @NotNull
    d0<k> getPlanDetails(@Path("planId") @NotNull String planId);

    @GET("/paylater/v2/credit-limits/{facilityId}/cancellation/intro")
    Object getRightToCancelIntroContent(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super f0> continuation);

    @GET("/paylater/v2/credit-limits/{facilityId}/cancellation/summary")
    Object getRightToCancelSummaryContent(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super g0> continuation);

    @GET("/paylater/credit-limits/{facilityId}/repayments")
    @NotNull
    d0<List<t>> getTransactionRepayments(@Path("facilityId") @NotNull String facilityId, @NotNull @Query("transactionId") String transactionId);

    @POST("/paylater/manual-repayments")
    @NotNull
    b repay(@Body @NotNull s repayDto);

    @POST("/paylater/manual-repayments/custom-amount")
    @NotNull
    b repayCustomAmount(@Header("Request-Id") @NotNull String requestId, @Body @NotNull c amountDto);

    @POST("/paylater/switch/off")
    @NotNull
    d0<u.a> turnOffPayLater();

    @POST("/paylater/switch/on")
    @NotNull
    d0<u.b> turnOnPayLater(@Body @NotNull b0 bodyDto);

    @PUT("/paylater/v2/preferred-term")
    Object updatePaymentPreferredTerm(@Body @NotNull p pVar, @NotNull Continuation<? super p> continuation);
}
