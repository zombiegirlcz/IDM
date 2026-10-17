package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lpcl/x;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "dayVolume", "average3MonthVolume", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dayVolume")
    private final Integer dayVolume;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("average3MonthVolume")
    private final Integer average3MonthVolume;

    public x(Integer num, Integer num2) {
        this.dayVolume = num;
        this.average3MonthVolume = num2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAverage3MonthVolume() {
        return this.average3MonthVolume;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDayVolume() {
        return this.dayVolume;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.dayVolume, xVar.dayVolume) && Intrinsics.f(this.average3MonthVolume, xVar.average3MonthVolume);
    }

    public final int hashCode() {
        Integer num = this.dayVolume;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.average3MonthVolume;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
