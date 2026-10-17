package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkfj/y3;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "suspensionDate", "b", "d", "terminationDate", "Lkfj/z3;", "Lkfj/z3;", "()Lkfj/z3;", "refund", "Lkfj/g4;", "Lkfj/g4;", "()Lkfj/g4;", "postCancellationBreakdown", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("suspensionDate")
    private final Long suspensionDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminationDate")
    private final Long terminationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("refund")
    private final z3 refund;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("postCancellationBreakdown")
    @NotNull
    private final g4 postCancellationBreakdown;

    public y3(Long l2, Long l3, z3 z3Var, g4 postCancellationBreakdown) {
        Intrinsics.checkNotNullParameter(postCancellationBreakdown, "postCancellationBreakdown");
        this.suspensionDate = l2;
        this.terminationDate = l3;
        this.refund = z3Var;
        this.postCancellationBreakdown = postCancellationBreakdown;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g4 getPostCancellationBreakdown() {
        return this.postCancellationBreakdown;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final z3 getRefund() {
        return this.refund;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getSuspensionDate() {
        return this.suspensionDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getTerminationDate() {
        return this.terminationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.suspensionDate, y3Var.suspensionDate) && Intrinsics.f(this.terminationDate, y3Var.terminationDate) && Intrinsics.f(this.refund, y3Var.refund) && Intrinsics.f(this.postCancellationBreakdown, y3Var.postCancellationBreakdown);
    }

    public final int hashCode() {
        Long l2 = this.suspensionDate;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.terminationDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        z3 z3Var = this.refund;
        return this.postCancellationBreakdown.hashCode() + ((iHashCode2 + (z3Var != null ? z3Var.hashCode() : 0)) * 31);
    }
}
