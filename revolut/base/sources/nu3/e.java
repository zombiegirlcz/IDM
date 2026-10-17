package nu3;

import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f219199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f219200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntendedPricingPlan f219201c;

    public e(long j2, Integer num, IntendedPricingPlan intendedPricingPlan) {
        this.f219199a = j2;
        this.f219200b = num;
        this.f219201c = intendedPricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f219199a == eVar.f219199a && Intrinsics.f(this.f219200b, eVar.f219200b) && Intrinsics.f(this.f219201c, eVar.f219201c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f219199a) * 31;
        Integer num = this.f219200b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        IntendedPricingPlan intendedPricingPlan = this.f219201c;
        return iHashCode2 + (intendedPricingPlan != null ? intendedPricingPlan.hashCode() : 0);
    }
}
