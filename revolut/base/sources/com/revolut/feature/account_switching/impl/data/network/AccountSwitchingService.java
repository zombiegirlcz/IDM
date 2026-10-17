package com.revolut.feature.account_switching.impl.data.network;

import java.util.List;
import k91.a;
import k91.b;
import k91.c;
import k91.d;
import k91.n;
import k91.o;
import k91.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\u0007\u0010\u0004J\u001a\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH§@¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0004¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/account_switching/impl/data/network/AccountSwitchingService;", "", "Lk91/b;", "getAccountSwitchingIntroData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lk91/o;", "getSourceBanksDetails", "Lk91/n;", "body", "initiateBankConnection", "(Lk91/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "", "sendBankSuccessfullyConnected", "Lk91/c;", "getPayments", "Lk91/a;", "data", "submitAccountSwitchingData", "(Lk91/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lk91/d;", "getStatus", "Lk91/p;", "getSubmittedSwitchData", "retail_feature_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountSwitchingService {
    @GET("/primary-account-enabler/switch")
    Object getAccountSwitchingIntroData(@NotNull Continuation<? super b> continuation);

    @GET("/primary-account-enabler/payments")
    Object getPayments(@NotNull Continuation<? super c> continuation);

    @GET("/primary-account-enabler/banks")
    Object getSourceBanksDetails(@NotNull Continuation<? super List<o>> continuation);

    @GET("/primary-account-enabler/switch/progress")
    Object getStatus(@NotNull Continuation<? super d> continuation);

    @GET("/primary-account-enabler/dashboard")
    Object getSubmittedSwitchData(@NotNull Continuation<? super p> continuation);

    @POST("/primary-account-enabler/switch")
    Object initiateBankConnection(@Body @NotNull n nVar, @NotNull Continuation<Object> continuation);

    @POST("/primary-account-enabler/switch/bank-connected")
    Object sendBankSuccessfullyConnected(@NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/primary-account-enabler/switch/submit-payments")
    Object submitAccountSwitchingData(@Body @NotNull a aVar, @NotNull Continuation<Object> continuation);
}
