package com.revolut.feature.credit.loan.impl.network;

import efm.b;
import i55.d0;
import i55.e0;
import i55.f0;
import i55.t;
import i55.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/network/LoanRepaymentsService;", "", "", "loanId", "Li55/z;", "request", "Lefm/b;", "repay", "(Ljava/lang/String;Li55/z;)Lefm/b;", "", "amount", "repaymentType", "Lefm/d0;", "Li55/f0;", "getLoanRepaymentTerms", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lefm/d0;", "date", "", "count", "Li55/t;", "Li55/d0;", "getLoanRepayments", "(Ljava/lang/String;Ljava/lang/String;I)Lefm/d0;", "transactionId", "getLoanRepaymentByTransaction", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pocketId", "partialRepaymentStrategy", "Li55/e0;", "getRepaymentPreview", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanRepaymentsService {
    @GET("/loan-management/v2/loans/{loanId}/repayments/by-transaction/{transactionId}")
    Object getLoanRepaymentByTransaction(@Path("loanId") @NotNull String str, @Path("transactionId") @NotNull String str2, @NotNull Continuation<? super d0> continuation);

    @GET("/loan-management/v2/loans/{id}/repayment-terms")
    @NotNull
    efm.d0<f0> getLoanRepaymentTerms(@Path("id") @NotNull String loanId, @Query("amount") Long amount, @Query("partialRepaymentStrategy") String repaymentType);

    @GET("/loan-management/v2/loans/{id}/repayments")
    @NotNull
    efm.d0<t<d0>> getLoanRepayments(@Path("id") @NotNull String loanId, @NotNull @Query("fromDate") String date, @Query("count") int count);

    @GET("/loan-management/v2/loans/{loanId}/repayment-preview")
    Object getRepaymentPreview(@Path("loanId") @NotNull String str, @Query("amount") Long l2, @Query("pocketId") String str2, @Query("partialRepaymentStrategy") String str3, @NotNull Continuation<? super e0> continuation);

    @POST("/loan-management/v2/loans/{id}/repay")
    @NotNull
    b repay(@Path("id") @NotNull String loanId, @Body @NotNull z request);
}
