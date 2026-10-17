package nwj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lnwj/h0;", "Lnwj/f1;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "supportsResubmission", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isVerificationRequired", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportsResubmission")
    private final boolean supportsResubmission;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isVerificationRequired")
    private final Boolean isVerificationRequired;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getSupportsResubmission() {
        return this.supportsResubmission;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getIsVerificationRequired() {
        return this.isVerificationRequired;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.supportsResubmission == h0Var.supportsResubmission && Intrinsics.f(this.isVerificationRequired, h0Var.isVerificationRequired);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.supportsResubmission) * 31;
        Boolean bool = this.isVerificationRequired;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
