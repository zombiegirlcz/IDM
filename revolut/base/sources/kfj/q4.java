package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\n\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkfj/q4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "state", "", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "refundedDate", "Lkfj/m3;", "Lkfj/m3;", "()Lkfj/m3;", "action", "Lkfj/n4;", "Lkfj/n4;", "()Lkfj/n4;", "ineligibilityDetails", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundedDate")
    private final Long refundedDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final m3 action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ineligibilityDetails")
    private final n4 ineligibilityDetails;

    public q4(String state, Long l2, m3 m3Var, n4 n4Var) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.refundedDate = l2;
        this.action = m3Var;
        this.ineligibilityDetails = n4Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m3 getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n4 getIneligibilityDetails() {
        return this.ineligibilityDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getRefundedDate() {
        return this.refundedDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return Intrinsics.f(this.state, q4Var.state) && Intrinsics.f(this.refundedDate, q4Var.refundedDate) && Intrinsics.f(this.action, q4Var.action) && Intrinsics.f(this.ineligibilityDetails, q4Var.ineligibilityDetails);
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        Long l2 = this.refundedDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        m3 m3Var = this.action;
        int iHashCode3 = (iHashCode2 + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        n4 n4Var = this.ineligibilityDetails;
        return iHashCode3 + (n4Var != null ? n4Var.hashCode() : 0);
    }
}
