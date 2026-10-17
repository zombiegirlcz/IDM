package com.revolut.feature.revolutpay.impl.domain.models.oauth;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u7c.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/oauth/OAuthSetupException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OAuthSetupException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f84444a;

    public OAuthSetupException(c errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f84444a = errorCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OAuthSetupException) && this.f84444a == ((OAuthSetupException) obj2).f84444a;
    }

    public final int hashCode() {
        return this.f84444a.hashCode();
    }
}
