package com.revolut.feature.add_card_to_google_pay_shared.impl.tapandpay;

import efm.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import yg1.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/tapandpay/GooglePayCardActivationService;", "", "Lyg1/a;", "cardActivationDto", "Lefm/b;", "activateCard", "(Lyg1/a;)Lefm/b;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GooglePayCardActivationService {
    @POST("/my-card/digitized-cards/activate")
    @NotNull
    b activateCard(@Body @NotNull a cardActivationDto);
}
