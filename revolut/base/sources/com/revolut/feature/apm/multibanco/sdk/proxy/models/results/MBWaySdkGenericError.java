package com.revolut.feature.apm.multibanco.sdk.proxy.models.results;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkGenericError;", "Lcom/revolut/feature/apm/multibanco/sdk/proxy/models/results/MBWaySdkError;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MBWaySdkGenericError extends MBWaySdkError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBWaySdkGenericError(String operation, String code, String reason) {
        super(0);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f62674a = operation;
        this.f62675b = code;
        this.f62676c = reason;
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF62674a() {
        return this.f62674a;
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF62676c() {
        return this.f62676c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MBWaySdkGenericError)) {
            return false;
        }
        MBWaySdkGenericError mBWaySdkGenericError = (MBWaySdkGenericError) obj2;
        return Intrinsics.f(this.f62674a, mBWaySdkGenericError.f62674a) && Intrinsics.f(this.f62675b, mBWaySdkGenericError.f62675b) && Intrinsics.f(this.f62676c, mBWaySdkGenericError.f62676c);
    }

    @Override // com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public final String getF62675b() {
        return this.f62675b;
    }

    public final int hashCode() {
        return this.f62676c.hashCode() + a.c(this.f62674a.hashCode() * 31, 31, this.f62675b);
    }
}
