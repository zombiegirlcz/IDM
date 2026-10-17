package com.revolut.feature.insurance_embedded.impl.data.network;

import bu7.k;
import com.revolut.feature.insurance_embedded.impl.data.model.o0;
import du7.d6;
import du7.l4;
import du7.x5;
import gu7.g4;
import gu7.j1;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001b¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/network/InsuranceEmbeddedService;", "", "", "insuranceId", "subtype", "Ldu7/x5;", "getInsuranceDetails", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insuranceProduct", "", "activateSalaryInsurance", "Ldu7/l4;", "getInsuranceDetailsLayout", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbu7/k;", "coverageGroup", "Lgu7/j1;", "getCoverage", "(Lbu7/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "pricingPlansIds", "Lgu7/g4;", "getPlanComparison", "(Lbu7/k;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "policyId", "Ldu7/d6;", "getDynamicInsuranceClaimUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "product", "Lcom/revolut/feature/insurance_embedded/impl/data/model/o0;", "getSchemeInsuranceDetails", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InsuranceEmbeddedService {
    @GET("insurance/embedded/home/{coveragesGroup}")
    Object getCoverage(@Path("coveragesGroup") @NotNull k kVar, @NotNull Continuation<? super j1> continuation);

    @GET("insurance/{policyId}/claim-url")
    Object getDynamicInsuranceClaimUrl(@Path("policyId") @NotNull String str, @NotNull Continuation<? super d6> continuation);

    @GET("insurance/{id}/details")
    Object getInsuranceDetails(@Path("id") @NotNull String str, @NotNull @Query("subtype") String str2, @NotNull Continuation<? super x5> continuation);

    @GET("/insurance/insurance-details-layout")
    Object getInsuranceDetailsLayout(@NotNull @Query("product") String str, @Query("activateSalaryInsurance") Boolean bool, @NotNull Continuation<? super l4> continuation);

    @GET("insurance/embedded/home/plan-selector/{coveragesGroup}")
    Object getPlanComparison(@Path("coveragesGroup") @NotNull k kVar, @NotNull @Query("pricingPlanIds") List<String> list, @NotNull Continuation<? super g4> continuation);

    @GET("insurance/scheme/insurance-details")
    Object getSchemeInsuranceDetails(@NotNull @Query("product") String str, @NotNull Continuation<? super o0> continuation);
}
