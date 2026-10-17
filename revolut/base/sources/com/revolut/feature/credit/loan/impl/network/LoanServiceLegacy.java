package com.revolut.feature.credit.loan.impl.network;

import efm.b;
import efm.d0;
import java.util.List;
import java.util.Map;
import k55.q;
import k55.r;
import kotlin.Metadata;
import l55.j;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\u0004H'¢\u0006\u0004\b\r\u0010\nJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/network/LoanServiceLegacy;", "", "", "id", "Lefm/d0;", "Lk55/r;", "getLoan", "(Ljava/lang/String;)Lefm/d0;", "", "getLoansLegacy", "()Lefm/d0;", "", "Lk55/q;", "getLoanCountryConfig", "loanId", "", "amount", "getNewRepaymentTermsLegacy", "(Ljava/lang/String;J)Lefm/d0;", "Ll55/j;", "repayDto", "Lefm/b;", "loanRepay", "(Ljava/lang/String;Ll55/j;)Lefm/b;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public interface LoanServiceLegacy {
    @GET("/loan-management/loan/{loan_id}")
    @NotNull
    @d
    d0<r> getLoan(@Path("loan_id") @NotNull String id10);

    @GET("/loan-management/country-config")
    @NotNull
    @d
    d0<Map<String, q>> getLoanCountryConfig();

    @GET("/loan-management/loans")
    @NotNull
    @d
    d0<List<r>> getLoansLegacy();

    @GET("/loan-management/loan/{id}/repayment-terms")
    @NotNull
    @d
    d0<Object> getNewRepaymentTermsLegacy(@Path("id") @NotNull String loanId, @Query("amount") long amount);

    @POST("/loan-management/loan/{id}/repay")
    @NotNull
    @d
    b loanRepay(@Path("id") @NotNull String loanId, @Body @NotNull j repayDto);
}
