package com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.data.network;

import dn1.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/finder/onboarding/data/network/ProductFeatureOnboardingService;", "", "Ldn1/a;", "getFeatureProfile", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerFeature", "", "unregisterFeature", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductFeatureOnboardingService {
    @GET("user/feature-profile/BOLETO_DDA")
    Object getFeatureProfile(@NotNull Continuation<? super a> continuation);

    @POST("user/feature-profile/BOLETO_DDA")
    Object registerFeature(@NotNull Continuation<? super a> continuation);

    @DELETE("user/feature-profile/BOLETO_DDA")
    Object unregisterFeature(@NotNull Continuation<? super Unit> continuation);
}
