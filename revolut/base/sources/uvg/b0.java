package uvg;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Luvg/b0;", "", "", "toString", "()Ljava/lang/String;", "Lorg/joda/time/DateTime;", "a", "Lorg/joda/time/DateTime;", "d", "()Lorg/joda/time/DateTime;", "start", "b", "end", "", "Luvg/c0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "points", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "netTopUp", "e", "totalReturn", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    @NotNull
    private final DateTime start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    @NotNull
    private final DateTime end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final List<c0> points;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("netTopUp")
    private final jo3.a netTopUp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalReturn")
    private final jo3.a totalReturn;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTime getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getNetTopUp() {
        return this.netTopUp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DateTime getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getTotalReturn() {
        return this.totalReturn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.start, b0Var.start) && Intrinsics.f(this.end, b0Var.end) && Intrinsics.f(this.points, b0Var.points) && Intrinsics.f(this.netTopUp, b0Var.netTopUp) && Intrinsics.f(this.totalReturn, b0Var.totalReturn);
    }

    public final int hashCode() {
        int iD = p.a.d(m72.b.f(this.end, this.start.hashCode() * 31, 31), 31, this.points);
        jo3.a aVar = this.netTopUp;
        int iHashCode = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.totalReturn;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
