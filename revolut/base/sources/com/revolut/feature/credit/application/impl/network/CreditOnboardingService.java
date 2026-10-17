package com.revolut.feature.credit.application.impl.network;

import ib.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import nt3.h;
import org.jetbrains.annotations.NotNull;
import qr3.j;
import qr3.l;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import sr3.c;
import sr3.d;
import sr3.e;
import tt3.a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J2\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0086\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014Jx\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0013\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010\u001dJ2\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b!\u0010\bJ2\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b#\u0010\bJ\u0010\u0010%\u001a\u00020$H§@¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b*\u0010\u001dJ\u001a\u0010+\u001a\u00020&2\b\b\u0001\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010\u001dJ\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0018H§@¢\u0006\u0004\b-\u0010\u001aJ \u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00182\b\b\u0001\u0010.\u001a\u00020\u0002H§@¢\u0006\u0004\b0\u0010\u001dJ\u001a\u00103\u001a\u0002022\b\b\u0001\u00101\u001a\u00020\u0002H§@¢\u0006\u0004\b3\u0010\u001dJ&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000205042\b\b\u0001\u0010\u001b\u001a\u00020\u0002H§@¢\u0006\u0004\b6\u0010\u001dJ$\u00109\u001a\u00020&2\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u00108\u001a\u000207H§@¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u0002H§@¢\u0006\u0004\b;\u0010\u001dJ\u001a\u0010>\u001a\u00020=2\b\b\u0001\u00108\u001a\u00020<H§@¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020A2\b\b\u0001\u00108\u001a\u00020@H§@¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020D2\b\b\u0001\u0010\u001b\u001a\u00020\u0002H§@¢\u0006\u0004\bE\u0010\u001dJ2\u0010G\u001a\u00020D2\b\b\u0001\u0010F\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bG\u0010\bJJ\u0010I\u001a\u00020H2\b\b\u0001\u0010F\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bI\u0010JJT\u0010I\u001a\u00020H2\b\b\u0001\u0010F\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\bI\u0010KJ\u001a\u0010M\u001a\u00020L2\b\b\u0001\u0010F\u001a\u00020\u0002H§@¢\u0006\u0004\bM\u0010\u001d¨\u0006NÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/impl/network/CreditOnboardingService;", "", "", "product", "subtype", "metadataType", "Lsr3/c;", "creationMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "facilityId", "intendedPlanId", "billingOption", "offerToken", "entryPoint", "creditApplicationIntent", "", "creditLimitAmount", "creditLimitCurrency", "Ltt3/a;", "createApplication", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrr3/a;", "metadata", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrr3/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getApplications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicationId", "getApplicationById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lir3/a;", "getCreditEligibilityCriteria", "Lir3/b;", "getCreditProductEligibility", "Lor3/a;", "getMarketingAvailability", "Lgr3/a;", "getCreditConfiguration", "", "acceptTerminatedApplicationAcknowledgement", "invitationId", "Lhr3/a;", "getDeclineInvitationConfiguration", "declineInvitation", "Lkr3/b;", "getPrimaryEntryPoints", b.Screen, "Lkr3/c;", "getPrimaryEntryPointsV2", "pricingPlanId", "Lpr3/b;", "getCreditCardPostRetailOnboarding", "", "Lmt3/a;", "getClientMonitoringConfiguration", "Lmt3/b;", "request", "completeClientMonitoring", "(Ljava/lang/String;Lmt3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "behavioralPluginComplete", "Lsr3/b;", "Lsr3/e;", "createWorkflowApplicationLegacy", "(Lsr3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsr3/a;", "Lsr3/d;", "createWorkflowApplication", "(Lsr3/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnt3/h;", "getAfterApplicationCreditHealthConfig", "productType", "getBeforeApplicationCreditHealthConfig", "Lqr3/j;", "getPreApplicationChecks", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lrr3/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqr3/l;", "createPreApplicationChecksWorkflow", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditOnboardingService {
    @POST("/credit-application/{applicationId}/acknowledgement")
    Object acceptTerminatedApplicationAcknowledgement(@Path("applicationId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit-application/{applicationId}/behavioral-data-capture/complete")
    Object behavioralPluginComplete(@Path("applicationId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @POST("/credit-application/{applicationId}/client-monitoring/complete")
    Object completeClientMonitoring(@Path("applicationId") @NotNull String str, @Body @NotNull mt3.b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/credit-application/{product}")
    Object createApplication(@Path("product") @NotNull String str, @Query("subtype") String str2, @Query("facilityId") String str3, @Query("intendedPlanId") String str4, @Query("billingOption") String str5, @Query("offerToken") String str6, @Query("entryPoint") String str7, @Query("creditApplicationIntent") String str8, @Query("creditLimitAmount") Long l2, @Query("creditLimitCurrency") String str9, @NotNull Continuation<? super a> continuation);

    @POST("/credit-application/{product}")
    Object createApplication(@Path("product") @NotNull String str, @Query("subtype") String str2, @Query("facilityId") String str3, @Query("intendedPlanId") String str4, @Query("billingOption") String str5, @Query("offerToken") String str6, @Query("entryPoint") String str7, @Query("creditApplicationIntent") String str8, @Body @NotNull rr3.a aVar, @NotNull Continuation<? super a> continuation);

    @POST("/credit-application/{productType}/pre-application-checks/create-workflow")
    Object createPreApplicationChecksWorkflow(@Path("productType") @NotNull String str, @NotNull Continuation<? super l> continuation);

    @POST("/credit-workflow/credit-application")
    Object createWorkflowApplication(@Body @NotNull sr3.a aVar, @NotNull Continuation<? super d> continuation);

    @POST("/credit-workflow/workflow-application")
    Object createWorkflowApplicationLegacy(@Body @NotNull sr3.b bVar, @NotNull Continuation<? super e> continuation);

    @GET("/credit-application/creation-method/{product}")
    Object creationMethod(@Path("product") @NotNull String str, @Query("subtype") String str2, @Query("metadataType") String str3, @NotNull Continuation<? super c> continuation);

    @POST("/credit-application/invitation/{invitationId}/decline")
    Object declineInvitation(@Path("invitationId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/credit-application/credit-health/config/v1/context/AFTER_APPLICATION")
    Object getAfterApplicationCreditHealthConfig(@NotNull @Query("applicationId") String str, @NotNull Continuation<? super h> continuation);

    @GET("/credit-application/{applicationId}")
    Object getApplicationById(@Path("applicationId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("/credit-application")
    Object getApplications(@NotNull Continuation<? super List<a>> continuation);

    @GET("/credit-application/{productType}/no-offer")
    Object getBeforeApplicationCreditHealthConfig(@Path("productType") @NotNull String str, @Query("subtype") String str2, @Query("metadataType") String str3, @NotNull Continuation<? super h> continuation);

    @GET("/credit-application/{applicationId}/client-monitoring/config")
    Object getClientMonitoringConfiguration(@Path("applicationId") @NotNull String str, @NotNull Continuation<? super Map<String, mt3.a>> continuation);

    @GET("/credit-application/cc/tile/post-retail-onboarding")
    Object getCreditCardPostRetailOnboarding(@NotNull @Query("pricingPlanId") String str, @NotNull Continuation<? super pr3.b> continuation);

    @GET("/credit-application/configuration")
    Object getCreditConfiguration(@NotNull Continuation<? super gr3.a> continuation);

    @GET("/credit-application/{product}/product-eligibility-terms")
    Object getCreditEligibilityCriteria(@Path("product") @NotNull String str, @NotNull Continuation<? super List<ir3.a>> continuation);

    @GET("/credit-application/{product}/product-eligibility")
    Object getCreditProductEligibility(@Path("product") @NotNull String str, @Query("subtype") String str2, @Query("metadataType") String str3, @NotNull Continuation<? super ir3.b> continuation);

    @GET("/credit-application/invitation/{invitationId}/decline/config/v1")
    Object getDeclineInvitationConfiguration(@Path("invitationId") @NotNull String str, @NotNull Continuation<? super hr3.a> continuation);

    @GET("/credit-application/{product}/marketing-availability")
    Object getMarketingAvailability(@Path("product") @NotNull String str, @Query("subtype") String str2, @Query("metadataType") String str3, @NotNull Continuation<? super or3.a> continuation);

    @POST("/credit-application/{productType}/pre-application-checks")
    Object getPreApplicationChecks(@Path("productType") @NotNull String str, @Query("subtype") String str2, @Query("creditApplicationIntent") String str3, @Query("creditLimitAmount") Long l2, @Query("creditLimitCurrency") String str4, @NotNull Continuation<? super j> continuation);

    @POST("/credit-application/{productType}/pre-application-checks")
    Object getPreApplicationChecks(@Path("productType") @NotNull String str, @Query("subtype") String str2, @Query("creditApplicationIntent") String str3, @Query("creditLimitAmount") Long l2, @Query("creditLimitCurrency") String str4, @Body @NotNull rr3.a aVar, @NotNull Continuation<? super j> continuation);

    @GET("/credit-application/entry-points/v1")
    Object getPrimaryEntryPoints(@NotNull Continuation<? super List<kr3.b>> continuation);

    @GET("/credit-application/entry-points/v2")
    Object getPrimaryEntryPointsV2(@NotNull @Query(b.Screen) String str, @NotNull Continuation<? super List<kr3.c>> continuation);
}
