package com.revolut.shared.feature.wealth.domain.impl.data.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rdl.a;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ3\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'¢\u0006\u0004\b\u0010\u0010\tJG\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0018\u0010\u0017JG\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0019\u0010\u0017JQ\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0006H'¢\u0006\u0004\b\u001d\u0010\tJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'¢\u0006\u0004\b\u001e\u0010\tJ3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'¢\u0006\u0004\b\u001f\u0010\u000eJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00030\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0006H'¢\u0006\u0004\b!\u0010\tJ%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00030\u00022\b\b\u0001\u0010\"\u001a\u00020\u0006H'¢\u0006\u0004\b#\u0010\t¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/TradingStatementsService;", "", "Lefm/d0;", "", "getMonthlyStatements", "()Lefm/d0;", "", "statementId", "getMonthlyStatementPublicUrl", "(Ljava/lang/String;)Lefm/d0;", "currency", "from", "to", "startStatementGeneration", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "id", "checkStatementStatus", "format", "type", "", "emailNotification", "Lrdl/a;", "getStatementGenerationStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lefm/d0;", "getCryptoStatementGenerationStatus", "getCommoditiesStatementGenerationStatus", "accountId", "getStatementGenerationStatusForAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lefm/d0;", "getSuitabilityStatementStatus", "getTradeStatementConfirmationStatus", "getCostAndChargesStatementStatus", "Lpdl/a;", "getReports", "portfolioId", "getUsReports", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingStatementsService {
    @GET("user/current/portfolio/statements/activity/{id}/status")
    @NotNull
    d0<Object> checkStatementStatus(@Path("id") @NotNull String id10);

    @GET("trading/users/current/statements/commodity/account")
    @NotNull
    d0<a> getCommoditiesStatementGenerationStatus(@NotNull @Query("fromDate") String from, @NotNull @Query("toDate") String to6, @NotNull @Query("format") String format, @NotNull @Query("type") String type, @Query("emailNotification") boolean emailNotification);

    @GET("/trading/accounts/{accountId}/reports/costs-and-charges")
    @NotNull
    d0<a> getCostAndChargesStatementStatus(@Path("accountId") @NotNull String accountId, @NotNull @Query("fromDate") String from, @NotNull @Query("toDate") String to6);

    @GET("trading/users/current/statements/crypto/account")
    @NotNull
    d0<a> getCryptoStatementGenerationStatus(@NotNull @Query("fromDate") String from, @NotNull @Query("toDate") String to6, @NotNull @Query("format") String format, @NotNull @Query("type") String type, @Query("emailNotification") boolean emailNotification);

    @GET("user/current/portfolio/statements/{statement_id}/public-url")
    @NotNull
    d0<Object> getMonthlyStatementPublicUrl(@Path("statement_id") @NotNull String statementId);

    @GET("/user/current/portfolio/statements?type=monthly")
    @NotNull
    d0<List<Object>> getMonthlyStatements();

    @GET("/trading/accounts/{accountId}/reports/costs-and-charges/ranges")
    @NotNull
    d0<List<pdl.a>> getReports(@Path("accountId") @NotNull String accountId);

    @GET("user/current/portfolio/statements/trading-account")
    @NotNull
    d0<a> getStatementGenerationStatus(@NotNull @Query("fromDate") String from, @NotNull @Query("toDate") String to6, @NotNull @Query("format") String format, @NotNull @Query("type") String type, @Query("emailNotification") boolean emailNotification);

    @GET("trading/accounts/{accountId}/statements/account-statement")
    @NotNull
    d0<a> getStatementGenerationStatusForAccount(@Path("accountId") @NotNull String accountId, @NotNull @Query("fromDate") String from, @NotNull @Query("toDate") String to6, @NotNull @Query("format") String format, @NotNull @Query("type") String type, @Query("emailNotification") boolean emailNotification);

    @GET("trading/accounts/{accountId}/statements/account-suitability")
    @NotNull
    d0<a> getSuitabilityStatementStatus(@Path("accountId") @NotNull String accountId);

    @GET("user/current/portfolio/statements/trade/{assetTradeId}/confirmation")
    @NotNull
    d0<a> getTradeStatementConfirmationStatus(@Path("assetTradeId") @NotNull String id10);

    @GET("user/current/portfolio/statements/tax-forms/1099-b/ranges")
    @NotNull
    @d
    d0<List<pdl.a>> getUsReports(@NotNull @Query("portfolioId") String portfolioId);

    @POST("user/current/portfolio/statements/activity")
    @NotNull
    d0<Object> startStatementGeneration(@NotNull @Query("currency") String currency, @NotNull @Query("from") String from, @NotNull @Query("to") String to6);
}
