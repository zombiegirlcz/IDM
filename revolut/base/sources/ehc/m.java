package ehc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lehc/m;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "days", "Lehc/e;", "b", "intervals", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("days")
    @NotNull
    private final List<String> days;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("intervals")
    @NotNull
    private final List<e> intervals;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDays() {
        return this.days;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getIntervals() {
        return this.intervals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.days, mVar.days) && Intrinsics.f(this.intervals, mVar.intervals);
    }

    public final int hashCode() {
        return this.intervals.hashCode() + (this.days.hashCode() * 31);
    }
}
