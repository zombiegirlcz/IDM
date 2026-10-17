package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lk55/n;", "", "", "toString", "()Ljava/lang/String;", "Lk55/m;", "a", "Lk55/m;", "()Lk55/m;", "overdueInfo", "b", "terminationInfo", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("overdue")
    private final m overdueInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("termination")
    private final m terminationInfo;

    public n(m mVar, m mVar2) {
        this.overdueInfo = mVar;
        this.terminationInfo = mVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getOverdueInfo() {
        return this.overdueInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getTerminationInfo() {
        return this.terminationInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.overdueInfo, nVar.overdueInfo) && Intrinsics.f(this.terminationInfo, nVar.terminationInfo);
    }

    public final int hashCode() {
        m mVar = this.overdueInfo;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        m mVar2 = this.terminationInfo;
        return iHashCode + (mVar2 != null ? mVar2.hashCode() : 0);
    }
}
