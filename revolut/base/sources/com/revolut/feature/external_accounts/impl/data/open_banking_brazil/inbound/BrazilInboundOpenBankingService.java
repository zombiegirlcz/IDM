package com.revolut.feature.external_accounts.impl.data.open_banking_brazil.inbound;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pf6.i;
import pf6.l;
import pf6.p;
import pf6.s;
import qo6.c;
import qo6.r;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import we6.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 !2\u00020\u0001:\u0001\"J0\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u00020\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010 ¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/data/open_banking_brazil/inbound/BrazilInboundOpenBankingService;", "", "", "institutionId", "branchId", "Lwe6/k;", "context", "Lpf6/c;", "getMandatePreview", "(Ljava/lang/String;Ljava/lang/String;Lwe6/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consentId", "type", "Lqo6/c;", "fetchConsentDetails", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "revokeConsent", "Lpf6/p;", "body", "Lpf6/s;", "createPixMandate", "(Lpf6/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqo6/r;", "params", "updateConsent", "(Ljava/lang/String;Lqo6/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mandateId", "Lpf6/l;", "submitAuthResult", "(Ljava/lang/String;Lpf6/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpf6/i;", "fetchInstitutionInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrazilInboundOpenBankingService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f72362a;

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.data.open_banking_brazil.inbound.BrazilInboundOpenBankingService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f72362a = new Companion();

        private Companion() {
        }
    }

    @POST("/external-institutions/mandates")
    Object createPixMandate(@Body @NotNull p pVar, @NotNull Continuation<? super s> continuation);

    @GET("/consents/brazil/payments/{consentId}")
    Object fetchConsentDetails(@Path("consentId") @NotNull String str, @NotNull @Query("type") String str2, @NotNull Continuation<? super c> continuation);

    @GET("/external-institutions/{institutionId}/details")
    Object fetchInstitutionInfo(@Path("institutionId") @NotNull String str, @NotNull Continuation<? super i> continuation);

    @GET("/external-institutions/mandates/preview?type=PIX_SMART_TRANSFER")
    Object getMandatePreview(@NotNull @Query("institutionId") String str, @Query("branchId") String str2, @NotNull @Query("context") k kVar, @NotNull Continuation<? super pf6.c> continuation);

    @DELETE("/consents/brazil/payments/{consentId}")
    Object revokeConsent(@Path("consentId") @NotNull String str, @NotNull @Query("type") String str2, @NotNull Continuation<? super Unit> continuation);

    @POST("/external-institutions/mandates/{mandateId}/auth-result")
    Object submitAuthResult(@Path("mandateId") @NotNull String str, @Body @NotNull l lVar, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/consents/brazil/payments/{consentId}")
    Object updateConsent(@Path("consentId") @NotNull String str, @Body @NotNull r rVar, @NotNull Continuation<? super Unit> continuation);
}
