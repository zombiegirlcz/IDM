package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lpcl/n;", "", "", "toString", "()Ljava/lang/String;", "Lpcl/n$a;", "a", "Lpcl/n$a;", "()Lpcl/n$a;", "sriRatio", "b", "srriRatio", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sriRatio")
    private final a sriRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("srriRatio")
    private final a srriRatio;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lpcl/n$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "value", "max", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final Double value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("max")
        private final Double max;

        public a(Double d, Double d5) {
            this.value = d;
            this.max = d5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Double getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.max, aVar.max);
        }

        public final int hashCode() {
            Double d = this.value;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d5 = this.max;
            return iHashCode + (d5 != null ? d5.hashCode() : 0);
        }
    }

    public n(a aVar, a aVar2) {
        this.sriRatio = aVar;
        this.srriRatio = aVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getSriRatio() {
        return this.sriRatio;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getSrriRatio() {
        return this.srriRatio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.sriRatio, nVar.sriRatio) && Intrinsics.f(this.srriRatio, nVar.srriRatio);
    }

    public final int hashCode() {
        a aVar = this.sriRatio;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.srriRatio;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
