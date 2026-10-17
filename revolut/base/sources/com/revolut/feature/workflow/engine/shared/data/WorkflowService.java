package com.revolut.feature.workflow.engine.shared.data;

import bvh.c;
import bvh.d;
import bvh.g;
import bvh.g0;
import bvh.h;
import bvh.h0;
import bvh.i;
import bvh.o;
import bvh.r;
import bvh.z;
import cvh.e;
import evh.a0;
import evh.d0;
import evh.e0;
import evh.f0;
import ib.b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001a\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001c\u0010\u0015J.\u0010\u001e\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u001d\u001a\u00020\nH§@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010!\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020 H§@¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b#\u0010$J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0001\u0010%\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010$J,\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&2\u0014\b\u0001\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020)H§@¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\b\u0001\u0010\u0012\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/J&\u00100\u001a\u00020-2\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020)H§@¢\u0006\u0004\b0\u0010+J$\u00102\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u000201H§@¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b4\u0010$J$\u00107\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u00106\u001a\u000205H§@¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u0002092\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b:\u0010$J$\u0010=\u001a\u00020<2\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020;H§@¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020@2\b\b\u0001\u0010?\u001a\u00020\u0002H§@¢\u0006\u0004\bA\u0010$J$\u0010D\u001a\u00020C2\b\b\u0001\u0010B\u001a\u00020\u00022\b\b\u0001\u0010?\u001a\u00020\u0002H§@¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020G2\b\b\u0001\u0010F\u001a\u00020\u0002H§@¢\u0006\u0004\bH\u0010$¨\u0006IÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/workflow/engine/shared/data/WorkflowService;", "", "", "product", "", "skippedSteps", "Lcvh/e;", "getWorkflowSteps", "(Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "workflowId", "", "includeBackNavigation", "Levh/d0;", "getWorkflow", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Levh/e0;", "getWorkflowDtoV2", "Lbvh/i;", "body", "", "submitEligibilityDataPoints", "(Lbvh/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stepId", "submitWorkflowDataPoints", "(Ljava/lang/String;Lbvh/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbvh/r;", "submitWorkflowMobileScreenParams", "(Ljava/lang/String;Lbvh/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateEligibilityDataPoints", "validate", "validateWorkflowDataPoints", "(Ljava/lang/String;Lbvh/i;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Levh/a0;", "postWorkflowSsoSuccess", "(Ljava/lang/String;Levh/a0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postWorkflowSsoFailure", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", b.Flow, "", "Levh/f0;", "getWorkflowsByFlowName", "", "getWorkflowsByParams", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbvh/g;", "Lbvh/h;", "createWorkflowByFlowName", "(Lbvh/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createWorkflowWithParams", "Lbvh/d0;", "skipStep", "(Ljava/lang/String;Lbvh/d0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeSdkStep", "Lbvh/d;", "completeSdkStepRequestDto", "completeSdkStepCheck", "(Ljava/lang/String;Lbvh/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbvh/o;", "initSdkStep", "Lbvh/g0;", "Lbvh/h0;", "getWorkflowStepSuggestions", "(Ljava/lang/String;Lbvh/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encodedQuery", "Levh/d;", "getCitizenships", "citizenship", "Lbvh/c;", "getApplicableDocuments", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrationContext", "Lbvh/z;", "getProductObstacles", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WorkflowService {
    @POST("workflows/steps/{stepId}/sdk/complete")
    Object completeSdkStep(@Path("stepId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("workflows/steps/{stepId}/sdk/complete")
    Object completeSdkStepCheck(@Path("stepId") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super Unit> continuation);

    @POST("workflows")
    Object createWorkflowByFlowName(@Body @NotNull g gVar, @NotNull Continuation<? super h> continuation);

    @POST("workflows")
    Object createWorkflowWithParams(@Body @NotNull Map<String, String> map, @NotNull Continuation<? super h> continuation);

    @GET("applicable-documents")
    Object getApplicableDocuments(@NotNull @Query("citizenship") String str, @NotNull @Query("encodedQuery") String str2, @NotNull Continuation<? super c> continuation);

    @GET("citizenships")
    Object getCitizenships(@NotNull @Query("encodedQuery") String str, @NotNull Continuation<? super evh.d> continuation);

    @GET("migration/product-obstacles")
    Object getProductObstacles(@NotNull @Query("context") String str, @NotNull Continuation<? super z> continuation);

    @GET("workflows/{id}/steps")
    Object getWorkflow(@Path("id") @NotNull String str, @Query("includeBackNavigation") boolean z, @NotNull Continuation<? super d0> continuation);

    @GET("workflows/{id}/steps")
    Object getWorkflowDtoV2(@Path("id") @NotNull String str, @Query("includeBackNavigation") boolean z, @NotNull Continuation<? super e0> continuation);

    @POST("workflows/steps/{stepId}/suggestions")
    Object getWorkflowStepSuggestions(@Path("stepId") @NotNull String str, @Body @NotNull g0 g0Var, @NotNull Continuation<? super h0> continuation);

    @GET("/kyc/eligibility-steps")
    Object getWorkflowSteps(@NotNull @Query("product") String str, @NotNull @Query("skippedSteps") Set<String> set, @NotNull Continuation<? super e> continuation);

    @GET("workflows")
    Object getWorkflowsByFlowName(@NotNull @Query(b.Flow) String str, @NotNull Continuation<? super List<f0>> continuation);

    @GET("workflows")
    Object getWorkflowsByParams(@QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super List<f0>> continuation);

    @POST("workflows/steps/{stepId}/sdk/init")
    Object initSdkStep(@Path("stepId") @NotNull String str, @NotNull Continuation<? super o> continuation);

    @POST("workflows/steps/{stepId}/fail-authentication")
    Object postWorkflowSsoFailure(@Path("stepId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("workflows/steps/{stepId}/authentications")
    @oql.b
    Object postWorkflowSsoSuccess(@Path("stepId") @NotNull String str, @Body @NotNull a0 a0Var, @NotNull Continuation<? super Unit> continuation);

    @POST("workflows/steps/{stepId}/skip")
    Object skipStep(@Path("stepId") @NotNull String str, @Body @NotNull bvh.d0 d0Var, @NotNull Continuation<? super Unit> continuation);

    @POST("/kyc/declarations")
    Object submitEligibilityDataPoints(@Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/workflows/steps/{stepId}/declarations")
    Object submitWorkflowDataPoints(@Path("stepId") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/workflows/steps/{stepId}/declarations")
    Object submitWorkflowMobileScreenParams(@Path("stepId") @NotNull String str, @Body @NotNull r rVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/kyc/data-point-validation")
    Object validateEligibilityDataPoints(@Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/workflows/steps/{stepId}/declarations")
    Object validateWorkflowDataPoints(@Path("stepId") @NotNull String str, @Body @NotNull i iVar, @Query("validationOnly") boolean z, @NotNull Continuation<? super Unit> continuation);
}
