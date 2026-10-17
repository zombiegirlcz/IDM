package jk4;

import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f175073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RepaymentSource f175074b;

    public h(dj0.d amount, RepaymentSource repaymentSource) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f175073a = amount;
        this.f175074b = repaymentSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f175073a, hVar.f175073a) && Intrinsics.f(this.f175074b, hVar.f175074b);
    }

    public final int hashCode() {
        int iHashCode = this.f175073a.hashCode() * 31;
        RepaymentSource repaymentSource = this.f175074b;
        return iHashCode + (repaymentSource == null ? 0 : repaymentSource.hashCode());
    }
}
