package com.revolut.feature.trusted_merchants.impl.data.network;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import zig.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u0017\u0010\u0010¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/data/network/TrustedMerchantsService;", "", "Lefm/d0;", "", "Lzig/a;", "getTrustedMerchants", "()Lefm/d0;", "getMerchantsToReview", "", "merchantId", "getApproveDetails", "(Ljava/lang/String;)Lefm/d0;", "transactionId", "getMerchantByTransactionId", "Lefm/b;", "approveMerchant", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "Lzig/b;", "merchants", "approveMerchants", "(Lzig/b;)Lefm/b;", "disapproveMerchant", "(Ljava/lang/String;)Lefm/b;", "dismissMerchant", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrustedMerchantsService {
    @POST("trusted-merchant/{id}/approve")
    @NotNull
    b approveMerchant(@Path("id") @NotNull String merchantId, @Query("transactionId") String transactionId);

    @POST("trusted-merchant/approve")
    @NotNull
    b approveMerchants(@Body @NotNull zig.b merchants);

    @POST("trusted-merchant/{id}/disapprove")
    @NotNull
    b disapproveMerchant(@Path("id") @NotNull String merchantId);

    @POST("trusted-merchant/{id}/dismiss")
    @NotNull
    b dismissMerchant(@Path("id") @NotNull String merchantId, @Query("transactionId") String transactionId);

    @GET("trusted-merchant/{id}")
    @NotNull
    d0<a> getApproveDetails(@Path("id") @NotNull String merchantId);

    @GET("trusted-merchant")
    @NotNull
    d0<a> getMerchantByTransactionId(@NotNull @Query("transactionId") String transactionId);

    @GET("trusted-merchants/to-review")
    @NotNull
    d0<List<a>> getMerchantsToReview();

    @GET("trusted-merchants/approved")
    @NotNull
    d0<List<a>> getTrustedMerchants();
}
