package com.revolut.feature.revolutpay.impl.data.service;

import e7c.f;
import e7c.g;
import e7c.h;
import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/data/service/RevolutPayDeferredPaymentsService;", "", "Lefm/d0;", "Le7c/h;", "getDeferredPayments", "()Lefm/d0;", "", "paymentId", "Le7c/g;", "getDeferredPayment", "(Ljava/lang/String;)Lefm/d0;", "Lefm/b;", "blockDeferredPayment", "(Ljava/lang/String;)Lefm/b;", "Le7c/f;", "getDeferredPaymentCheckDebit", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPayDeferredPaymentsService {
    @POST("revpay/upcoming-payments/{paymentId}/block")
    @NotNull
    b blockDeferredPayment(@Path("paymentId") @NotNull String paymentId);

    @GET("revpay/upcoming-payments/{paymentId}")
    @NotNull
    d0<g> getDeferredPayment(@Path("paymentId") @NotNull String paymentId);

    @GET("revpay/upcoming-payments/{paymentId}/debit-check")
    @NotNull
    d0<f> getDeferredPaymentCheckDebit(@Path("paymentId") @NotNull String paymentId);

    @GET("revpay/upcoming-payments")
    @NotNull
    d0<h> getDeferredPayments();
}
