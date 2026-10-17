package o04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lo04/p;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getAmountRequested", "()J", "amountRequested", "", "b", "Ljava/lang/Integer;", "getStatementDueDay", "()Ljava/lang/Integer;", "statementDueDay", "Lo04/o;", "c", "Lo04/o;", "getPlanSelection", "()Lo04/o;", "planSelection", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountRequested")
    private final long amountRequested;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementDueDay")
    private final Integer statementDueDay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("planSelection")
    private final o planSelection;

    public p(long j2, Integer num, o oVar) {
        this.amountRequested = j2;
        this.statementDueDay = num;
        this.planSelection = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.amountRequested == pVar.amountRequested && Intrinsics.f(this.statementDueDay, pVar.statementDueDay) && Intrinsics.f(this.planSelection, pVar.planSelection);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.amountRequested) * 31;
        Integer num = this.statementDueDay;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        o oVar = this.planSelection;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }
}
