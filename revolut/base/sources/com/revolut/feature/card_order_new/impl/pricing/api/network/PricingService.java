package com.revolut.feature.card_order_new.impl.pricing.api.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r33.a;
import r33.c;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJS\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010JS\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0012\u0010\f¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/pricing/api/network/PricingService;", "", "", "planId", "planDiscountId", "cardDesign", "cardBrand", "deliveryCountry", "deliveryMethod", "Lefm/d0;", "Lr33/c;", "getPricingPlanCancellationFee", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "", "deliveryMethods", "getPricingPlanCancellationFees", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lefm/d0;", "Lr33/a;", "getDowngradeFeeDisclosure", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingService {
    @GET("my-card/pricing/downgrade-fee-disclosure")
    @NotNull
    d0<a> getDowngradeFeeDisclosure(@NotNull @Query("planId") String planId, @NotNull @Query("cardDesign") String cardDesign, @NotNull @Query("cardBrand") String cardBrand, @NotNull @Query("deliveryCountry") String deliveryCountry, @NotNull @Query("deliveryMethod") String deliveryMethod, @Query("planDiscountId") String planDiscountId);

    @GET("my-card/pricing/plan-cancellation")
    @NotNull
    d0<c> getPricingPlanCancellationFee(@NotNull @Query("planId") String planId, @Query("planDiscountId") String planDiscountId, @NotNull @Query("cardDesign") String cardDesign, @NotNull @Query("cardBrand") String cardBrand, @NotNull @Query("deliveryCountry") String deliveryCountry, @NotNull @Query("deliveryMethod") String deliveryMethod);

    @GET("my-card/pricing/plan-cancellation-fees")
    @NotNull
    d0<List<c>> getPricingPlanCancellationFees(@NotNull @Query("planId") String planId, @NotNull @Query("cardDesign") String cardDesign, @NotNull @Query("cardBrand") String cardBrand, @NotNull @Query("deliveryCountry") String deliveryCountry, @NotNull @Query("deliveryMethods") List<String> deliveryMethods);
}
