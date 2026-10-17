package com.revolut.feature.check_topup.impl.network;

import ag3.a;
import efm.d0;
import kotlin.Metadata;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001JI\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\nH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/check_topup/impl/network/CheckTopUpService;", "", "", "amount", "Lokhttp3/RequestBody;", "currency", "Lokhttp3/MultipartBody$Part;", "frontImage", "backImage", "micr", "Lefm/d0;", "Lag3/a;", "submitScanDetails", "(JLokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;)Lefm/d0;", "getLimits", "()Lefm/d0;", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckTopUpService {
    @GET("/cheque/limits")
    @NotNull
    d0<Object> getLimits();

    @POST("/cheque")
    @NotNull
    @Multipart
    d0<a> submitScanDetails(@Part("amount") long amount, @NotNull @Part("currency") RequestBody currency, @NotNull @Part MultipartBody$Part frontImage, @NotNull @Part MultipartBody$Part backImage, @Part("micr") RequestBody micr);
}
