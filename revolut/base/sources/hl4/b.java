package hl4;

import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f152975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f152976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f152977c;
    public final RepaymentDeferral d;
    public final PayoffBreakdown e;

    public b(e journeyType, dj0.d repaymentAmount, g repaymentStrategy, RepaymentDeferral repaymentDeferral, PayoffBreakdown payoffBreakdown) {
        Intrinsics.checkNotNullParameter(journeyType, "journeyType");
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(repaymentStrategy, "repaymentStrategy");
        this.f152975a = journeyType;
        this.f152976b = repaymentAmount;
        this.f152977c = repaymentStrategy;
        this.d = repaymentDeferral;
        this.e = payoffBreakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f152975a == bVar.f152975a && Intrinsics.f(this.f152976b, bVar.f152976b) && this.f152977c == bVar.f152977c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f152977c.hashCode() + v7.c(this.f152975a.hashCode() * 31, 31, this.f152976b)) * 31;
        RepaymentDeferral repaymentDeferral = this.d;
        int iHashCode2 = (iHashCode + (repaymentDeferral == null ? 0 : repaymentDeferral.hashCode())) * 31;
        PayoffBreakdown payoffBreakdown = this.e;
        return iHashCode2 + (payoffBreakdown != null ? payoffBreakdown.hashCode() : 0);
    }
}
