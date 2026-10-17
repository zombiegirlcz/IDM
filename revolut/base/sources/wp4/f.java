package wp4;

import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepaymentSource f299043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f299044b;

    public f(RepaymentSource repaymentSource, boolean z) {
        this.f299043a = repaymentSource;
        this.f299044b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f299043a, fVar.f299043a) && this.f299044b == fVar.f299044b;
    }

    public final int hashCode() {
        RepaymentSource repaymentSource = this.f299043a;
        return Boolean.hashCode(this.f299044b) + ((repaymentSource == null ? 0 : repaymentSource.hashCode()) * 31);
    }
}
