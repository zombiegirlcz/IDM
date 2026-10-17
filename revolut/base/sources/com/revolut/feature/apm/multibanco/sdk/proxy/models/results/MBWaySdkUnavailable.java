package com.revolut.feature.apm.multibanco.sdk.proxy.models.results;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkUnavailable;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkError;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MBWaySdkUnavailable extends MBWaySdkError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f62690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62691c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBWaySdkUnavailable(String operation, Exception exc2) {
        super(0);
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f62689a = operation;
        this.f62690b = exc2;
        this.f62691c = "1000";
        this.d = "N/A";
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF62689a() {
        return this.f62689a;
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MBWaySdkUnavailable)) {
            return false;
        }
        MBWaySdkUnavailable mBWaySdkUnavailable = (MBWaySdkUnavailable) obj2;
        return Intrinsics.f(this.f62689a, mBWaySdkUnavailable.f62689a) && Intrinsics.f(this.f62690b, mBWaySdkUnavailable.f62690b);
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public final String getF62691c() {
        return this.f62691c;
    }

    public final int hashCode() {
        int iHashCode = this.f62689a.hashCode() * 31;
        Exception exc2 = this.f62690b;
        return iHashCode + (exc2 == null ? 0 : exc2.hashCode());
    }
}
