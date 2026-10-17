package yfg;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lyfg/k;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "min", "max", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("min")
    private final double min;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("max")
    private final double max;

    public k(double d, double d5) {
        this.min = d;
        this.max = d5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getMin() {
        return this.min;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Double.compare(this.min, kVar.min) == 0 && Double.compare(this.max, kVar.max) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.max) + (Double.hashCode(this.min) * 31);
    }
}
