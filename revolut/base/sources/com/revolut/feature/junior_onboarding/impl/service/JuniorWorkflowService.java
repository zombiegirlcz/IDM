package com.revolut.feature.junior_onboarding.impl.service;

import com.revolut.feature.junior_onboarding.api.model.OnboardingWorkflow;
import ib.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mh8.g;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import th8.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u000b¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/service/JuniorWorkflowService;", "", "", "juniorId", b.Flow, "", "Lmh8/g;", "getWorkflows", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lth8/d;", "getWorkflowsConfig", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/feature/junior_onboarding/api/model/OnboardingWorkflow;", "getCreationWorkflow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivationWorkflow", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorWorkflowService {
    @POST("/youth/workflow/{juniorId}/activate")
    Object getActivationWorkflow(@Path("juniorId") @NotNull String str, @NotNull Continuation<? super OnboardingWorkflow> continuation);

    @POST("/youth/workflow/create")
    Object getCreationWorkflow(@NotNull Continuation<? super OnboardingWorkflow> continuation);

    @GET("/youth/user/{juniorId}/workflows")
    Object getWorkflows(@Path("juniorId") @NotNull String str, @NotNull @Query(b.Flow) String str2, @NotNull Continuation<? super List<g>> continuation);

    @GET("/youth/user/{juniorId}/workflows/config")
    Object getWorkflowsConfig(@Path("juniorId") @NotNull String str, @NotNull Continuation<? super List<d>> continuation);
}
