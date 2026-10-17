package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageRequestBody;", "", "", "packageId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageRequestBody;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostPackageRequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107388a;

    public PostPackageRequestBody(@i(name = "package_id") @NotNull String packageId) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f107388a = packageId;
    }

    @NotNull
    public final PostPackageRequestBody copy(@i(name = "package_id") @NotNull String packageId) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        return new PostPackageRequestBody(packageId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PostPackageRequestBody) && Intrinsics.f(this.f107388a, ((PostPackageRequestBody) obj2).f107388a);
    }

    public final int hashCode() {
        return this.f107388a.hashCode();
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("PostPackageRequestBody(packageId="), this.f107388a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
