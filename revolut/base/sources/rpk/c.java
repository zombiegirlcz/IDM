package rpk;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0015"}, d2 = {"Lrpk/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "e", "()J", "start", "", "b", "D", "d", "()D", "open", "c", "high", "low", "close", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    private final long start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("open")
    private final double open;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("high")
    private final double high;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("low")
    private final double low;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("close")
    private final double close;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getOpen() {
        return this.open;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.start == cVar.start && Double.compare(this.open, cVar.open) == 0 && Double.compare(this.high, cVar.high) == 0 && Double.compare(this.low, cVar.low) == 0 && Double.compare(this.close, cVar.close) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.close) + m72.b.c(m72.b.c(m72.b.c(Long.hashCode(this.start) * 31, this.open, 31), this.high, 31), this.low, 31);
    }
}
