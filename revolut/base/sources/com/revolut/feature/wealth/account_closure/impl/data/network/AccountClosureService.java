package com.revolut.feature.wealth.account_closure.impl.data.network;

import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import wtg.f;
import wtg.i;
import wtg.o;
import wtg.r;
import wtg.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/data/network/AccountClosureService;", "", "", "id", "Lwtg/i;", "body", "Lefm/b;", "requestAccountClosure", "(Ljava/lang/String;Lwtg/i;)Lefm/b;", "portfolioId", "Lefm/d0;", "Lwtg/o;", "getAccountClosureFeedbackOptions", "(Ljava/lang/String;)Lefm/d0;", "Lwtg/z;", "getAccountClosureProgress", "Lwtg/r;", "getAccountClosurePreconditions", "Lwtg/f;", "getBackendRequestedAccountClosureById", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountClosureService {
    @GET("/trading/portfolios/{id}/termination/feedback/options")
    @NotNull
    d0<o> getAccountClosureFeedbackOptions(@Path("id") @NotNull String portfolioId);

    @GET("/trading/portfolios/{id}/termination/check")
    @NotNull
    d0<r> getAccountClosurePreconditions(@Path("id") @NotNull String portfolioId);

    @GET("/trading/portfolios/{id}/account-closure/progress")
    @NotNull
    d0<z> getAccountClosureProgress(@Path("id") @NotNull String portfolioId);

    @GET("trading/portfolios/{id}/closure/details")
    @NotNull
    d0<f> getBackendRequestedAccountClosureById(@Path("id") @NotNull String portfolioId);

    @POST("/trading/portfolios/{id}/terminate")
    @NotNull
    b requestAccountClosure(@Path("id") @NotNull String id10, @Body @NotNull i body);
}
