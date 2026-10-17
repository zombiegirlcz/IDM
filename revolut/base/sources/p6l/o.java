package p6l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Lp6l/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "status", "", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "rejectionReasons", "estimatedReviewDate", "approvedDate", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("rejectionReasons")
    private final List<String> rejectionReasons;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedReviewDate")
    private final String estimatedReviewDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("approvedDate")
    private final String approvedDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApprovedDate() {
        return this.approvedDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEstimatedReviewDate() {
        return this.estimatedReviewDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getRejectionReasons() {
        return this.rejectionReasons;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.status, oVar.status) && Intrinsics.f(this.rejectionReasons, oVar.rejectionReasons) && Intrinsics.f(this.estimatedReviewDate, oVar.estimatedReviewDate) && Intrinsics.f(this.approvedDate, oVar.approvedDate);
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        List<String> list = this.rejectionReasons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.estimatedReviewDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.approvedDate;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
