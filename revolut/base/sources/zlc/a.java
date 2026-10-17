package zlc;

import a0.d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000b\u0010\tR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"Lzlc/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "d", "()J", "start", "b", "end", "c", "lastUpdated", "", "Lzlc/a$a;", "Ljava/util/List;", "()Ljava/util/List;", "points", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    private final long start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    private final long end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastUpdated")
    private final long lastUpdated;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final List<C1793a> points;

    /* JADX INFO: renamed from: zlc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0013"}, d2 = {"Lzlc/a$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "timestamp", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "returns", "d", "totalReturns", "benchmark", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1793a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("timestamp")
        private final long timestamp;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("returns")
        @NotNull
        private final BigDecimal returns;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalReturns")
        @NotNull
        private final BigDecimal totalReturns;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("benchmark")
        private final BigDecimal benchmark;

        public C1793a(long j2, BigDecimal returns, BigDecimal totalReturns, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(returns, "returns");
            Intrinsics.checkNotNullParameter(totalReturns, "totalReturns");
            this.timestamp = j2;
            this.returns = returns;
            this.totalReturns = totalReturns;
            this.benchmark = bigDecimal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getBenchmark() {
            return this.benchmark;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getReturns() {
            return this.returns;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getTotalReturns() {
            return this.totalReturns;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1793a)) {
                return false;
            }
            C1793a c1793a = (C1793a) obj2;
            return this.timestamp == c1793a.timestamp && Intrinsics.f(this.returns, c1793a.returns) && Intrinsics.f(this.totalReturns, c1793a.totalReturns) && Intrinsics.f(this.benchmark, c1793a.benchmark);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.totalReturns, t61.a.d(this.returns, Long.hashCode(this.timestamp) * 31, 31), 31);
            BigDecimal bigDecimal = this.benchmark;
            return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }
    }

    public a(long j2, long j3, long j5, ArrayList points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.start = j2;
        this.end = j3;
        this.lastUpdated = j5;
        this.points = points;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.start == aVar.start && this.end == aVar.end && this.lastUpdated == aVar.lastUpdated && Intrinsics.f(this.points, aVar.points);
    }

    public final int hashCode() {
        return this.points.hashCode() + d.c(d.c(Long.hashCode(this.start) * 31, 31, this.end), 31, this.lastUpdated);
    }
}
