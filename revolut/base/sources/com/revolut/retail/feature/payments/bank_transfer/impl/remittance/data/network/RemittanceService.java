package com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.network;

import efm.d0;
import h3k.d;
import h3k.k;
import h3k.m;
import h3k.n;
import h3k.q;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJw\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018Je\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u001c\u001a\u00020\u0007H'¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010 \u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance/data/network/RemittanceService;", "", "Lefm/d0;", "", "Lh3k/m;", "getRecipientCountries", "()Lefm/d0;", "", "recipientCountry", "Lh3k/n;", "getRecipientCurrencies", "(Ljava/lang/String;)Lefm/d0;", "priceQuoteTraceId", "recipientCurrency", "senderCurrency", "senderPocketId", "", "amount", "", "isRecipientAmount", "chargeBearer", "walletId", "Lh3k/q;", "getRoutes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)Lefm/d0;", "senderCountry", "beneficiaryId", "initiationMethod", "routeId", "Lh3k/d;", "getCorridorProperties", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "recipientAmount", "Lh3k/k;", "getProvidersPricing", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RemittanceService {
    @GET("remittance/corridor-properties")
    @NotNull
    d0<List<d>> getCorridorProperties(@NotNull @Query("recipientCountry") String recipientCountry, @NotNull @Query("recipientCurrency") String recipientCurrency, @NotNull @Query("senderCountry") String senderCountry, @NotNull @Query("senderCurrency") String senderCurrency, @Query("beneficiaryId") String beneficiaryId, @Query("initiationMethod") String initiationMethod, @NotNull @Query("id") String routeId);

    @GET("remittance/provider-pricing")
    @NotNull
    d0<k> getProvidersPricing(@NotNull @Query("senderCurrency") String senderCurrency, @Query("recipientAmount") long recipientAmount, @NotNull @Query("recipientCountry") String recipientCountry, @NotNull @Query("recipientCurrency") String recipientCurrency);

    @GET("remittance/recipient-countries")
    @NotNull
    d0<List<m>> getRecipientCountries();

    @GET("remittance/recipient-currencies")
    @NotNull
    d0<List<n>> getRecipientCurrencies(@NotNull @Query("recipientCountry") String recipientCountry);

    @GET("remittance/routes")
    @NotNull
    d0<q> getRoutes(@Header("X-Price-Quote-Trace-Id") String priceQuoteTraceId, @NotNull @Query("recipientCountry") String recipientCountry, @NotNull @Query("recipientCurrency") String recipientCurrency, @NotNull @Query("senderCurrency") String senderCurrency, @Query("senderPocketId") String senderPocketId, @Query("amount") long amount, @Query("isRecipientAmount") boolean isRecipientAmount, @Query("chargeBearer") String chargeBearer, @Query("walletId") String walletId);
}
