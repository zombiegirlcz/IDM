package bj1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbj1/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "c", "()Z", "verified", "Lno3/b;", "b", "Lno3/b;", "()Lno3/b;", "suggestedAddress", "Ljava/lang/String;", "failureReason", "feature_address_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("verified")
    private final boolean verified;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggestedCorrection")
    private final no3.b suggestedAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("failureReason")
    private final String failureReason;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final no3.b getSuggestedAddress() {
        return this.suggestedAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getVerified() {
        return this.verified;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.verified == bVar.verified && Intrinsics.f(this.suggestedAddress, bVar.suggestedAddress) && Intrinsics.f(this.failureReason, bVar.failureReason);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.verified) * 31;
        no3.b bVar = this.suggestedAddress;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.failureReason;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
