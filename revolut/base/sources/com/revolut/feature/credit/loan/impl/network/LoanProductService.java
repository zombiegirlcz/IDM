package com.revolut.feature.credit.loan.impl.network;

import efm.b;
import efm.d0;
import i55.i;
import i55.l;
import i55.t;
import i55.x;
import java.util.List;
import k55.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0002H'¢\u0006\u0004\b\u000e\u0010\u0006J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0007H'¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0007H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/network/LoanProductService;", "", "Lefm/d0;", "Li55/t;", "Li55/l;", "getLoans", "()Lefm/d0;", "", "id", "Li55/i;", "getLoanDetails", "(Ljava/lang/String;)Lefm/d0;", "", "Lk55/r;", "getLoansLegacy", "loanId", "Li55/x;", "getRefinancedCreditsV2", "refinancingId", "Lefm/b;", "requestRemoveRefinancingToDoTile", "(Ljava/lang/String;)Lefm/b;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanProductService {
    @GET("/loan-management/v2/loans/{id}")
    @NotNull
    d0<i> getLoanDetails(@Path("id") @NotNull String id10);

    @GET("/loan-management/v2/loans")
    @NotNull
    d0<t<l>> getLoans();

    @GET("/loan-management/loans")
    @NotNull
    @d
    d0<List<r>> getLoansLegacy();

    @GET("/refinancing-management/v2/refinancing")
    @NotNull
    d0<x> getRefinancedCreditsV2(@NotNull @Query("loanId") String loanId);

    @POST("/refinancing-management/v2/refinancing/{refinancingId}/deactivate-tiles")
    @NotNull
    b requestRemoveRefinancingToDoTile(@Path("refinancingId") @NotNull String refinancingId);
}
