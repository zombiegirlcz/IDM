package nwj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lnwj/d1;", "Lnwj/f1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "waitingPeriod", "", "Z", "()Z", "supportsResubmission", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("waitingPeriod")
    private final String waitingPeriod = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportsResubmission")
    private final boolean supportsResubmission = false;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getSupportsResubmission() {
        return this.supportsResubmission;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWaitingPeriod() {
        return this.waitingPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.waitingPeriod, d1Var.waitingPeriod) && this.supportsResubmission == d1Var.supportsResubmission;
    }

    public final int hashCode() {
        String str = this.waitingPeriod;
        return Boolean.hashCode(this.supportsResubmission) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
