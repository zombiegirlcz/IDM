package r1c;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lr1c/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "state", "Ljo3/a;", "c", "Ljo3/a;", "d", "()Ljo3/a;", "reversalAmount", "refundAmount", "", "J", "()J", "createdDate", "f", "updatedDate", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reversalAmount")
    @NotNull
    private final jo3.a reversalAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("refundAmount")
    @NotNull
    private final jo3.a refundAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getRefundAmount() {
        return this.refundAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getReversalAmount() {
        return this.reversalAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.state, gVar.state) && Intrinsics.f(this.reversalAmount, gVar.reversalAmount) && Intrinsics.f(this.refundAmount, gVar.refundAmount) && this.createdDate == gVar.createdDate && this.updatedDate == gVar.updatedDate;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    public final int hashCode() {
        return Long.hashCode(this.updatedDate) + a0.d.c(v7.j(this.refundAmount, v7.j(this.reversalAmount, p.a.c(this.id.hashCode() * 31, 31, this.state), 31), 31), 31, this.createdDate);
    }
}
