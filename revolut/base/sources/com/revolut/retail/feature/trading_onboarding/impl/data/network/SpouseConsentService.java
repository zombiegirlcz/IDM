package com.revolut.retail.feature.trading_onboarding.impl.data.network;

import efm.d0;
import fyk.g;
import fyk.h;
import fyk.i;
import fyk.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH'¢\u0006\u0004\b\u0013\u0010\u0011¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/data/network/SpouseConsentService;", "", "Lfyk/i;", "spouseConsentRequest", "Lretrofit2/Response;", "", "requestSpouseConsent", "(Lfyk/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestManualSpouseConsent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfyk/g;", "spousalConsentDecisionDto", "submitSpousalConsent", "(Lfyk/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lefm/d0;", "Lfyk/h;", "getApplicant", "()Lefm/d0;", "Lfyk/j;", "getConsentStatus", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SpouseConsentService {
    @GET("/spousal-consent/trading/applicant")
    @NotNull
    d0<h> getApplicant();

    @GET("/spousal-consent/trading/status")
    @NotNull
    d0<j> getConsentStatus();

    @POST("/spousal-consent/trading")
    Object requestManualSpouseConsent(@NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/spousal-consent/trading")
    Object requestSpouseConsent(@Body @NotNull i iVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/spousal-consent/trading/spouse/decision")
    Object submitSpousalConsent(@Body @NotNull g gVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
