package com.revolut.retail.feature.plan_gifting.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/network/PlanGiftingLifecycleService;", "", "cancelGift", "Lretrofit2/Response;", "", "giftId", "", "idempotencyKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanGiftingLifecycleService {
    @POST("/pricing-plan-gifts/{pricingPlanGiftId}/cancel")
    Object cancelGift(@Path("pricingPlanGiftId") @NotNull String str, @Header("X-Idempotency-Key") @NotNull String str2, @NotNull Continuation<? super Response<Unit>> continuation);
}
