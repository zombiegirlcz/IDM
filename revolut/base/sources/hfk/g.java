package hfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lhfk/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBillingCycleId", "billingCycleId", "Lhfk/e;", "b", "Lhfk/e;", "getSignupReasons", "()Lhfk/e;", "signupReasons", "Lhfk/c;", "c", "Lhfk/c;", "getDowngradeReason", "()Lhfk/c;", "downgradeReason", "Lhfk/f;", "d", "Lhfk/f;", "getUpgradeConsideration", "()Lhfk/f;", "upgradeConsideration", "Lhfk/d;", "e", "Lhfk/d;", "getFeedback", "()Lhfk/d;", "feedback", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingCycleId")
    @NotNull
    private final String billingCycleId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("signupReasons")
    @NotNull
    private final e signupReasons;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("downgradeReason")
    private final c downgradeReason;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("upgradeConsideration")
    private final f upgradeConsideration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("feedback")
    @NotNull
    private final d feedback;

    public g(String billingCycleId, e signupReasons, c cVar, d feedback) {
        Intrinsics.checkNotNullParameter(billingCycleId, "billingCycleId");
        Intrinsics.checkNotNullParameter(signupReasons, "signupReasons");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.billingCycleId = billingCycleId;
        this.signupReasons = signupReasons;
        this.downgradeReason = cVar;
        this.upgradeConsideration = null;
        this.feedback = feedback;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.billingCycleId, gVar.billingCycleId) && Intrinsics.f(this.signupReasons, gVar.signupReasons) && Intrinsics.f(this.downgradeReason, gVar.downgradeReason) && Intrinsics.f(this.upgradeConsideration, gVar.upgradeConsideration) && Intrinsics.f(this.feedback, gVar.feedback);
    }

    public final int hashCode() {
        int iHashCode = (this.signupReasons.hashCode() + (this.billingCycleId.hashCode() * 31)) * 31;
        c cVar = this.downgradeReason;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        f fVar = this.upgradeConsideration;
        return this.feedback.hashCode() + ((iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31);
    }
}
