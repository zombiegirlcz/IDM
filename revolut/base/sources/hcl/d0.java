package hcl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lhcl/d0;", "Lhcl/q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "macroStrategy", "", "Lhcl/g0;", "Ljava/util/List;", "c", "()Ljava/util/List;", "subStrategies", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("macroStrategy")
    private final String macroStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subStrategies")
    private final List<g0> subStrategies;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("allocation")
    private final BigDecimal allocation;

    public d0(String str, BigDecimal bigDecimal, ArrayList arrayList) {
        this.macroStrategy = str;
        this.subStrategies = arrayList;
        this.allocation = bigDecimal;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAllocation() {
        return this.allocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMacroStrategy() {
        return this.macroStrategy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSubStrategies() {
        return this.subStrategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.macroStrategy, d0Var.macroStrategy) && Intrinsics.f(this.subStrategies, d0Var.subStrategies) && Intrinsics.f(this.allocation, d0Var.allocation);
    }

    public final int hashCode() {
        String str = this.macroStrategy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<g0> list = this.subStrategies;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.allocation;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
