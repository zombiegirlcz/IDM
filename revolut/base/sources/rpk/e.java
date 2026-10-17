package rpk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lrpk/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "previousRangeCloseRate", "", "Lrpk/f;", "Ljava/util/List;", "()Ljava/util/List;", "points", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousRangeCloseRate")
    private final double previousRangeCloseRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final List<f> points;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getPreviousRangeCloseRate() {
        return this.previousRangeCloseRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Double.compare(this.previousRangeCloseRate, eVar.previousRangeCloseRate) == 0 && Intrinsics.f(this.points, eVar.points);
    }

    public final int hashCode() {
        return this.points.hashCode() + (Double.hashCode(this.previousRangeCloseRate) * 31);
    }
}
