package com.revolut.retail.feature.trading_onboarding.impl.data.network;

import efm.b;
import efm.d0;
import fyk.c0;
import fyk.f;
import fyk.k;
import fyk.n;
import fyk.t;
import fyk.w;
import fyk.z;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ6\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\u0014J\u001b\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u0006H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006H'¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001b\u001a\u00020\u001fH'¢\u0006\u0004\b\u001d\u0010 J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0001\u0010\u001b\u001a\u00020!H§@¢\u0006\u0004\b\u001d\u0010$J\u001a\u0010%\u001a\u00020#2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010&J0\u0010+\u001a\u00020*2\b\b\u0001\u0010'\u001a\u00020\u00022\u0014\b\u0001\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020(H§@¢\u0006\u0004\b+\u0010,¨\u0006-À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/data/network/OnboardingService;", "", "", "portfolioId", "part", "remediationType", "Lefm/d0;", "Lfyk/f;", "getNextOnboardingPart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "accountId", "currentOnboardingPart", "", "productCodes", "getNextTradingAccountOnboardingPart", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfyk/k;", "body", "startTradingAccountOnboarding", "(Ljava/lang/String;Lfyk/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lfyk/n;", "getKycDocuments", "()Lefm/d0;", "Lfyk/w;", "getKyc", "Lfyk/c0;", "kycDto", "Lefm/b;", "updateKyc", "(Lfyk/c0;)Lefm/b;", "Lfyk/t;", "(Lfyk/t;)Lefm/b;", "Lfyk/z;", "Lretrofit2/Response;", "", "(Lfyk/z;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOtpChallenge", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "documentType", "", "parameters", "Lokhttp3/ResponseBody;", "getOnboardingPdfDocument", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnboardingService {
    @GET("/trading/users/current/kyc")
    @NotNull
    d0<w> getKyc();

    @GET("/trading/users/current/kyc/documents-info")
    @NotNull
    d0<List<n>> getKycDocuments();

    @GET("/trading-access/portfolios/{portfolioId}/onboarding/next")
    @NotNull
    d0<f> getNextOnboardingPart(@Path("portfolioId") @NotNull String portfolioId, @Query("remediationType") String remediationType);

    @GET("/trading-access/portfolios/{portfolioId}/onboarding/next/{part}")
    @NotNull
    d0<f> getNextOnboardingPart(@Path("portfolioId") @NotNull String portfolioId, @Path("part") @NotNull String part, @Query("remediationType") String remediationType);

    @POST("/trading-access/accounts/{accountId}/next/{step}")
    Object getNextTradingAccountOnboardingPart(@Path("accountId") @NotNull String str, @Path("step") @NotNull String str2, @Query("productCodes") List<String> list, @NotNull Continuation<? super f> continuation);

    @GET("/trading-access/documents/{documentType}")
    Object getOnboardingPdfDocument(@Path("documentType") @NotNull String str, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super ResponseBody> continuation);

    @POST("/trading-access/accounts/{accountId}/onboarding/otp/challenge")
    Object getOtpChallenge(@Path("accountId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/trading-access/accounts/{accountId}/next")
    Object startTradingAccountOnboarding(@Path("accountId") @NotNull String str, @Body @NotNull k kVar, @NotNull Continuation<? super f> continuation);

    @PATCH("/trading/users/current/kyc")
    @NotNull
    b updateKyc(@Body @NotNull c0 kycDto);

    @PATCH("/trading/users/current/kyc")
    @NotNull
    b updateKyc(@Body @NotNull t kycDto);

    @PATCH("/trading/users/current/kyc")
    Object updateKyc(@Body @NotNull z zVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
