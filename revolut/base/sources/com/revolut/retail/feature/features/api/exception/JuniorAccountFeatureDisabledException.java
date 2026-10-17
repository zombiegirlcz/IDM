package com.revolut.retail.feature.features.api.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/features/api/exception/JuniorAccountFeatureDisabledException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "toString", "()Ljava/lang/String;", "feature_retail_features_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAccountFeatureDisabledException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101490a;

    public JuniorAccountFeatureDisabledException() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof JuniorAccountFeatureDisabledException) && Intrinsics.f(this.f101490a, ((JuniorAccountFeatureDisabledException) obj2).f101490a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f101490a;
    }

    public final int hashCode() {
        return this.f101490a.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorAccountFeatureDisabledException(int i) {
        super("Junior accounts feature not enabled");
        Intrinsics.checkNotNullParameter("Junior accounts feature not enabled", "message");
        this.f101490a = "Junior accounts feature not enabled";
    }
}
