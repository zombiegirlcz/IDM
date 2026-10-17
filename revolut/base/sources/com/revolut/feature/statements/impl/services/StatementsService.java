package com.revolut.feature.statements.impl.services;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import oyd.a;
import oyd.b;
import oyd.c;
import oyd.d;
import oyd.e;
import oyd.f;
import oyd.i;
import oyd.l;
import oyd.o;
import oyd.p;
import oyd.q;
import oyd.r;
import oyd.s;
import oyd.u;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u0013\u0010\u0017J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0006H'¢\u0006\u0004\b\u0019\u0010\nJ!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u001a\u0010\nJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u001c\u0010\nJc\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\b\"\u0010#J=\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\b$\u0010%J=\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\b&\u0010%JW\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\b'\u0010(J[\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010)\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010-\u001a\u00020,H'¢\u0006\u0004\b.\u0010/J+\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\b0\u0010\u000fJ5\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00101\u001a\u00020\u00062\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b3\u0010\u0017J+\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b4\u0010\u0014J!\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b6\u0010\nJ5\u00107\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b7\u0010\u0017J1\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00022\u000e\b\u0001\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b;\u0010<JM\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\u000e\b\u0001\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\b\b\u0001\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\u001f\u001a\u00020\u0006H'¢\u0006\u0004\b=\u0010>J\u0010\u0010@\u001a\u00020?H§@¢\u0006\u0004\b@\u0010AJ=\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010B\u001a\u00020\u00062\b\b\u0001\u0010C\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\u001f\u001a\u00020\u0006H'¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020G2\b\b\u0001\u0010F\u001a\u00020\u0006H§@¢\u0006\u0004\bH\u0010IJG\u0010J\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010B\u001a\u00020\u00062\b\b\u0001\u0010C\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010F\u001a\u00020\u0006H'¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010L\u001a\u00020\u0006H'¢\u0006\u0004\bM\u0010\nJ)\u0010N\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\bN\u0010\u000fJ\u0015\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002H'¢\u0006\u0004\bO\u0010\u0005J)\u0010P\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010!\u001a\u00020\u000bH'¢\u0006\u0004\bP\u0010QJ\u001a\u0010T\u001a\u00020S2\b\b\u0001\u0010R\u001a\u00020\u0006H§@¢\u0006\u0004\bT\u0010IJ\u001a\u0010V\u001a\u00020U2\b\b\u0001\u0010R\u001a\u00020\u0006H§@¢\u0006\u0004\bV\u0010IJ\u001f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010X\u001a\u00020WH'¢\u0006\u0004\bY\u0010ZJ\u001f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010X\u001a\u00020[H'¢\u0006\u0004\b\\\u0010]JU\u0010a\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010!\u001a\u00020\u000b2\u0010\b\u0001\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010_\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010`\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\ba\u0010bJ5\u0010c\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010!\u001a\u00020\u000b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\bc\u0010dJ)\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u00101\u001a\u00020\u0006H'¢\u0006\u0004\be\u0010fJ\u0010\u0010h\u001a\u00020gH§@¢\u0006\u0004\bh\u0010AJ2\u0010j\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010i\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\bj\u0010kJ2\u0010l\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010i\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\bl\u0010k¨\u0006mÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/statements/impl/services/StatementsService;", "", "Lefm/d0;", "Loyd/p;", "getStatementContent", "()Lefm/d0;", "", "groupId", "Loyd/u;", "getTopUpConfirmation", "(Ljava/lang/String;)Lefm/d0;", "", "downloadReport", "Loyd/q;", "getTransactionConfirmation", "(Ljava/lang/String;Z)Lefm/d0;", "", "year", "walletId", "getStatementOfFees", "(ILjava/lang/String;)Lefm/d0;", "from", "to", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "requestId", "getStatementsByRequest", "getAvailableStatementOfFeesYears", "Loyd/b;", "getAvailableFinancialSummaryYears", "", "ccy", "format", "type", "emailNotification", "getAccountStatement", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lefm/d0;", "getAccountStatementCrypto", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lefm/d0;", "getCryptoPnLStatementCrypto", "getFreelancerStatement", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Lefm/d0;", "juniorId", "getJuniorAccountStatement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lefm/d0;", "Loyd/f;", "body", "getSavingsAccountStatement", "(Loyd/f;)Lefm/d0;", "getRibStatement", "pocketId", "cryptoCPPart", "getTransactionStatement", "getFinancialSummaryStatement", "Loyd/a;", "getAnnualStatementDateRange", "getAnnualStatement", "productTypes", "ownerId", "Loyd/o;", "getStatementsPeriod", "(Ljava/util/List;Ljava/lang/String;)Lefm/d0;", "getStatementsConsolidated", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;)Lefm/d0;", "Loyd/r;", "getStatementsTaxCertificateAvailableYears", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "getStatementsTaxCertificate", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lefm/d0;", "countryCode", "Loyd/s;", "getTaxFilingData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatementsTaxFiling", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lefm/d0;", "transactionId", "getStatementsTaxInvoice", "getContractSummaryStatement", "getIncomeTaxYears", "getIncomeTaxStatement", "(IZ)Lefm/d0;", "statementFilterType", "Loyd/d;", "getConsolidatedStatementsCustomisations", "Loyd/i;", "getCustomStatementData", "Loyd/l;", "request", "generateConsolidatedStatement", "(Loyd/l;)Lefm/d0;", "Loyd/e;", "getProTaxAccountStatement", "(Loyd/e;)Lefm/d0;", "currencies", "hideBalance", "pocketType", "getAccountConfirmationStatement", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lefm/d0;", "getAnnualFeeStatement", "(IZLjava/lang/String;)Lefm/d0;", "getPurposeDeclarationStatement", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Loyd/c;", "getBankIdAvailableYears", "localeCode", "getBankIdSummarisedAnnualReport", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBankIdDetailedAnnualReport", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StatementsService {
    @POST("/user/current/statements/consolidated-statement")
    @NotNull
    d0<q> generateConsolidatedStatement(@Body @NotNull l request);

    @GET("/user/current/statements/v2/account-confirmation")
    @NotNull
    d0<q> getAccountConfirmationStatement(@Query("emailNotification") boolean emailNotification, @Query("ccy") List<String> currencies, @Query("walletId") String walletId, @Query("hideBalance") Boolean hideBalance, @Query("pocketType") String pocketType);

    @GET("user/current/statements/account-statements")
    @NotNull
    d0<q> getAccountStatement(@NotNull @Query("from") String from, @NotNull @Query("to") String to6, @NotNull @Query("ccy") List<String> ccy, @NotNull @Query("format") String format, @NotNull @Query("type") String type, @Query("walletId") String walletId, @Query("emailNotification") boolean emailNotification);

    @GET("crypto/statements/account")
    @NotNull
    d0<q> getAccountStatementCrypto(@NotNull @Query("fromDate") String from, @NotNull @Query("toDate") String to6, @NotNull @Query("format") String format, @Query("emailNotification") boolean emailNotification);

    @GET("/user/current/statements/annual-fee")
    @NotNull
    d0<q> getAnnualFeeStatement(@Query("year") int year, @Query("emailNotification") boolean emailNotification, @Query("walletId") String walletId);

    @GET("user/current/statements/annual-statements")
    @NotNull
    d0<q> getAnnualStatement(@NotNull @Query("year") String year, @NotNull @Query("format") String format, @Query("walletId") String walletId);

    @GET("user/current/statements/annual-statements-date-range")
    @NotNull
    d0<a> getAnnualStatementDateRange(@Query("walletId") String walletId);

    @GET("user/current/statements/annual-financial-summary-date-range")
    @NotNull
    d0<b> getAvailableFinancialSummaryYears(@Query("walletId") String walletId);

    @GET("user/current/statements/fees/years")
    @NotNull
    d0<Object> getAvailableStatementOfFeesYears(@Query("walletId") String walletId);

    @GET("/user/current/statements/bank-id/available-years")
    Object getBankIdAvailableYears(@NotNull Continuation<? super c> continuation);

    @GET("/user/current/statements/bank-id/detailed-annual-report")
    Object getBankIdDetailedAnnualReport(@Query("year") int i, @Query("format") String str, @Query("localeCode") String str2, @NotNull Continuation<? super q> continuation);

    @GET("/user/current/statements/bank-id/summarised-annual-report")
    Object getBankIdSummarisedAnnualReport(@Query("year") int i, @Query("format") String str, @Query("localeCode") String str2, @NotNull Continuation<? super q> continuation);

    @GET("/user/current/statements/filters")
    Object getConsolidatedStatementsCustomisations(@NotNull @Query("statementFilterType") String str, @NotNull Continuation<? super d> continuation);

    @GET("/user/current/statements/contract-summary")
    @NotNull
    d0<q> getContractSummaryStatement(@NotNull @Query("type") String type, @Query("emailNotification") boolean emailNotification);

    @GET("crypto/statements/pnl")
    @NotNull
    d0<q> getCryptoPnLStatementCrypto(@NotNull @Query("fromDate") String from, @NotNull @Query("toDate") String to6, @NotNull @Query("format") String format, @Query("emailNotification") boolean emailNotification);

    @GET("/user/current/statements/metadata")
    Object getCustomStatementData(@NotNull @Query("statementFilterType") String str, @NotNull Continuation<? super i> continuation);

    @GET("user/current/statements/annual-financial-summary")
    @NotNull
    d0<q> getFinancialSummaryStatement(@Query("year") int year, @Query("walletId") String walletId);

    @GET("user/current/statements/pro/account-statements")
    @NotNull
    d0<q> getFreelancerStatement(@NotNull @Query("from") String from, @NotNull @Query("to") String to6, @NotNull @Query("ccy") List<String> ccy, @NotNull @Query("format") String format, @NotNull @Query("type") String type, @Query("emailNotification") boolean emailNotification);

    @GET("/user/current/statements/income-tax")
    @NotNull
    d0<q> getIncomeTaxStatement(@Query("year") int year, @Query("emailNotification") boolean emailNotification);

    @GET("/user/current/statements/income-tax/years")
    @NotNull
    d0<b> getIncomeTaxYears();

    @GET("user/current/statements/youth/account-statements/{juniorId}")
    @NotNull
    d0<q> getJuniorAccountStatement(@Path("juniorId") @NotNull String juniorId, @NotNull @Query("from") String from, @NotNull @Query("to") String to6, @NotNull @Query("ccy") String ccy, @NotNull @Query("format") String format, @NotNull @Query("type") String type, @Query("emailNotification") boolean emailNotification);

    @POST("/user/current/statements/pro/tax-account-statements")
    @NotNull
    d0<q> getProTaxAccountStatement(@Body @NotNull e request);

    @GET("/user/current/statements/purpose-declaration/{transactionId}")
    @NotNull
    d0<q> getPurposeDeclarationStatement(@Path("transactionId") @NotNull String groupId, @NotNull @Query("pocketId") String pocketId);

    @GET("user/current/statements/rib-statements")
    @NotNull
    d0<q> getRibStatement(@Query("walletId") String walletId, @Query("emailNotification") boolean emailNotification);

    @POST("savings/statements")
    @NotNull
    d0<q> getSavingsAccountStatement(@Body @NotNull f body);

    @GET("revolut/information")
    @NotNull
    d0<p> getStatementContent();

    @GET("/user/current/statements/fees")
    @NotNull
    @yhm.d
    d0<q> getStatementOfFees(@Query("year") int year, @Query("walletId") String walletId);

    @GET("/user/current/statements/fees")
    @NotNull
    d0<q> getStatementOfFees(@NotNull @Query("from") String from, @NotNull @Query("to") String to6, @Query("walletId") String walletId);

    @GET("user/current/statements/requests/{requestId}")
    @NotNull
    d0<q> getStatementsByRequest(@Path("requestId") @NotNull String requestId);

    @GET("/user/current/statements/consolidated-statement")
    @NotNull
    d0<q> getStatementsConsolidated(@NotNull @Query("from") String from, @NotNull @Query("to") String to6, @NotNull @Query("productTypes") List<String> productTypes, @Query("emailNotification") boolean emailNotification, @NotNull @Query("format") String format);

    @GET("user/current/statements/period")
    @NotNull
    d0<o> getStatementsPeriod(@NotNull @Query("productTypes") List<String> productTypes, @Query("ownerId") String ownerId);

    @GET("/user/current/statements/tax-certificate")
    @NotNull
    d0<q> getStatementsTaxCertificate(@NotNull @Query("start") String start, @NotNull @Query("end") String end2, @Query("emailNotification") boolean emailNotification, @NotNull @Query("format") String format);

    @GET("/user/current/statements/tax-certificate/available-years")
    Object getStatementsTaxCertificateAvailableYears(@NotNull Continuation<? super r> continuation);

    @GET("/user/current/statements/tax-filing-statement")
    @NotNull
    d0<q> getStatementsTaxFiling(@NotNull @Query("start") String start, @NotNull @Query("end") String end2, @Query("emailNotification") boolean emailNotification, @NotNull @Query("format") String format, @NotNull @Query("taxResidencyCountryCode") String countryCode);

    @GET("/user/current/statements/tax-invoice/{transactionId}")
    @NotNull
    d0<q> getStatementsTaxInvoice(@Path("transactionId") @NotNull String transactionId);

    @GET("/user/current/statements/tax-filing/metadata")
    Object getTaxFilingData(@NotNull @Query("taxResidencyCountryCode") String str, @NotNull Continuation<? super s> continuation);

    @GET("/user/current/statements/topup-confirmations/{transactionId}")
    @NotNull
    d0<u> getTopUpConfirmation(@Path("transactionId") @NotNull String groupId);

    @GET("/user/current/statements/transaction-confirmation/{transactionId}")
    @NotNull
    d0<q> getTransactionConfirmation(@Path("transactionId") @NotNull String groupId, @Query("download-report") boolean downloadReport);

    @GET("user/current/statements/transaction-statements/{transactionId}")
    @NotNull
    d0<q> getTransactionStatement(@Path("transactionId") @NotNull String groupId, @NotNull @Query("pocketId") String pocketId, @Query("cryptoCPPart") String cryptoCPPart);
}
