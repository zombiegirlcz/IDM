package com.revolut.feature.onboarding.impl.esignature.data.network;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import q99.a;
import q99.c;
import q99.e;
import q99.f;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u00152\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/impl/esignature/data/network/ESignatureService;", "", "", "workflowStepId", "signatureProcessType", "Lefm/d0;", "", "Lq99/b;", "getConsents", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lq99/e;", "getActiveESignature", "Lq99/f;", "body", "passcode", "initESignature", "(Lq99/f;Ljava/lang/String;)Lefm/d0;", "processId", "Lq99/c;", "getESignatureDetails", "(Ljava/lang/String;)Lefm/d0;", "Lefm/b;", "resendOtp", "(Ljava/lang/String;)Lefm/b;", "Lq99/a;", "confirmESignature", "(Ljava/lang/String;Lq99/a;)Lefm/b;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ESignatureService {
    @POST("electronic-signatures/{processId}/confirm")
    @NotNull
    b confirmESignature(@Path("processId") @NotNull String processId, @Body @NotNull a body);

    @GET("electronic-signatures")
    @NotNull
    d0<e> getActiveESignature(@Query("workflowStepId") String workflowStepId, @Query("signatureProcessType") String signatureProcessType);

    @GET("electronic-signature-consents")
    @NotNull
    d0<List<q99.b>> getConsents(@Query("workflowStepId") String workflowStepId, @Query("signatureProcessType") String signatureProcessType);

    @GET("electronic-signatures/{processId}")
    @NotNull
    d0<c> getESignatureDetails(@Path("processId") @NotNull String processId);

    @POST("electronic-signatures")
    @NotNull
    d0<e> initESignature(@Body @NotNull f body, @Header("X-Verify-Password") String passcode);

    @POST("electronic-signatures/{processId}/resend-otp")
    @NotNull
    b resendOtp(@Path("processId") @NotNull String processId);
}
