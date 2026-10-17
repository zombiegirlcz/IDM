package com.revolut.feature.credit.loan.impl.network;

import efm.b;
import efm.d0;
import i55.c;
import i55.c0;
import i55.k;
import k55.p;
import kotlin.Metadata;
import l55.a;
import l55.d;
import l55.e;
import l55.f;
import l55.g;
import l55.h;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u001bJ#\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010#J#\u0010'\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J-\u0010+\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020*H'¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020%H'¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b1\u0010\u001b¨\u00062À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/network/LoanService;", "", "", "loanId", "Ll55/c;", "request", "Lefm/b;", "updateBorrowersPriority", "(Ljava/lang/String;Ll55/c;)Lefm/b;", "Ll55/h;", "repayRenegotiationDto", "repayRenegotiation", "(Ljava/lang/String;Ll55/h;)Lefm/b;", "Ll55/e;", "changeRepaymentDay", "(Ljava/lang/String;Ll55/e;)Lefm/b;", "", "payDay", "Lefm/d0;", "Li55/c0;", "getNewChangeDayTerms", "(Ljava/lang/String;I)Lefm/d0;", "Ll55/a;", "linkCardToLoanManagement", "(Ljava/lang/String;Ll55/a;)Lefm/b;", "Lrx4/b;", "getLoanAgreementsList", "(Ljava/lang/String;)Lefm/d0;", "getForbearanceAgreements", "Li55/k;", "getLoanDocuments", "Ll55/d;", "renameLoan", "(Ljava/lang/String;Ll55/d;)Lefm/b;", "cancelLoan", "(Ljava/lang/String;)Lefm/b;", "renounceLoan", "Ll55/g;", "externalAccount", "setDirectDebitAccount", "(Ljava/lang/String;Ll55/g;)Lefm/b;", "repaymentMethod", "Ll55/f;", "setRepaymentMethodState", "(Ljava/lang/String;Ljava/lang/String;Ll55/f;)Lefm/b;", "Li55/c;", "getLoanACHAuthDocuments", "(Ljava/lang/String;Ll55/g;)Lefm/d0;", "Lk55/p;", "getForbearanceOverdueBreakdown", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanService {
    @POST("/loan-management/loan/{id}/cancel-loan-agreement")
    @NotNull
    b cancelLoan(@Path("id") @NotNull String loanId);

    @POST("/loan-management/loan/{id}/change-repayment-day")
    @NotNull
    b changeRepaymentDay(@Path("id") @NotNull String loanId, @Body @NotNull e request);

    @GET("/credit-application/forbearance-loan-facility/{loanId}/agreement")
    @NotNull
    d0<rx4.b> getForbearanceAgreements(@Path("loanId") @NotNull String loanId);

    @GET("/loan-management/loan/{loanId}/renegotiation-amount")
    @NotNull
    d0<p> getForbearanceOverdueBreakdown(@Path("loanId") @NotNull String loanId);

    @POST("/credit-application/loan-facility-v2/{loanId}/ach-authorization")
    @NotNull
    d0<c> getLoanACHAuthDocuments(@Path("loanId") @NotNull String loanId, @Body @NotNull g externalAccount);

    @GET("/credit-application/loan-facility-v2/{loanId}/agreement")
    @NotNull
    d0<rx4.b> getLoanAgreementsList(@Path("loanId") @NotNull String loanId);

    @GET("/disbursals/documents")
    @NotNull
    d0<k> getLoanDocuments(@NotNull @Query("loanId") String loanId);

    @GET("/loan-management/loan/{id}/repayment-day-change-terms")
    @NotNull
    d0<c0> getNewChangeDayTerms(@Path("id") @NotNull String loanId, @Query("payday") int payDay);

    @POST("/loan-management/loan/{id}/change-card")
    @NotNull
    b linkCardToLoanManagement(@Path("id") @NotNull String loanId, @Body @NotNull a request);

    @POST("/loan-management/loan/{id}/rename")
    @NotNull
    b renameLoan(@Path("id") @NotNull String loanId, @Body @NotNull d request);

    @POST("/loan-management/loan/{id}/renounce-loan-offer")
    @NotNull
    b renounceLoan(@Path("id") @NotNull String loanId);

    @POST("/loan-management/loan/{id}/repay-renegotiation")
    @NotNull
    b repayRenegotiation(@Path("id") @NotNull String loanId, @Body @NotNull h repayRenegotiationDto);

    @POST("/loan-management/loan/{id}/direct-debit/mandate")
    @NotNull
    b setDirectDebitAccount(@Path("id") @NotNull String loanId, @Body @NotNull g externalAccount);

    @POST("/loan-management/loan/{loanId}/repayment-method/{repaymentMethod}/state")
    @NotNull
    b setRepaymentMethodState(@Path("loanId") @NotNull String loanId, @Path("repaymentMethod") @NotNull String repaymentMethod, @Body @NotNull f request);

    @PATCH("/loan-management/v2/loans/{loanId}/borrower-priority")
    @NotNull
    b updateBorrowersPriority(@Path("loanId") @NotNull String loanId, @Body @NotNull l55.c request);
}
