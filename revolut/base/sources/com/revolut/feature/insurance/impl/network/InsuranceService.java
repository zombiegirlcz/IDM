package com.revolut.feature.insurance.impl.network;

import efm.d0;
import java.util.List;
import java.util.UUID;
import jj7.b;
import jj7.d;
import jj7.j;
import jj7.k;
import jj7.k0;
import jj7.o0;
import jj7.t0;
import jj7.x0;
import jj7.z;
import kotlin.Metadata;
import okhttp3.MultipartBody$Part;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0007J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010!J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b'\u0010%J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010\u0007¨\u0006*À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance/impl/network/InsuranceService;", "", "", "insuranceId", "Lefm/d0;", "Ljj7/z;", "getCFACInsuranceDetails", "(Ljava/lang/String;)Lefm/d0;", "planId", "Ljj7/x0;", "getPlanInsuranceReviewDetails", "", "Ljj7/t0;", "getInsuranceSubtypeLimits", "()Lefm/d0;", "subtype", "Ljj7/k;", "getCFACClaims", "Ljj7/b;", "calculateAmountDto", "Ljj7/d;", "getCFACClaimCalculatedAmount", "(Ljj7/b;)Lefm/d0;", "Ljj7/k0;", "claim", "Ljava/util/UUID;", "idempotencyId", "Ljj7/o0;", "postSubmitCFACClaimInfo", "(Ljj7/k0;Ljava/util/UUID;)Lefm/d0;", "claimId", "Lefm/b;", "postSubmitCFACClaim", "(Ljava/lang/String;)Lefm/b;", "Lokhttp3/MultipartBody$Part;", "file", "postUploadCFACClaimDocument", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;)Lefm/d0;", "expenseId", "postUploadCFACExpenseDocument", "Ljj7/j;", "getCFACClaimDetails", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InsuranceService {
    @POST("/insurance/cfac/claims/amounts/calculate")
    @NotNull
    d0<d> getCFACClaimCalculatedAmount(@Body @NotNull b calculateAmountDto);

    @GET("/insurance/cfac/claims/{id}")
    @NotNull
    d0<j> getCFACClaimDetails(@Path("id") @NotNull String claimId);

    @GET("/insurance/cfac/claims")
    @NotNull
    d0<List<k>> getCFACClaims(@NotNull @Query("insuranceSubtype") String subtype);

    @GET("insurance/cfac/policies/{id}/details")
    @NotNull
    d0<z> getCFACInsuranceDetails(@Path("id") @NotNull String insuranceId);

    @GET("/insurance/subtypes-limits")
    @NotNull
    d0<List<t0>> getInsuranceSubtypeLimits();

    @GET("/insurance/review-details")
    @NotNull
    d0<x0> getPlanInsuranceReviewDetails(@NotNull @Query("planId") String planId);

    @POST("/insurance/cfac/claims/{claimId}/submit")
    @NotNull
    efm.b postSubmitCFACClaim(@Path("claimId") @NotNull String claimId);

    @POST("/insurance/cfac/claims")
    @NotNull
    d0<o0> postSubmitCFACClaimInfo(@Body @NotNull k0 claim, @Header("x-idempotency-key") @NotNull UUID idempotencyId);

    @POST("/insurance/cfac/claims/{claimId}/documents")
    @NotNull
    @Multipart
    d0<Object> postUploadCFACClaimDocument(@Path("claimId") @NotNull String claimId, @NotNull @Part MultipartBody$Part file);

    @POST("/insurance/cfac/claims/expenses/{expenseId}/documents")
    @NotNull
    @Multipart
    d0<Object> postUploadCFACExpenseDocument(@Path("expenseId") @NotNull String expenseId, @NotNull @Part MultipartBody$Part file);
}
