package com.revolut.retail.feature.esim.impl.network;

import kfj.y0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lfj.e;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimPhoneNumberCheckoutService;", "", "", "idempotencyKey", "Llfj/e;", "esimPhoneNumberCheckoutRequestDto", "Lkfj/y0;", "postPhoneNumberCheckoutData", "(Ljava/lang/String;Llfj/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimPhoneNumberCheckoutService {
    @POST("/connect/phone-number-checkout")
    Object postPhoneNumberCheckoutData(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull e eVar, @NotNull Continuation<? super y0> continuation);
}
