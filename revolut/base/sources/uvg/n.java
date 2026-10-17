package uvg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\u001a"}, d2 = {"Luvg/n;", "", "", "toString", "()Ljava/lang/String;", "Lorg/joda/time/DateTime;", "a", "Lorg/joda/time/DateTime;", "d", "()Lorg/joda/time/DateTime;", "timestamp", "", "b", "F", "c", "()F", "returns", "e", "totalReturns", "Ljava/lang/Float;", "()Ljava/lang/Float;", "benchmark", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "pnl", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timestamp")
    @NotNull
    private final DateTime timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("returns")
    private final float returns;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalReturns")
    private final float totalReturns;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("benchmark")
    private final Float benchmark;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pnl")
    @NotNull
    private final jo3.a pnl;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getBenchmark() {
        return this.benchmark;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getPnl() {
        return this.pnl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getReturns() {
        return this.returns;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getTotalReturns() {
        return this.totalReturns;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.timestamp, nVar.timestamp) && Float.compare(this.returns, nVar.returns) == 0 && Float.compare(this.totalReturns, nVar.totalReturns) == 0 && Intrinsics.f(this.benchmark, nVar.benchmark) && Intrinsics.f(this.pnl, nVar.pnl);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.totalReturns, m72.b.b(this.returns, this.timestamp.hashCode() * 31, 31), 31);
        Float f = this.benchmark;
        return this.pnl.hashCode() + ((iB + (f == null ? 0 : f.hashCode())) * 31);
    }
}
