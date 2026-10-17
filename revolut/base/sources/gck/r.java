package gck;

import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanGiftingRefund f142513c;

    public r(String giftId, String giftedPlanId, PlanGiftingRefund planGiftingRefund) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(giftedPlanId, "giftedPlanId");
        this.f142511a = giftId;
        this.f142512b = giftedPlanId;
        this.f142513c = planGiftingRefund;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f142511a, rVar.f142511a) && Intrinsics.f(this.f142512b, rVar.f142512b) && Intrinsics.f(this.f142513c, rVar.f142513c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f142511a.hashCode() * 31, 31, this.f142512b);
        PlanGiftingRefund planGiftingRefund = this.f142513c;
        return iC + (planGiftingRefund == null ? 0 : planGiftingRefund.hashCode());
    }
}
