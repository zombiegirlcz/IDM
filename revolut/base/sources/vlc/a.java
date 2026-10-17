package vlc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Lvlc/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "g", "()J", "start", "b", "end", "Ljava/math/BigDecimal;", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "maxDrawdown", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "maxDrawdownDate", "e", "f", "recoveryDate", "benchmarkMaxDrawdown", "", "Lvlc/a$a;", "Ljava/util/List;", "()Ljava/util/List;", "points", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    private final long start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    private final long end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxDrawdown")
    @NotNull
    private final BigDecimal maxDrawdown;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxDrawdownDate")
    private final Long maxDrawdownDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("recoveryDate")
    private final Long recoveryDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("benchmarkMaxDrawdown")
    private final BigDecimal benchmarkMaxDrawdown;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final List<C1602a> points;

    /* JADX INFO: renamed from: vlc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lvlc/a$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "timestamp", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "drawdown", "benchmark", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1602a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("timestamp")
        private final long timestamp;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("drawdown")
        @NotNull
        private final BigDecimal drawdown;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("benchmark")
        private final BigDecimal benchmark;

        public C1602a(long j2, BigDecimal drawdown, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(drawdown, "drawdown");
            this.timestamp = j2;
            this.drawdown = drawdown;
            this.benchmark = bigDecimal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getBenchmark() {
            return this.benchmark;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getDrawdown() {
            return this.drawdown;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1602a)) {
                return false;
            }
            C1602a c1602a = (C1602a) obj2;
            return this.timestamp == c1602a.timestamp && Intrinsics.f(this.drawdown, c1602a.drawdown) && Intrinsics.f(this.benchmark, c1602a.benchmark);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.drawdown, Long.hashCode(this.timestamp) * 31, 31);
            BigDecimal bigDecimal = this.benchmark;
            return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }
    }

    public a(long j2, long j3, BigDecimal maxDrawdown, Long l2, Long l3, BigDecimal bigDecimal, ArrayList points) {
        Intrinsics.checkNotNullParameter(maxDrawdown, "maxDrawdown");
        Intrinsics.checkNotNullParameter(points, "points");
        this.start = j2;
        this.end = j3;
        this.maxDrawdown = maxDrawdown;
        this.maxDrawdownDate = l2;
        this.recoveryDate = l3;
        this.benchmarkMaxDrawdown = bigDecimal;
        this.points = points;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBenchmarkMaxDrawdown() {
        return this.benchmarkMaxDrawdown;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getMaxDrawdown() {
        return this.maxDrawdown;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getMaxDrawdownDate() {
        return this.maxDrawdownDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getPoints() {
        return this.points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.start == aVar.start && this.end == aVar.end && Intrinsics.f(this.maxDrawdown, aVar.maxDrawdown) && Intrinsics.f(this.maxDrawdownDate, aVar.maxDrawdownDate) && Intrinsics.f(this.recoveryDate, aVar.recoveryDate) && Intrinsics.f(this.benchmarkMaxDrawdown, aVar.benchmarkMaxDrawdown) && Intrinsics.f(this.points, aVar.points);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getRecoveryDate() {
        return this.recoveryDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.maxDrawdown, a0.d.c(Long.hashCode(this.start) * 31, 31, this.end), 31);
        Long l2 = this.maxDrawdownDate;
        int iHashCode = (iD + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.recoveryDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        BigDecimal bigDecimal = this.benchmarkMaxDrawdown;
        return this.points.hashCode() + ((iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31);
    }
}
