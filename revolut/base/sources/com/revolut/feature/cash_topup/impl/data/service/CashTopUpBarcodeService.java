package com.revolut.feature.cash_topup.impl.data.service;

import efm.b;
import efm.d0;
import hb3.h;
import hb3.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u0006H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/data/service/CashTopUpBarcodeService;", "", "Lhb3/h;", "requestBody", "Lwj0/b;", "idempotencyTag", "Lefm/d0;", "Lhb3/i;", "generateBarcode", "(Lhb3/h;Lwj0/b;)Lefm/d0;", "", "id", "Lefm/b;", "deleteBarcode", "(Ljava/lang/String;)Lefm/b;", "updateBarcode", "(Ljava/lang/String;Lhb3/h;)Lefm/d0;", "Lretrofit2/Response;", "getPendingCashDeposit", "()Lefm/d0;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CashTopUpBarcodeService {
    @DELETE("/topup/by-token/barzahlen/{id}")
    @NotNull
    b deleteBarcode(@Path("id") @NotNull String id10);

    @POST("/topup/by-token/barzahlen")
    @NotNull
    d0<i> generateBarcode(@Body @NotNull h requestBody, @Tag @NotNull wj0.b idempotencyTag);

    @GET("/topup/by-token/barzahlen/current")
    @NotNull
    d0<Response<i>> getPendingCashDeposit();

    @PATCH("/topup/by-token/barzahlen/{id}")
    @NotNull
    d0<i> updateBarcode(@Path("id") @NotNull String id10, @Body @NotNull h requestBody);
}
