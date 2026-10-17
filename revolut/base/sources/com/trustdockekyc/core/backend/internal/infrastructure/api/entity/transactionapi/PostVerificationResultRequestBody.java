package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import ch.qos.logback.core.CoreConstants;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostVerificationResultResponse;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultRequestBody;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultStatus;", "status", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultReason;", "reason", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultStatus;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultReason;)V", "copy", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultStatus;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultResponse$VerificationResultReason;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostVerificationResultRequestBody;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostVerificationResultRequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostVerificationResultResponse.VerificationResultStatus f107393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PostVerificationResultResponse.VerificationResultReason f107394b;

    public PostVerificationResultRequestBody(@i(name = "status") @NotNull PostVerificationResultResponse.VerificationResultStatus status, @i(name = "reason") PostVerificationResultResponse.VerificationResultReason verificationResultReason) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f107393a = status;
        this.f107394b = verificationResultReason;
    }

    @NotNull
    public final PostVerificationResultRequestBody copy(@i(name = "status") @NotNull PostVerificationResultResponse.VerificationResultStatus status, @i(name = "reason") PostVerificationResultResponse.VerificationResultReason reason) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new PostVerificationResultRequestBody(status, reason);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostVerificationResultRequestBody)) {
            return false;
        }
        PostVerificationResultRequestBody postVerificationResultRequestBody = (PostVerificationResultRequestBody) obj2;
        return this.f107393a == postVerificationResultRequestBody.f107393a && this.f107394b == postVerificationResultRequestBody.f107394b;
    }

    public final int hashCode() {
        int iHashCode = this.f107393a.hashCode() * 31;
        PostVerificationResultResponse.VerificationResultReason verificationResultReason = this.f107394b;
        return iHashCode + (verificationResultReason == null ? 0 : verificationResultReason.hashCode());
    }

    public final String toString() {
        return "PostVerificationResultRequestBody(status=" + this.f107393a + ", reason=" + this.f107394b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ PostVerificationResultRequestBody(PostVerificationResultResponse.VerificationResultStatus verificationResultStatus, PostVerificationResultResponse.VerificationResultReason verificationResultReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(verificationResultStatus, (i & 2) != 0 ? null : verificationResultReason);
    }
}
