package aq4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f8247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f8248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RepaymentDeferral f8249c;
    public final PayoffBreakdown d;
    public final Data e;

    public e(dj0.d repaymentAmount, Data sourcePocketData, RepaymentDeferral repaymentDeferral, PayoffBreakdown payoffBreakdown, Data countryCode) {
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(sourcePocketData, "sourcePocketData");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f8247a = repaymentAmount;
        this.f8248b = sourcePocketData;
        this.f8249c = repaymentDeferral;
        this.d = payoffBreakdown;
        this.e = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f8247a, eVar.f8247a) && Intrinsics.f(this.f8248b, eVar.f8248b) && Intrinsics.f(this.f8249c, eVar.f8249c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f8248b, this.f8247a.hashCode() * 31, 31);
        RepaymentDeferral repaymentDeferral = this.f8249c;
        int iHashCode = (iC + (repaymentDeferral == null ? 0 : repaymentDeferral.hashCode())) * 31;
        PayoffBreakdown payoffBreakdown = this.d;
        return this.e.hashCode() + ((iHashCode + (payoffBreakdown != null ? payoffBreakdown.hashCode() : 0)) * 31);
    }
}
