package com.revolut.core.network.retrofit;

import efm.d0;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/network/retrofit/RawUrlRequestService;", "", "", "url", "Lefm/d0;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getAuthUrlResponse", "(Ljava/lang/String;)Lefm/d0;", "getUrlResponse", "core_network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RawUrlRequestService {
    @GET
    @NotNull
    d0<Response<ResponseBody>> getAuthUrlResponse(@Url @NotNull String url2);

    @Headers({"X-Force-App-Auth: true"})
    @GET
    @NotNull
    d0<Response<ResponseBody>> getUrlResponse(@Url @NotNull String url2);
}
