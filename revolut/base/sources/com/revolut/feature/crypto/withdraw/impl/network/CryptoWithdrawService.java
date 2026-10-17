package com.revolut.feature.crypto.withdraw.impl.network;

import cl5.a;
import dp5.a0;
import dp5.b1;
import dp5.c;
import dp5.e1;
import dp5.f;
import dp5.h1;
import dp5.i;
import dp5.j0;
import dp5.k1;
import dp5.l;
import dp5.n1;
import dp5.o;
import dp5.q1;
import dp5.r;
import dp5.u;
import dp5.y0;
import efm.b;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\tH§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020\tH'¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00110\u0004H'¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u001b\u001a\u00020!H'¢\u0006\u0004\b\"\u0010#J5\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010$\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u001b\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\u001b\u001a\u00020,H'¢\u0006\u0004\b.\u0010/J+\u00103\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u001b\u001a\u0002002\n\b\u0001\u00102\u001a\u0004\u0018\u000101H'¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\b\b\u0001\u0010$\u001a\u00020\tH'¢\u0006\u0004\b6\u00107JK\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00042\b\b\u0001\u00108\u001a\u00020\t2\b\b\u0001\u0010$\u001a\u00020\t2\b\b\u0001\u0010:\u001a\u0002092\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020<0\u00042\b\b\u0001\u00108\u001a\u00020\tH'¢\u0006\u0004\b?\u00107J)\u0010A\u001a\b\u0012\u0004\u0012\u00020<0\u00042\b\b\u0001\u00108\u001a\u00020\t2\b\b\u0001\u0010@\u001a\u00020\tH'¢\u0006\u0004\bA\u0010\u000eJ\u001a\u0010D\u001a\u00020C2\b\b\u0001\u0010B\u001a\u00020\tH§@¢\u0006\u0004\bD\u0010\u0016J5\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020G0F0\u00042\b\b\u0001\u0010$\u001a\u00020\t2\b\b\u0001\u0010E\u001a\u00020\tH'¢\u0006\u0004\bH\u0010\u000eJ\u0015\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u0004H'¢\u0006\u0004\bJ\u0010 J\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00042\b\b\u0001\u0010L\u001a\u00020KH'¢\u0006\u0004\bN\u0010OJ\u0010\u0010Q\u001a\u00020PH§@¢\u0006\u0004\bQ\u0010R¨\u0006SÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/network/CryptoWithdrawService;", "", "Ldp5/c;", "cryptoAddressCreateDto", "Lefm/d0;", "Ldp5/f;", "addAddress", "(Ldp5/c;)Lefm/d0;", "addAddressWithCounterparty", "", "address", "blockchain", "Ldp5/i;", "getAddressHostingCheckResult", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "", "includeArchived", "", "getAddresses", "(Ljava/lang/Boolean;)Lefm/d0;", "id", "getAddress", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lefm/b;", "deleteAddress", "(Ljava/lang/String;)Lefm/b;", "Ldp5/n1;", "body", "updateAddress", "(Ljava/lang/String;Ldp5/n1;)Lefm/b;", "Ldp5/r;", "getWallets", "()Lefm/d0;", "Ldp5/l;", "submitCounterpartyDetails", "(Ljava/lang/String;Ldp5/l;)Lefm/b;", "currency", "Ldp5/u;", "getIsAddressValid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Ldp5/q1;", "Ldp5/j0;", "executeWithdrawOrder", "(Ldp5/q1;)Lefm/d0;", "Ldp5/y0;", "Ldp5/b1;", "requestWithdrawQuote", "(Ldp5/y0;)Lefm/d0;", "Ldp5/e1;", "Lwj0/b;", "idempotencyTag", "executeWithdrawOrderV2", "(Ldp5/e1;Lwj0/b;)Lefm/d0;", "Ldp5/d0;", "getLimits", "(Ljava/lang/String;)Lefm/d0;", "addressId", "", "amount", "senderCurrency", "Ldp5/a0;", "getFeesForAddress", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lefm/d0;", "getInitialFeesForAddress", "transactionId", "getFeesForReturnDeposit", "transactionGroupId", "Ldp5/k1;", "getFeesForTransaction", "blockchains", "", "Ldp5/h1;", "getBlockchainRoughFees", "", "validateRestriction", "Ldp5/o;", "inputDto", "Lcl5/a;", "executeCryptoRecipientPreCheck", "(Ldp5/o;)Lefm/d0;", "Lal5/a;", "getCurrenciesRelevance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoWithdrawService {
    @POST("/crypto/addresses")
    @NotNull
    @d
    d0<f> addAddress(@Body @NotNull c cryptoAddressCreateDto);

    @POST("/crypto/wallet-addresses")
    @NotNull
    d0<f> addAddressWithCounterparty(@Body @NotNull c cryptoAddressCreateDto);

    @DELETE("/crypto/addresses/{id}")
    @NotNull
    b deleteAddress(@Path("id") @NotNull String id10);

    @POST("/crypto/counterparties/precheck")
    @NotNull
    d0<a> executeCryptoRecipientPreCheck(@Body @NotNull o inputDto);

    @POST("/crypto-withdrawals")
    @NotNull
    d0<j0> executeWithdrawOrder(@Body @NotNull q1 body);

    @POST("/crypto/withdrawals")
    @NotNull
    d0<j0> executeWithdrawOrderV2(@Body @NotNull e1 body, @Tag wj0.b idempotencyTag);

    @GET("/crypto/addresses/{id}")
    Object getAddress(@Path("id") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @GET("/crypto/counterparties/hosting")
    @NotNull
    d0<i> getAddressHostingCheckResult(@NotNull @Query("address") String address, @NotNull @Query("blockchain") String blockchain);

    @GET("/crypto/addresses")
    @NotNull
    d0<List<f>> getAddresses(@Query("includeArchived") Boolean includeArchived);

    @GET("crypto-withdrawals/roughFee/{currency}")
    @NotNull
    d0<Map<String, h1>> getBlockchainRoughFees(@Path("currency") @NotNull String currency, @NotNull @Query("blockchains") String blockchains);

    @GET("/crypto/currencies/relevance/withdrawals")
    Object getCurrenciesRelevance(@NotNull Continuation<? super al5.a> continuation);

    @GET("/crypto-withdrawals/fee")
    @NotNull
    d0<a0> getFeesForAddress(@NotNull @Query("cryptoAddressId") String addressId, @NotNull @Query("currency") String currency, @Query("amount") long amount, @Query("senderCurrency") String senderCurrency, @Query("blockchain") String blockchain);

    @GET("/crypto-withdrawals/fee")
    @NotNull
    d0<a0> getFeesForReturnDeposit(@NotNull @Query("cryptoAddressId") String addressId, @NotNull @Query("topupId") String transactionId);

    @GET("crypto-withdrawals/transaction/{transactionGroupId}/v2/fee")
    Object getFeesForTransaction(@Path("transactionGroupId") @NotNull String str, @NotNull Continuation<? super k1> continuation);

    @GET("/crypto-withdrawals/fee")
    @NotNull
    d0<a0> getInitialFeesForAddress(@NotNull @Query("cryptoAddressId") String addressId);

    @GET("/crypto/address/validate/{currency}/{address}")
    @NotNull
    d0<u> getIsAddressValid(@Path("currency") @NotNull String currency, @Path("address") @NotNull String address, @Query("blockchain") String blockchain);

    @GET("/crypto-withdrawals/limits")
    @NotNull
    d0<dp5.d0> getLimits(@NotNull @Query("currency") String currency);

    @GET("/crypto/wallets")
    @NotNull
    d0<List<r>> getWallets();

    @POST("/crypto/withdrawals/quote")
    @NotNull
    d0<b1> requestWithdrawQuote(@Body @NotNull y0 body);

    @PATCH("/crypto/counterparties/{id}")
    @NotNull
    b submitCounterpartyDetails(@Path("id") @NotNull String id10, @Body @NotNull l body);

    @PATCH("/crypto/addresses/{id}")
    @NotNull
    b updateAddress(@Path("id") @NotNull String id10, @Body @NotNull n1 body);

    @POST("/crypto-withdrawals/restrictions-validation")
    @NotNull
    d0<Unit> validateRestriction();
}
