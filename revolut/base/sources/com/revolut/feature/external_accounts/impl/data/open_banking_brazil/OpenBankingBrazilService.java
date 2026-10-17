package com.revolut.feature.external_accounts.impl.data.open_banking_brazil;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mf6.a;
import mf6.d;
import mf6.f;
import mf6.g;
import mf6.h;
import mf6.i;
import mf6.j;
import mf6.k;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001e\u001a\u00020\u00192\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b!\u0010\u001b¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/data/open_banking_brazil/OpenBankingBrazilService;", "", "Lmf6/j;", "startPaymentDto", "Lmf6/g;", "initPaymentConsent", "(Lmf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmf6/b;", "paymentDto", "initHandoffPaymentConsent", "(Lmf6/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consentId", "Lmf6/h;", "paymentActionDto", "Lwj0/b;", "idempotencyTag", "Lmf6/i;", "consentAction", "(Ljava/lang/String;Lmf6/h;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmf6/d;", "getConsentsGroups", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmf6/a;", "getOutboundLinkedAccounts", "Lmf6/f;", "getConsentDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmf6/k;", "body", "updateConsentDetails", "(Ljava/lang/String;Lmf6/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteConsent", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OpenBankingBrazilService {
    @PATCH("/consents/brazil/payments/action/{consentId}")
    Object consentAction(@Path("consentId") @NotNull String str, @Body @NotNull h hVar, @Tag @NotNull b bVar, @NotNull Continuation<? super i> continuation);

    @DELETE("/consents/brazil/payments/{consentId}")
    Object deleteConsent(@Path("consentId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/consents/brazil/payments/{consentId}")
    Object getConsentDetails(@Path("consentId") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @GET("/consents/brazil/payments")
    Object getConsentsGroups(@NotNull Continuation<? super d> continuation);

    @GET("/consents/brazil/payments/linked-accounts")
    Object getOutboundLinkedAccounts(@NotNull Continuation<? super a> continuation);

    @POST("/consents/brazil/payments/handoff")
    Object initHandoffPaymentConsent(@Body @NotNull mf6.b bVar, @NotNull Continuation<? super g> continuation);

    @POST("/consents/brazil/payments/start")
    Object initPaymentConsent(@Body @NotNull j jVar, @NotNull Continuation<? super g> continuation);

    @PATCH("/consents/brazil/payments/{consentId}")
    Object updateConsentDetails(@Path("consentId") @NotNull String str, @Body @NotNull k kVar, @NotNull Continuation<? super f> continuation);
}
