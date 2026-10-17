package du6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Ldu6/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "pricingPlanCode", "b", "rate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricing_plan_code")
    @NotNull
    private final String pricingPlanCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final String rate;

    public c(String pricingPlanCode, String rate) {
        Intrinsics.checkNotNullParameter(pricingPlanCode, "pricingPlanCode");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.pricingPlanCode = pricingPlanCode;
        this.rate = rate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPricingPlanCode() {
        return this.pricingPlanCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.pricingPlanCode, cVar.pricingPlanCode) && Intrinsics.f(this.rate, cVar.rate);
    }

    public final int hashCode() {
        return this.rate.hashCode() + (this.pricingPlanCode.hashCode() * 31);
    }
}
