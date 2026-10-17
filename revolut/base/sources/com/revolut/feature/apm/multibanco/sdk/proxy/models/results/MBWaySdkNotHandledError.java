package com.revolut.feature.apm.multibanco.sdk.proxy.models.results;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkNotHandledError;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkError;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MBWaySdkNotHandledError extends MBWaySdkError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f62681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62682c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBWaySdkNotHandledError(String operation, Throwable th10) {
        super(0);
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f62680a = operation;
        this.f62681b = th10;
        this.f62682c = "1000";
        this.d = "NHE";
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF62683a() {
        return this.f62680a;
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF62684b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MBWaySdkNotHandledError)) {
            return false;
        }
        MBWaySdkNotHandledError mBWaySdkNotHandledError = (MBWaySdkNotHandledError) obj2;
        return Intrinsics.f(this.f62680a, mBWaySdkNotHandledError.f62680a) && Intrinsics.f(this.f62681b, mBWaySdkNotHandledError.f62681b);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f62681b;
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public final String getF62691c() {
        return this.f62682c;
    }

    public final int hashCode() {
        int iHashCode = this.f62680a.hashCode() * 31;
        Throwable th10 = this.f62681b;
        return iHashCode + (th10 == null ? 0 : th10.hashCode());
    }
}
