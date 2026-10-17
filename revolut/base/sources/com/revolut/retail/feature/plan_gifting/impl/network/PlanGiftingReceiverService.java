package com.revolut.retail.feature.plan_gifting.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import vbk.c;
import vbk.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/network/PlanGiftingReceiverService;", "", "", "giftId", "Lvbk/f;", "getIntro", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idempotencyKey", "Lvbk/c;", "claimGift", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanGiftingReceiverService {
    @POST("/plans/gifts/{pricingPlanGiftId}/claim")
    Object claimGift(@Path("pricingPlanGiftId") @NotNull String str, @Header("X-Idempotency-Key") @NotNull String str2, @NotNull Continuation<? super c> continuation);

    @GET("/plans/gifts/{pricingPlanGiftId}")
    Object getIntro(@Path("pricingPlanGiftId") @NotNull String str, @NotNull Continuation<? super f> continuation);
}
