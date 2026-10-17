package com.revolut.feature.apm.multibanco.sdk.proxy.models.results;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkError;", "", "<init>", "()V", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkGenericError;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkNoResponse;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkNotHandledError;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkRegistrationNeeded;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkSuspended;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkUnavailable;", "feature_apm_multibanco_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MBWaySdkError extends Throwable {
    public /* synthetic */ MBWaySdkError(int i) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract String getCode();

    private MBWaySdkError() {
    }
}
