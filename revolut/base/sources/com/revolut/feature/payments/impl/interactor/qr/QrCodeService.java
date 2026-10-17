package com.revolut.feature.payments.impl.interactor.qr;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import xt9.b;
import xt9.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/impl/interactor/qr/QrCodeService;", "", "Lxt9/b;", "body", "Lefm/d0;", "getQrCode", "(Lxt9/b;)Lefm/d0;", "Lretrofit2/Response;", "Lxt9/c;", "getQrCodeV2", "retail_feature_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface QrCodeService {
    @POST("qr-code")
    @NotNull
    d0<Object> getQrCode(@Body @NotNull b body);

    @POST("/v2/qr-code")
    @NotNull
    d0<Response<c>> getQrCodeV2(@Body @NotNull b body);
}
