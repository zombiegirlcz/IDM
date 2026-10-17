package mqc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207953c;

    public d(String payrollSwitchId, String disputeId) {
        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
        Intrinsics.checkNotNullParameter(disputeId, "disputeId");
        this.f207951a = payrollSwitchId;
        this.f207952b = disputeId;
        this.f207953c = a0.d.s("SALARY_DISPUTE_DETAILS_", payrollSwitchId, "_", disputeId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f207951a, dVar.f207951a) && Intrinsics.f(this.f207952b, dVar.f207952b);
    }

    public final int hashCode() {
        return this.f207952b.hashCode() + (this.f207951a.hashCode() * 31);
    }
}
