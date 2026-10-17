package com.revolut.retail.feature.pcw_auth.impl.network.services;

import aak.a;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pcw_auth/impl/network/services/PcwApplicationService;", "", "", "clientId", "Lefm/d0;", "Laak/a;", "getApplicationStatus", "(Ljava/lang/String;)Lefm/d0;", "feature_credit_pcw_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PcwApplicationService {
    @GET("/credit-open-market/application/current")
    @NotNull
    d0<a> getApplicationStatus(@Header("Client-Id") @NotNull String clientId);
}
