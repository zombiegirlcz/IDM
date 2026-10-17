package com.revolut.retail.feature.crypto_deposits.impl.network;

import al5.a;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import tbj.b;
import tbj.g;
import tbj.h;
import tbj.i;
import tbj.j;
import tbj.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H'¢\u0006\u0004\b\u0014\u0010\u0012J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00132\b\b\u0001\u0010\u001b\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H§@¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H§@¢\u0006\u0004\b%\u0010#¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/network/CryptoDepositsService;", "", "", "pocketId", "blockchain", "Lefm/d0;", "Lretrofit2/Response;", "getAddressResponse", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "groupId", "Ltbj/k;", "returnDepositRequestDto", "Lefm/b;", "returnDeposit", "(Ljava/lang/String;Ltbj/k;)Lefm/b;", "", "Ltbj/b;", "getActionRequiredDeposits", "()Lefm/d0;", "", "validateRestriction", "hash", "address", "Ltbj/g;", "getDepositTransactions", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltbj/h;", "body", "Ltbj/i;", "getDirectDepositMeshToken", "(Ltbj/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltbj/j;", "postMeshManagedToken", "(Ltbj/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureForAvailableBlockchains", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lal5/a;", "getCurrenciesRelevance", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoDepositsService {
    @POST("/crypto/deposit-address/ensure-for-available-blockchains")
    Object ensureForAvailableBlockchains(@NotNull Continuation<? super Response<Object>> continuation);

    @GET("crypto/topup/action-required")
    @NotNull
    d0<List<b>> getActionRequiredDeposits();

    @GET("/crypto/deposit-address/{pocketId}/{blockchain}")
    @NotNull
    d0<Response<String>> getAddressResponse(@Path("pocketId") @NotNull String pocketId, @Path("blockchain") @NotNull String blockchain);

    @GET("/crypto/currencies/relevance/topups")
    Object getCurrenciesRelevance(@NotNull Continuation<? super a> continuation);

    @GET("/crypto/topup")
    Object getDepositTransactions(@NotNull @Query("hash") String str, @NotNull @Query("address") String str2, @NotNull Continuation<? super List<g>> continuation);

    @POST("/crypto/integration/mesh/direct-deposit-token")
    Object getDirectDepositMeshToken(@Body @NotNull h hVar, @NotNull Continuation<? super i> continuation);

    @POST("/crypto/integration/mesh/managed-token")
    Object postMeshManagedToken(@Body @NotNull j jVar, @NotNull Continuation<? super Unit> continuation);

    @POST("crypto/topup/{groupId}/return")
    @NotNull
    efm.b returnDeposit(@Path("groupId") @NotNull String groupId, @Body @NotNull k returnDepositRequestDto);

    @POST("/crypto/topup/restrictions-validation")
    @NotNull
    d0<Unit> validateRestriction();
}
