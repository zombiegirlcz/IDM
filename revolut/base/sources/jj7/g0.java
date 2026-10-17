package jj7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0012\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\f\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u0006\u0010\"¨\u0006$"}, d2 = {"Ljj7/g0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "f", "()J", "reimbursementPercentage", "Ljj7/h0;", "b", "Ljj7/h0;", "e", "()Ljj7/h0;", "limits", "Ljj7/y;", "c", "Ljj7/y;", "d", "()Ljj7/y;", "excessPayable", "", "Ljj7/a;", "Ljava/util/List;", "()Ljava/util/List;", "eligibleCancellationReasons", "Ljj7/x;", "documents", "g", "remarks", "Ljj7/q;", "Ljj7/q;", "()Ljj7/q;", "claimFlow", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("reimbursementPercentage")
    private final long reimbursementPercentage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("limits")
    @NotNull
    private final h0 limits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("excessPayable")
    @NotNull
    private final y excessPayable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("eligibleCancellationReasons")
    @NotNull
    private final List<a> eligibleCancellationReasons;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<x> documents;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("remarks")
    @NotNull
    private final List<String> remarks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("claimFlow")
    @NotNull
    private final q claimFlow;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q getClaimFlow() {
        return this.claimFlow;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getEligibleCancellationReasons() {
        return this.eligibleCancellationReasons;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final y getExcessPayable() {
        return this.excessPayable;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getLimits() {
        return this.limits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.reimbursementPercentage == g0Var.reimbursementPercentage && Intrinsics.f(this.limits, g0Var.limits) && Intrinsics.f(this.excessPayable, g0Var.excessPayable) && Intrinsics.f(this.eligibleCancellationReasons, g0Var.eligibleCancellationReasons) && Intrinsics.f(this.documents, g0Var.documents) && Intrinsics.f(this.remarks, g0Var.remarks) && Intrinsics.f(this.claimFlow, g0Var.claimFlow);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getReimbursementPercentage() {
        return this.reimbursementPercentage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getRemarks() {
        return this.remarks;
    }

    public final int hashCode() {
        return this.claimFlow.hashCode() + p.a.d(p.a.d(p.a.d((this.excessPayable.hashCode() + ((this.limits.hashCode() + (Long.hashCode(this.reimbursementPercentage) * 31)) * 31)) * 31, 31, this.eligibleCancellationReasons), 31, this.documents), 31, this.remarks);
    }
}
