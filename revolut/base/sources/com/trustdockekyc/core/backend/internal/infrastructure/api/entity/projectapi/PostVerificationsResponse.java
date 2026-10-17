package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.projectapi;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/projectapi/PostVerificationsResponse;", "", "", "id", "acceptedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/projectapi/PostVerificationsResponse;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostVerificationsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107383b;

    public PostVerificationsResponse(@i(name = "id") @NotNull String id10, @i(name = "accepted_at") @NotNull String acceptedAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(acceptedAt, "acceptedAt");
        this.f107382a = id10;
        this.f107383b = acceptedAt;
    }

    @NotNull
    public final PostVerificationsResponse copy(@i(name = "id") @NotNull String id10, @i(name = "accepted_at") @NotNull String acceptedAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(acceptedAt, "acceptedAt");
        return new PostVerificationsResponse(id10, acceptedAt);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostVerificationsResponse)) {
            return false;
        }
        PostVerificationsResponse postVerificationsResponse = (PostVerificationsResponse) obj2;
        return Intrinsics.f(this.f107382a, postVerificationsResponse.f107382a) && Intrinsics.f(this.f107383b, postVerificationsResponse.f107383b);
    }

    public final int hashCode() {
        return this.f107383b.hashCode() + (this.f107382a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("PostVerificationsResponse(id=");
        sb6.append(this.f107382a);
        sb6.append(", acceptedAt=");
        return a.u(sb6, this.f107383b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
