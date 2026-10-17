package com.revolut.feature.configuration.impl.network;

import efm.d0;
import java.util.Set;
import kotlin.Metadata;
import lk3.e;
import lk3.g;
import lk3.h;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ}\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005H'¢\u0006\u0004\b\u001d\u0010\u000bJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H'¢\u0006\u0004\b\u001f\u0010\u000b¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/configuration/impl/network/ConfigurationService;", "", "", "modifiedSince", "url", "Lefm/d0;", "Lokhttp3/ResponseBody;", "getUrlData", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Llk3/h;", "getListOfAvailableCountries", "()Lefm/d0;", "targetCurrency", "recipientCountry", "transferType", "userCode", "beneficiaryId", "", "amount", "transferAmount", "fromBalanceType", "toBalanceType", "getTransferReasonConfig", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "country", "", "getAvailableCurrenciesByCountry", "(Ljava/lang/String;)Lefm/d0;", "Llk3/g;", "getAllAvailableCryptoCurrencies", "Llk3/e;", "getAddressLocalisationsConfig", "feature_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConfigurationService {
    @GET("/my-card/delivery/address-localisations")
    @NotNull
    d0<e> getAddressLocalisationsConfig();

    @GET("/config/crypto-currencies")
    @NotNull
    d0<g> getAllAvailableCryptoCurrencies();

    @GET("/config/wallet-currencies")
    @NotNull
    d0<Set<String>> getAvailableCurrenciesByCountry(@NotNull @Query("country") String country);

    @GET("config/user/country-change-allowance")
    @NotNull
    d0<h> getListOfAvailableCountries();

    @GET("/config/user/transfer-reasons")
    @NotNull
    d0<Object> getTransferReasonConfig(@NotNull @Query("transferCurrency") String targetCurrency, @Query("recipientCountry") String recipientCountry, @NotNull @Query("transferType") String transferType, @Query("userCode") String userCode, @Query("beneficiaryId") String beneficiaryId, @Query("amount") Long amount, @Query("transferAmount") Long transferAmount, @Query("fromPocketType") String fromBalanceType, @Query("toPocketType") String toBalanceType);

    @Headers({"X-Force-App-Auth: true"})
    @GET
    @NotNull
    d0<ResponseBody> getUrlData(@Header("If-Modified-Since") @NotNull String modifiedSince, @Url @NotNull String url2);
}
