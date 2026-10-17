package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lpcl/h;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "annualCharge", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("annualCharge")
    private final Double annualCharge;

    public h(Double d) {
        this.annualCharge = d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAnnualCharge() {
        return this.annualCharge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.annualCharge, ((h) obj2).annualCharge);
    }

    public final int hashCode() {
        Double d = this.annualCharge;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }
}
