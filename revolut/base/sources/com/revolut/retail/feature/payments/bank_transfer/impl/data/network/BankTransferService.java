package com.revolut.retail.feature.payments.bank_transfer.impl.data.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import m2k.a;
import m2k.e;
import m2k.j;
import m2k.q;
import m2k.r;
import m2k.s;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0006H'¢\u0006\u0004\b\u0013\u0010\u0014J}\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u007f\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\b2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u000f2\b\b\u0001\u0010!\u001a\u00020\u000f2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010&\u001a\u00020\u0006H§@¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/data/network/BankTransferService;", "", "Lm2k/q;", "body", "Lwj0/b;", "idempotencyTag", "", "location", "Lefm/d0;", "", "Lm2k/r;", "transfer", "(Lm2k/q;Lwj0/b;Ljava/lang/String;)Lefm/d0;", "targetCurrency", "recipientCountry", "", "amount", "beneficiaryId", "Lm2k/a;", "getAdditionalInformationConfig", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lefm/d0;", "pair", "priceQuoteTraceId", "transferFeeAmount", "transferFeeCurrency", "sourcePocketId", "walletId", "taxTreatment", "Lm2k/j;", "getTransferExchangeRate", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "sourceCurrency", "targetAmount", "startTime", "chargeBearer", "Lm2k/e;", "getTransferAvailableTypes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "transactionId", "Lm2k/s;", "getTransferShareLink", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankTransferService {
    @GET("bank-transfer/additional-information")
    @NotNull
    d0<a> getAdditionalInformationConfig(@NotNull @Query("transferCurrency") String targetCurrency, @NotNull @Query("recipientCountry") String recipientCountry, @Query("amount") long amount, @NotNull @Query("beneficiaryId") String beneficiaryId);

    @GET("bank-transfer/available-types")
    @NotNull
    d0<List<e>> getTransferAvailableTypes(@Header("X-Price-Quote-Trace-Id") String priceQuoteTraceId, @NotNull @Query("beneficiaryId") String beneficiaryId, @Query("sourceCurrency") String sourceCurrency, @NotNull @Query("currency") String targetCurrency, @Query("amount") long targetAmount, @Query("startTime") long startTime, @Query("walletId") String walletId, @Query("chargeBearer") String chargeBearer, @Query("sourcePocketId") String sourcePocketId);

    @GET("bank-transfer/quote/{pair}")
    @NotNull
    d0<j> getTransferExchangeRate(@Path("pair") @NotNull String pair, @Header("X-Price-Quote-Trace-Id") String priceQuoteTraceId, @Query("amount") long amount, @Query("transferFeeAmount") Long transferFeeAmount, @Query("transferFeeCcy") String transferFeeCurrency, @Query("recipientCountry") String recipientCountry, @Query("sourcePocketId") String sourcePocketId, @Query("walletId") String walletId, @Query("taxTreatment") String taxTreatment);

    @POST("bank-transfer/{transactionId}/share")
    Object getTransferShareLink(@Path("transactionId") @NotNull String str, @NotNull Continuation<? super s> continuation);

    @POST("bank-transfer")
    @NotNull
    d0<List<r>> transfer(@Body @NotNull q body, @Tag b idempotencyTag, @Header("X-Client-Geo-Location") String location);
}
