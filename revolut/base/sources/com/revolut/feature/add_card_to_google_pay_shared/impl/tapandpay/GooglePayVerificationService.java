package com.revolut.feature.add_card_to_google_pay_shared.impl.tapandpay;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import yg1.e;
import yg1.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/tapandpay/GooglePayVerificationService;", "", "", "cardId", "Lyg1/e;", "opc", "Lefm/d0;", "Lyg1/f;", "getOpc", "(Ljava/lang/String;Lyg1/e;)Lefm/d0;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GooglePayVerificationService {
    @POST("/my-card/{cardId}/digital-wallets/google-pay/provision")
    @NotNull
    d0<f> getOpc(@Path("cardId") @NotNull String cardId, @Body @NotNull e opc2);
}
