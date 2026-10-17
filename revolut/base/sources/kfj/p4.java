package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkfj/p4;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/q3;", "a", "Lkfj/q3;", "b", "()Lkfj/q3;", "subscription", "Lkfj/m4;", "Lkfj/m4;", "()Lkfj/m4;", "refund", "Lkfj/i3;", "c", "Lkfj/i3;", "()Lkfj/i3;", "summary", "Lkfj/z4;", "d", "Lkfj/z4;", "()Lkfj/z4;", "withdrawal", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscription")
    @NotNull
    private final q3 subscription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refund")
    private final m4 refund;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("summary")
    private final i3 summary;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("withdrawal")
    private final z4 withdrawal;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m4 getRefund() {
        return this.refund;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q3 getSubscription() {
        return this.subscription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i3 getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final z4 getWithdrawal() {
        return this.withdrawal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj2;
        return Intrinsics.f(this.subscription, p4Var.subscription) && Intrinsics.f(this.refund, p4Var.refund) && Intrinsics.f(this.summary, p4Var.summary) && Intrinsics.f(this.withdrawal, p4Var.withdrawal);
    }

    public final int hashCode() {
        int iHashCode = this.subscription.hashCode() * 31;
        m4 m4Var = this.refund;
        int iHashCode2 = (iHashCode + (m4Var == null ? 0 : m4Var.hashCode())) * 31;
        i3 i3Var = this.summary;
        int iHashCode3 = (iHashCode2 + (i3Var == null ? 0 : i3Var.hashCode())) * 31;
        z4 z4Var = this.withdrawal;
        return iHashCode3 + (z4Var != null ? z4Var.hashCode() : 0);
    }
}
