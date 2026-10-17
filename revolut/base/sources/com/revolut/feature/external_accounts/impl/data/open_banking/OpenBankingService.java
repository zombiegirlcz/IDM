package com.revolut.feature.external_accounts.impl.data.open_banking;

import efm.d0;
import if6.a;
import if6.d;
import if6.g;
import if6.h;
import if6.i;
import if6.j;
import if6.k;
import if6.l;
import if6.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u001a\u0010\u0015J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u001f\u001a\u00020\u0007H'¢\u0006\u0004\b!\u0010\"J3\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u001f\u001a\u00020\u0007H'¢\u0006\u0004\b$\u0010\"J$\u0010'\u001a\u00020&2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u0007H§@¢\u0006\u0004\b'\u0010\fJ\u001a\u0010)\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020(H§@¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020+H§@¢\u0006\u0004\b,\u0010-¨\u0006.À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/data/open_banking/OpenBankingService;", "", "Lefm/d0;", "", "Lif6/d;", "getConsents", "()Lefm/d0;", "", "clientId", "state", "Lif6/b;", "getAuConsents", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consentId", "Lefm/b;", "revokeConsent", "(Ljava/lang/String;)Lefm/b;", "Lif6/i;", "request", "Lif6/j;", "authorizeAccounts", "(Lif6/i;)Lefm/d0;", "Lwj0/b;", "idempotencyTag", "authorizePayment", "(Lif6/i;Lwj0/b;)Lefm/d0;", "rejectPayment", "authorizeFunds", "Lif6/k;", "getClientDetails", "(Ljava/lang/String;)Lefm/d0;", "redirectUri", "Lif6/m;", "getPayment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lif6/l;", "getFundsConfirmation", "requestUri", "Lif6/a;", "getAuAccountsConsent", "Lif6/g;", "authorizeAuAccounts", "(Lif6/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lif6/h;", "rejectAuAccounts", "(Lif6/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OpenBankingService {
    @POST("consents/authorise/account")
    @NotNull
    d0<j> authorizeAccounts(@Body @NotNull i request);

    @POST("consents/authorise/au-read-only")
    Object authorizeAuAccounts(@Body @NotNull g gVar, @NotNull Continuation<? super j> continuation);

    @POST("consents/authorise/funds-confirmation")
    @NotNull
    d0<j> authorizeFunds(@Body @NotNull i request, @Tag @NotNull b idempotencyTag);

    @POST("consents/authorise/payment")
    @NotNull
    d0<j> authorizePayment(@Body @NotNull i request, @Tag @NotNull b idempotencyTag);

    @GET("consents/au-read-only")
    Object getAuAccountsConsent(@NotNull @Query("clientId") String str, @NotNull @Query("requestUri") String str2, @NotNull Continuation<? super a> continuation);

    @GET("/consents")
    Object getAuConsents(@Query("clientId") String str, @NotNull @Query("state") String str2, @NotNull Continuation<? super List<if6.b>> continuation);

    @GET("apps/{clientId}")
    @NotNull
    d0<k> getClientDetails(@Path("clientId") @NotNull String clientId);

    @GET("/consents")
    @NotNull
    d0<List<d>> getConsents();

    @GET("consents/funds-confirmation")
    @NotNull
    d0<l> getFundsConfirmation(@NotNull @Query("clientId") String clientId, @NotNull @Query("request") String request, @NotNull @Query("redirectUri") String redirectUri);

    @GET("consents/payment")
    @NotNull
    d0<m> getPayment(@NotNull @Query("clientId") String clientId, @NotNull @Query("request") String request, @NotNull @Query("redirectUri") String redirectUri);

    @POST("consents/reject/au-read-only")
    Object rejectAuAccounts(@Body @NotNull h hVar, @NotNull Continuation<? super j> continuation);

    @POST("consents/reject/payment")
    @NotNull
    d0<j> rejectPayment(@Body @NotNull i request);

    @DELETE("/consents/{id}")
    @NotNull
    efm.b revokeConsent(@Path("id") @NotNull String consentId);
}
