package bzc;

import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubmissionEvidence f19965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xyc.e f19966c;

    public n(String transactionId, SubmissionEvidence submissionEvidence, xyc.e flowReviewState) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(flowReviewState, "flowReviewState");
        this.f19964a = transactionId;
        this.f19965b = submissionEvidence;
        this.f19966c = flowReviewState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f19964a, nVar.f19964a) && Intrinsics.f(this.f19965b, nVar.f19965b) && this.f19966c == nVar.f19966c;
    }

    public final int hashCode() {
        int iHashCode = this.f19964a.hashCode() * 31;
        SubmissionEvidence submissionEvidence = this.f19965b;
        return this.f19966c.hashCode() + ((iHashCode + (submissionEvidence == null ? 0 : submissionEvidence.hashCode())) * 31);
    }
}
