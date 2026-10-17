package com.revolut.feature.retail.legacy.login.impl.network;

import efm.d0;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import yab.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/impl/network/AuthService;", "", "", "phone", "", "headers", "Lefm/d0;", "Lyab/a;", "requestSMSWithAuth", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "feature_retail_legacy_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AuthService {
    @Headers({"CUSTOM_APP_AUTH_NAME: true"})
    @GET("verification-codes/{phone}")
    @NotNull
    d0<a> requestSMSWithAuth(@Path("phone") String phone, @HeaderMap @NotNull Map<String, String> headers);
}
