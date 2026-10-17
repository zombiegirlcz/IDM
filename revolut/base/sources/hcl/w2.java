package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Lhcl/w2;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "()Ljo3/b;", "high", "b", "low", "c", "mean", "", "d", "I", "()I", "totalNumberOfEstimates", "Lorg/joda/time/Instant;", "e", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "updatedAt", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("high")
    @NotNull
    private final jo3.b high;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("low")
    @NotNull
    private final jo3.b low;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mean")
    @NotNull
    private final jo3.b mean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalNumberOfEstimates")
    private final int totalNumberOfEstimates;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("updatedAt")
    @NotNull
    private final Instant updatedAt;

    public w2(jo3.b high, jo3.b low, jo3.b mean, int i, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.high = high;
        this.low = low;
        this.mean = mean;
        this.totalNumberOfEstimates = i;
        this.updatedAt = updatedAt;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getMean() {
        return this.mean;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotalNumberOfEstimates() {
        return this.totalNumberOfEstimates;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.high, w2Var.high) && Intrinsics.f(this.low, w2Var.low) && Intrinsics.f(this.mean, w2Var.mean) && this.totalNumberOfEstimates == w2Var.totalNumberOfEstimates && Intrinsics.f(this.updatedAt, w2Var.updatedAt);
    }

    public final int hashCode() {
        return this.updatedAt.hashCode() + j6.a.b(this.totalNumberOfEstimates, wp5.y.e(this.mean, wp5.y.e(this.low, this.high.hashCode() * 31, 31), 31), 31);
    }
}
