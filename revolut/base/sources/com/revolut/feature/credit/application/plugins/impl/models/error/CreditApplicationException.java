package com.revolut.feature.credit.application.plugins.impl.models.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/models/error/CreditApplicationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f66910a;

    public CreditApplicationException(Throwable original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f66910a = original;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CreditApplicationException) && Intrinsics.f(this.f66910a, ((CreditApplicationException) obj2).f66910a);
    }

    public final int hashCode() {
        return this.f66910a.hashCode();
    }
}
