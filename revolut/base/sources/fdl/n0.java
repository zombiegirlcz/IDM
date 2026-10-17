package fdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"Lfdl/n0;", "Lfdl/a0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "macroStrategy", "", "Lfdl/n0$a;", "Ljava/util/List;", "c", "()Ljava/util/List;", "subStrategies", "allocation", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("macroStrategy")
    private final String macroStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subStrategies")
    private final List<a> subStrategies;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("allocation")
    private final String allocation;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lfdl/n0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "subStrategy", "allocation", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("subStrategy")
        private final String subStrategy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        private final String allocation;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAllocation() {
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
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.subStrategy, aVar.subStrategy) && Intrinsics.f(this.allocation, aVar.allocation);
        }

        public final int hashCode() {
            String str = this.subStrategy;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.allocation;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAllocation() {
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
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.macroStrategy, n0Var.macroStrategy) && Intrinsics.f(this.subStrategies, n0Var.subStrategies) && Intrinsics.f(this.allocation, n0Var.allocation);
    }

    public final int hashCode() {
        String str = this.macroStrategy;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<a> list = this.subStrategies;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.allocation;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
