package com.revolut.feature.us_send_checks.impl.service;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import m2k.e;
import org.jetbrains.annotations.NotNull;
import qlg.a;
import qlg.b;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJi\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/us_send_checks/impl/service/SendChecksTransferService;", "", "Lqlg/b;", "body", "Lwj0/b;", "idempotencyTag", "Lefm/d0;", "Lqlg/a;", "doTransfer", "(Lqlg/b;Lwj0/b;)Lefm/d0;", "", "beneficiaryId", "sourceCurrency", "targetCurrency", "", "targetAmount", "startTime", "walletId", "chargeBearer", "", "Lm2k/e;", "getTransferAvailableTypes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SendChecksTransferService {
    @POST("cheque-transfer")
    @NotNull
    d0<a> doTransfer(@Body @NotNull b body, @Tag wj0.b idempotencyTag);

    @GET("cheque-transfer/available-types")
    @NotNull
    d0<List<e>> getTransferAvailableTypes(@NotNull @Query("beneficiaryId") String beneficiaryId, @Query("sourceCurrency") String sourceCurrency, @NotNull @Query("currency") String targetCurrency, @Query("amount") long targetAmount, @Query("startTime") Long startTime, @Query("walletId") String walletId, @Query("chargeBearer") String chargeBearer);
}
