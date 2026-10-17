package com.revolut.feature.apm.multibanco.sdk.proxy.models.results;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkRegistrationNeeded;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkError;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MBWaySdkRegistrationNeeded extends MBWaySdkError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBWaySdkRegistrationNeeded(String operation, String reason) {
        super(0);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f62683a = operation;
        this.f62684b = reason;
        this.f62685c = "SDK002";
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF62683a() {
        return this.f62683a;
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getD() {
        return this.f62684b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MBWaySdkRegistrationNeeded)) {
            return false;
        }
        MBWaySdkRegistrationNeeded mBWaySdkRegistrationNeeded = (MBWaySdkRegistrationNeeded) obj2;
        return Intrinsics.f(this.f62683a, mBWaySdkRegistrationNeeded.f62683a) && Intrinsics.f(this.f62684b, mBWaySdkRegistrationNeeded.f62684b);
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public final String getF62691c() {
        return this.f62685c;
    }

    public final int hashCode() {
        return this.f62684b.hashCode() + (this.f62683a.hashCode() * 31);
    }
}
