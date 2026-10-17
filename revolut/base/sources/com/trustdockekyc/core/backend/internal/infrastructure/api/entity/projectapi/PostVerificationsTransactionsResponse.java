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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/projectapi/PostVerificationsTransactionsResponse;", "", "", "token", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/projectapi/PostVerificationsTransactionsResponse;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostVerificationsTransactionsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107384a;

    public PostVerificationsTransactionsResponse(@i(name = "token") @NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f107384a = token;
    }

    @NotNull
    public final PostVerificationsTransactionsResponse copy(@i(name = "token") @NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new PostVerificationsTransactionsResponse(token);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PostVerificationsTransactionsResponse) && Intrinsics.f(this.f107384a, ((PostVerificationsTransactionsResponse) obj2).f107384a);
    }

    public final int hashCode() {
        return this.f107384a.hashCode();
    }

    public final String toString() {
        return a.u(new StringBuilder("PostVerificationsTransactionsResponse(token="), this.f107384a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
