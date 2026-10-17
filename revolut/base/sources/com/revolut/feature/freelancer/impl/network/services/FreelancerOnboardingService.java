package com.revolut.feature.freelancer.impl.network.services;

import com.revolut.feature.freelancer.impl.network.models.d;
import com.revolut.feature.freelancer.impl.network.models.e0;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import st6.a;
import st6.c;
import st6.e;
import st6.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\r\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\r\u001a\u00020\u001aH'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001e\u0010\u0005¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerOnboardingService;", "", "", "Lcom/revolut/feature/freelancer/impl/network/models/d;", "getAllBusinessCategories", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "businessCategoryId", "Lefm/d0;", "Lst6/f;", "verifyBusinessCategory", "(Ljava/lang/String;)Lefm/d0;", "Lst6/c;", "params", "Lcom/revolut/feature/freelancer/impl/network/models/d0;", "onboardFreelancer", "(Lst6/c;)Lefm/d0;", "Lst6/a;", "Lefm/b;", "finaliseFreelancerOnboarding", "(Lst6/a;)Lefm/b;", "urlVerificationMode", "Lst6/e;", "Lst6/d;", "verifyOnboardingInput", "(Ljava/lang/String;Lst6/e;)Lefm/d0;", "Lst6/b;", "saveOnboardingProgress", "(Lst6/b;)Lefm/b;", "Lcom/revolut/feature/freelancer/impl/network/models/e0;", "getOnboardingWorkflow", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerOnboardingService {
    @POST("/acquiring/merchant/finalise-onboarding")
    @NotNull
    b finaliseFreelancerOnboarding(@Body @NotNull a params);

    @Headers({"X-Api-Version: 2"})
    @GET("/acquiring/business-categories")
    Object getAllBusinessCategories(@NotNull Continuation<? super List<d>> continuation);

    @POST("/acquiring/merchant/onboard-workflow")
    Object getOnboardingWorkflow(@NotNull Continuation<? super e0> continuation);

    @POST("/acquiring/merchant/onboard")
    @NotNull
    d0<com.revolut.feature.freelancer.impl.network.models.d0> onboardFreelancer(@Body @NotNull c params);

    @POST("/acquiring/merchant/onboard-pending")
    @NotNull
    b saveOnboardingProgress(@Body @NotNull st6.b params);

    @GET("/acquiring/business-categories/{businessCategoryId}/verification")
    @NotNull
    d0<List<f>> verifyBusinessCategory(@Path("businessCategoryId") @NotNull String businessCategoryId);

    @POST("/acquiring/merchant/onboard-verify")
    @NotNull
    d0<List<st6.d>> verifyOnboardingInput(@NotNull @Query("urlVerificationMode") String urlVerificationMode, @Body @NotNull e params);
}
