package r1c;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lr1c/f;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "perCurrencyUnitsSpent", "", "b", "D", "()D", "points", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("perCurrencyUnitsSpent")
    private final int perCurrencyUnitsSpent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    private final double points;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPerCurrencyUnitsSpent() {
        return this.perCurrencyUnitsSpent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getPoints() {
        return this.points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.perCurrencyUnitsSpent == fVar.perCurrencyUnitsSpent && Double.compare(this.points, fVar.points) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.points) + (Integer.hashCode(this.perCurrencyUnitsSpent) * 31);
    }
}
