package com.revolut.feature_cpg.impl.network;

import bxh.d;
import dxh.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature_cpg/impl/network/CardPaymentsGatewayService;", "", "", "token", "userAgent", "Lefm/d0;", "Ldxh/b;", "getStatus", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lbxh/d;", "request", "Lefm/b;", "requestTopup", "(Ljava/lang/String;Lbxh/d;Ljava/lang/String;)Lefm/b;", "feature_cpg_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardPaymentsGatewayService {
    @GET("public/payments/{token}")
    @NotNull
    d0<b> getStatus(@Path("token") @NotNull String token, @Header("User-Agent") String userAgent);

    @POST("public/payments/{token}")
    @NotNull
    efm.b requestTopup(@Path("token") @NotNull String token, @Body @NotNull d request, @Header("User-Agent") String userAgent);
}
