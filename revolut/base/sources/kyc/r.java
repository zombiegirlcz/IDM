package kyc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000e\u0010\u001fR\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\u001d\u0010$R\u001c\u0010'\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\t\u0010$¨\u0006("}, d2 = {"Lkyc/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "h", "state", "", "Lkyc/m;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "evidences", "Lkyc/n;", "Lkyc/n;", "g", "()Lkyc/n;", "reviewState", "Lkyc/l;", "Lkyc/l;", "()Lkyc/l;", "actionToDoId", "", "f", "Z", "()Z", "canAddSource", "", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "submittedDate", "reviewStartedDate", "approvedDate", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("evidences")
    @NotNull
    private final List<m> evidences;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("reviewState")
    @NotNull
    private final n reviewState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("actionToDo")
    private final l actionToDoId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("canAddSource")
    private final boolean canAddSource;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("submittedDate")
    private final Long submittedDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("reviewStartedDate")
    private final Long reviewStartedDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("approvedDate")
    private final Long approvedDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getActionToDoId() {
        return this.actionToDoId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getApprovedDate() {
        return this.approvedDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanAddSource() {
        return this.canAddSource;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getEvidences() {
        return this.evidences;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.id, rVar.id) && Intrinsics.f(this.state, rVar.state) && Intrinsics.f(this.evidences, rVar.evidences) && Intrinsics.f(this.reviewState, rVar.reviewState) && Intrinsics.f(this.actionToDoId, rVar.actionToDoId) && this.canAddSource == rVar.canAddSource && Intrinsics.f(this.submittedDate, rVar.submittedDate) && Intrinsics.f(this.reviewStartedDate, rVar.reviewStartedDate) && Intrinsics.f(this.approvedDate, rVar.approvedDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getReviewStartedDate() {
        return this.reviewStartedDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getReviewState() {
        return this.reviewState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iHashCode = (this.reviewState.hashCode() + p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.evidences)) * 31;
        l lVar = this.actionToDoId;
        int iC = j6.a.c((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.canAddSource);
        Long l2 = this.submittedDate;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.reviewStartedDate;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.approvedDate;
        return iHashCode3 + (l4 != null ? l4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getSubmittedDate() {
        return this.submittedDate;
    }
}
