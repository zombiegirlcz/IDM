package hcl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lhcl/a2;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "capitalProtected", "barrier", "c", "d", "strike", "Ljava/lang/String;", "performanceBasis", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("capital_protected")
    private final BigDecimal capitalProtected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("barrier")
    private final BigDecimal barrier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("strike")
    private final BigDecimal strike;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("performance_basis")
    private final String performanceBasis;

    public a2(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str) {
        this.capitalProtected = bigDecimal;
        this.barrier = bigDecimal2;
        this.strike = bigDecimal3;
        this.performanceBasis = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBarrier() {
        return this.barrier;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getCapitalProtected() {
        return this.capitalProtected;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPerformanceBasis() {
        return this.performanceBasis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getStrike() {
        return this.strike;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Intrinsics.f(this.capitalProtected, a2Var.capitalProtected) && Intrinsics.f(this.barrier, a2Var.barrier) && Intrinsics.f(this.strike, a2Var.strike) && Intrinsics.f(this.performanceBasis, a2Var.performanceBasis);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.capitalProtected;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.barrier;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.strike;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str = this.performanceBasis;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
