package com.revolut.feature.location.impl.data.network.services;

import a49.a;
import a49.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import zj0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/location/impl/data/network/services/SecurityService;", "", "La49/c;", "body", "Lefm/b;", "updateLocationBackground", "(La49/c;)Lefm/b;", "", "transactionId", "La49/a;", "sendTransactionLocation", "(Ljava/lang/String;La49/a;)Lefm/b;", "feature_location_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecurityService {
    @b
    @NotNull
    @Headers({"X-Force-App-Auth: true"})
    @POST("transaction/{transactionId}/location")
    efm.b sendTransactionLocation(@Path("transactionId") @NotNull String transactionId, @Body @NotNull a body);

    @b
    @NotNull
    @Headers({"X-Force-App-Auth: true"})
    @POST("device/location/background")
    efm.b updateLocationBackground(@Body @NotNull c body);
}
