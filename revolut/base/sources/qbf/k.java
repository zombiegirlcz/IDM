package qbf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Lqbf/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBillingCycleId", "billingCycleId", "Lqbf/r;", "b", "Lqbf/r;", "getSignupReasons", "()Lqbf/r;", "signupReasons", "Lqbf/g;", "c", "Lqbf/g;", "getDowngradeReason", "()Lqbf/g;", "downgradeReason", "Lqbf/h;", "d", "Lqbf/h;", "getFeedback", "()Lqbf/h;", "feedback", "e", "getType", "type", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingCycleId")
    @NotNull
    private final String billingCycleId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("signupReasons")
    @NotNull
    private final r signupReasons;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("downgradeReason")
    private final g downgradeReason;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("feedback")
    @NotNull
    private final h feedback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    public k(String billingCycleId, r signupReasons, g gVar, h feedback) {
        Intrinsics.checkNotNullParameter(billingCycleId, "billingCycleId");
        Intrinsics.checkNotNullParameter(signupReasons, "signupReasons");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        Intrinsics.checkNotNullParameter("ADD_ON", "type");
        this.billingCycleId = billingCycleId;
        this.signupReasons = signupReasons;
        this.downgradeReason = gVar;
        this.feedback = feedback;
        this.type = "ADD_ON";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.billingCycleId, kVar.billingCycleId) && Intrinsics.f(this.signupReasons, kVar.signupReasons) && Intrinsics.f(this.downgradeReason, kVar.downgradeReason) && Intrinsics.f(this.feedback, kVar.feedback) && Intrinsics.f(this.type, kVar.type);
    }

    public final int hashCode() {
        int iHashCode = (this.signupReasons.hashCode() + (this.billingCycleId.hashCode() * 31)) * 31;
        g gVar = this.downgradeReason;
        return this.type.hashCode() + ((this.feedback.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31);
    }
}
