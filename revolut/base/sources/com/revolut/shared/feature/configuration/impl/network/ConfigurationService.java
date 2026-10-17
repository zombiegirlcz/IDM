package com.revolut.shared.feature.configuration.impl.network;

import efm.d0;
import j7l.d;
import j7l.m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\tJ}\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\r\u001a\u00020\n2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/configuration/impl/network/ConfigurationService;", "", "", "modifiedSince", "Lefm/d0;", "Lj7l/d;", "getCommonConfiguration", "(J)Lefm/d0;", "getUserConfiguration", "()Lefm/d0;", "", "targetCurrency", "recipientCountry", "transferType", "userCode", "beneficiaryId", "amount", "transferAmount", "fromBalanceType", "toBalanceType", "Lj7l/m;", "getTransferReasonConfig", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_shared_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConfigurationService {
    @Headers({"X-Force-App-Auth: true"})
    @GET("config/common")
    @NotNull
    d0<d> getCommonConfiguration(@Header("If-Modified-Since") long modifiedSince);

    @GET("/config/user/transfer-reasons")
    @NotNull
    d0<m> getTransferReasonConfig(@NotNull @Query("transferCurrency") String targetCurrency, @Query("recipientCountry") String recipientCountry, @NotNull @Query("transferType") String transferType, @Query("userCode") String userCode, @Query("beneficiaryId") String beneficiaryId, @Query("amount") Long amount, @Query("transferAmount") Long transferAmount, @Query("fromPocketType") String fromBalanceType, @Query("toPocketType") String toBalanceType);

    @GET("config/user")
    @NotNull
    d0<d> getUserConfiguration();
}
