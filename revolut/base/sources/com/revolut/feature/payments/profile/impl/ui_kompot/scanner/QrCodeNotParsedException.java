package com.revolut.feature.payments.profile.impl.ui_kompot.scanner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/QrCodeNotParsedException;", "", "", "toString", "()Ljava/lang/String;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrCodeNotParsedException extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f79654a;

    public QrCodeNotParsedException(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f79654a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof QrCodeNotParsedException) && Intrinsics.f(this.f79654a, ((QrCodeNotParsedException) obj2).f79654a);
    }

    public final int hashCode() {
        return this.f79654a.hashCode();
    }
}
