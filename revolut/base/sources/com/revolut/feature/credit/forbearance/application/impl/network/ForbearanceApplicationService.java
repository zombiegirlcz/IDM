package com.revolut.feature.credit.forbearance.application.impl.network;

import efm.d0;
import ib.b;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import q90.i;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import tz4.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0011\u0010\fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\tH'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0016\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/impl/network/ForbearanceApplicationService;", "", "Lefm/d0;", "Lq90/i;", "getFinancialDifficultiesSurvey", "()Lefm/d0;", b.Flow, "postFinancialDifficultiesSurvey", "(Lq90/i;)Lefm/d0;", "", "facilityId", "getForbearanceSurvey", "(Ljava/lang/String;)Lefm/d0;", "postForbearanceSurvey", "(Ljava/lang/String;Lq90/i;)Lefm/d0;", "", "Ltz4/c;", "getForbearanceApplications", "applicationId", "getForbearanceApplicationById", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Ltz4/b;", "getForbearanceApplicationAgreements", "Lefm/b;", "signForbearanceApplicationAgreements", "(Ljava/lang/String;)Lefm/b;", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ForbearanceApplicationService {
    @GET("/credit-application/financial-difficulty")
    @NotNull
    d0<i> getFinancialDifficultiesSurvey();

    @GET("/credit-application/loan-facility/{id}/forbearance/agreement")
    @NotNull
    d0<tz4.b> getForbearanceApplicationAgreements(@Path("id") @NotNull String facilityId);

    @GET("credit-application/loan-facility/{id}/forbearance/status/{applicationId}")
    @NotNull
    d0<c> getForbearanceApplicationById(@Path("id") @NotNull String facilityId, @Path("applicationId") @NotNull String applicationId);

    @GET("/credit-application/loan-facility/{id}/forbearance/status")
    @NotNull
    d0<List<c>> getForbearanceApplications(@Path("id") @NotNull String facilityId);

    @GET("/credit-application/loan-facility/{id}/forbearance/v2/apply")
    @NotNull
    d0<i> getForbearanceSurvey(@Path("id") @NotNull String facilityId);

    @POST("/credit-application/financial-difficulty")
    @NotNull
    d0<i> postFinancialDifficultiesSurvey(@Body @NotNull i flow);

    @POST("/credit-application/loan-facility/{id}/forbearance/v2/apply")
    @NotNull
    d0<i> postForbearanceSurvey(@Path("id") @NotNull String facilityId, @Body @NotNull i flow);

    @POST("/credit-application/loan-facility/{id}/forbearance/agreement")
    @NotNull
    efm.b signForbearanceApplicationAgreements(@Path("id") @NotNull String facilityId);
}
