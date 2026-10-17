package com.revolut.feature.credit.application.impl.network;

import efm.b;
import efm.d0;
import er3.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import tt3.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/impl/network/CreditLimitIncreaseService;", "", "Lefm/d0;", "Ler3/b;", "getCreditLimitIncreasePreQualificationOffer", "()Lefm/d0;", "Ltt3/a;", "acceptCreditLimitIncreasePreQualificationOffer", "Lefm/b;", "declineCreditLimitIncreasePreQualificationOffer", "()Lefm/b;", "hideCreditLimitIncreasePreQualificationOffer", "", "facilityId", "Ler3/c;", "getCreditLimitIncreasePreference", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmr3/a;", "request", "", "updateCreditLimitIncreasePreference", "(Ljava/lang/String;Lmr3/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditLimitIncreaseService {
    @POST("/credit-application/cc-cli/pre-qualification/offer/accept")
    @NotNull
    d0<a> acceptCreditLimitIncreasePreQualificationOffer();

    @POST("/credit-application/cc-cli/pre-qualification/offer/decline")
    @NotNull
    b declineCreditLimitIncreasePreQualificationOffer();

    @GET("/credit-application/cc-cli/pre-qualification/offer")
    @NotNull
    d0<er3.b> getCreditLimitIncreasePreQualificationOffer();

    @GET("/credit-application/cc-cli/{facilityId}/cli-preference")
    Object getCreditLimitIncreasePreference(@Path("facilityId") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @POST("/credit-application/cc-cli/pre-qualification/offer/hide")
    @NotNull
    b hideCreditLimitIncreasePreQualificationOffer();

    @POST("/credit-application/cc-cli/{facilityId}/cli-preference")
    Object updateCreditLimitIncreasePreference(@Path("facilityId") @NotNull String str, @Body @NotNull mr3.a aVar, @NotNull Continuation<? super Unit> continuation);
}
