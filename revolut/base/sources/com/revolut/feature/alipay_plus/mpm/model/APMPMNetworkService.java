package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMNetworkService;", "", "performProxy", "", "request", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyRequest;", "callback", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMCallback;", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMProxyResponse;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface APMPMNetworkService {
    void performProxy(@NotNull APMPMProxyRequest request, @NotNull APMPMCallback<APMPMProxyResponse> callback);
}
