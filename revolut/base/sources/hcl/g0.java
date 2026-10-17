package hcl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lhcl/g0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "subStrategy", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subStrategy")
    private final String subStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allocation")
    private final BigDecimal allocation;

    public g0(String str, BigDecimal bigDecimal) {
        this.subStrategy = str;
        this.allocation = bigDecimal;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAllocation() {
        return this.allocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubStrategy() {
        return this.subStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.subStrategy, g0Var.subStrategy) && Intrinsics.f(this.allocation, g0Var.allocation);
    }

    public final int hashCode() {
        String str = this.subStrategy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.allocation;
        return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
