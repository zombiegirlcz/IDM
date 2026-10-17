package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkfj/p2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "authorizationId", "b", "f", "state", "", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expirationDate", "d", "e", "nextResendAvailableAt", "", "I", "()I", "failedAttempts", "Lkfj/q2;", "Lkfj/q2;", "()Lkfj/q2;", "failure", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorizationId")
    @NotNull
    private final String authorizationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nextResendAvailableAt")
    private final Long nextResendAvailableAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("failedAttempts")
    private final int failedAttempts;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("failure")
    private final q2 failure;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthorizationId() {
        return this.authorizationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFailedAttempts() {
        return this.failedAttempts;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q2 getFailure() {
        return this.failure;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getNextResendAvailableAt() {
        return this.nextResendAvailableAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.authorizationId, p2Var.authorizationId) && Intrinsics.f(this.state, p2Var.state) && Intrinsics.f(this.expirationDate, p2Var.expirationDate) && Intrinsics.f(this.nextResendAvailableAt, p2Var.nextResendAvailableAt) && this.failedAttempts == p2Var.failedAttempts && Intrinsics.f(this.failure, p2Var.failure);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iHashCode = this.authorizationId.hashCode() * 31;
        String str = this.state;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.nextResendAvailableAt;
        int iB = j6.a.b(this.failedAttempts, (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        q2 q2Var = this.failure;
        return iB + (q2Var != null ? q2Var.hashCode() : 0);
    }
}
