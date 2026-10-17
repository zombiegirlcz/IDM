package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.common;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/common/ErrorResponse;", "", "", "message", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/common/ErrorResponseDetailEntity;", "detail", "<init>", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/common/ErrorResponseDetailEntity;)V", "copy", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/common/ErrorResponseDetailEntity;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/common/ErrorResponse;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ErrorResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ErrorResponseDetailEntity f107378b;

    public ErrorResponse(@i(name = "message") @NotNull String message, @i(name = "detail") ErrorResponseDetailEntity errorResponseDetailEntity) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f107377a = message;
        this.f107378b = errorResponseDetailEntity;
    }

    @NotNull
    public final ErrorResponse copy(@i(name = "message") @NotNull String message, @i(name = "detail") ErrorResponseDetailEntity detail) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ErrorResponse(message, detail);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj2;
        return Intrinsics.f(this.f107377a, errorResponse.f107377a) && Intrinsics.f(this.f107378b, errorResponse.f107378b);
    }

    public final int hashCode() {
        int iHashCode = this.f107377a.hashCode() * 31;
        ErrorResponseDetailEntity errorResponseDetailEntity = this.f107378b;
        return iHashCode + (errorResponseDetailEntity == null ? 0 : errorResponseDetailEntity.f107379a.hashCode());
    }

    public final String toString() {
        return "ErrorResponse(message=" + this.f107377a + ", detail=" + this.f107378b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
