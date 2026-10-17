package com.revolut.feature.revolutpay.impl.data.service;

import j7c.a;
import j7c.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/data/service/MerchantAppVerificationService;", "", "", "merchantPublicKey", "Lj7c/a;", "request", "", "verifyMerchantApp", "(Ljava/lang/String;Lj7c/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj7c/b;", "verifyWebPaymentRequest", "(Lj7c/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MerchantAppVerificationService {
    @Headers({"X-Force-App-Auth: true"})
    @POST("revpay/verify-merchant-app")
    Object verifyMerchantApp(@Header("Revolut-Pay-Merchant-Public-Key") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);

    @Headers({"X-Force-App-Auth: true"})
    @POST("revpay/verify-web-payment-request")
    Object verifyWebPaymentRequest(@Body @NotNull b bVar, @NotNull Continuation<? super Unit> continuation);
}
