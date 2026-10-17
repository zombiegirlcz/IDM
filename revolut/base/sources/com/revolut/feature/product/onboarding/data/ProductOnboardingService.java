package com.revolut.feature.product.onboarding.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qja.j;
import qja.l;
import qja.m;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/product/onboarding/data/ProductOnboardingService;", "", "", "productType", "currentStep", "declarationType", "Lqja/m;", "getOnboardingSteps", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqja/j;", "body", "", "submitDeclarationStep", "(Ljava/lang/String;Lqja/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "featureName", "Lqja/l;", "getProductActivationWorkflow", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductOnboardingService {
    @POST("/product-onboarding/steps")
    Object getOnboardingSteps(@Query("productType") String str, @Query("currentStep") String str2, @Query("declarationType") String str3, @NotNull Continuation<? super m> continuation);

    @POST("/product-onboarding")
    Object getProductActivationWorkflow(@NotNull @Query("productType") String str, @Query("featureName") String str2, @NotNull Continuation<? super l> continuation);

    @POST("/product-onboarding/declaration/{declarationType}")
    Object submitDeclarationStep(@Path("declarationType") @NotNull String str, @Body @NotNull j jVar, @NotNull Continuation<? super Unit> continuation);
}
