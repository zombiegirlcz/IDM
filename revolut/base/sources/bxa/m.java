package bxa;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lbxa/m;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "totalSteps", "completedSteps", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalSteps")
    private final int totalSteps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedSteps")
    private final int completedSteps;

    public m(int i, int i2) {
        this.totalSteps = i;
        this.completedSteps = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCompletedSteps() {
        return this.completedSteps;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.totalSteps == mVar.totalSteps && this.completedSteps == mVar.completedSteps;
    }

    public final int hashCode() {
        return Integer.hashCode(this.completedSteps) + (Integer.hashCode(this.totalSteps) * 31);
    }
}
