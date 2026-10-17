package ik4;

import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScheduledAmountType f161891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RepaymentSource f161892b;

    public b(CreditScheduledAmountType amountType, RepaymentSource repaymentSource) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        this.f161891a = amountType;
        this.f161892b = repaymentSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f161891a, bVar.f161891a) && Intrinsics.f(this.f161892b, bVar.f161892b);
    }

    public final int hashCode() {
        int iHashCode = this.f161891a.hashCode() * 31;
        RepaymentSource repaymentSource = this.f161892b;
        return iHashCode + (repaymentSource == null ? 0 : repaymentSource.hashCode());
    }
}
