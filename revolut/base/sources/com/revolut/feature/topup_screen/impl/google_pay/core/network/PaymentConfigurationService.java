package com.revolut.feature.topup_screen.impl.google_pay.core.network;

import efm.d0;
import jo3.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/google_pay/core/network/PaymentConfigurationService;", "", "Ljo3/a;", "money", "Lefm/d0;", "", "getGooglePayPaymentConfiguration", "(Ljo3/a;)Lefm/d0;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentConfigurationService {
    @POST("/config/gateway/google-pay")
    @NotNull
    d0<String> getGooglePayPaymentConfiguration(@Body @NotNull a money);
}
