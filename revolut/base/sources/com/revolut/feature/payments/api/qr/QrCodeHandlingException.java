package com.revolut.feature.payments.api.qr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xo9.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/api/qr/QrCodeHandlingException;", "", "", "toString", "()Ljava/lang/String;", "xo9/e", "retail_feature_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrCodeHandlingException extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f79172a;

    public QrCodeHandlingException(e reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f79172a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof QrCodeHandlingException) && Intrinsics.f(this.f79172a, ((QrCodeHandlingException) obj2).f79172a);
    }

    public final int hashCode() {
        return this.f79172a.hashCode();
    }
}
