package d1b;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Ld1b/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "e", "()J", "time", "", "b", "D", "()D", "high", "c", "low", "d", "open", "close", "f", "Ljava/lang/Double;", "()Ljava/lang/Double;", "volume", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("time")
    private final long time;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("high")
    private final double high;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("low")
    private final double low;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("open")
    private final double open;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("close")
    private final double close;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("volume")
    private final Double volume;

    public b(long j2, double d, double d5, double d6, double d10, Double d15) {
        this.time = j2;
        this.high = d;
        this.low = d5;
        this.open = d6;
        this.close = d10;
        this.volume = d15;
    }

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
    public final long getTime() {
        return this.time;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.time == bVar.time && Double.compare(this.high, bVar.high) == 0 && Double.compare(this.low, bVar.low) == 0 && Double.compare(this.open, bVar.open) == 0 && Double.compare(this.close, bVar.close) == 0 && Intrinsics.f(this.volume, bVar.volume);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getVolume() {
        return this.volume;
    }

    public final int hashCode() {
        int iC = m72.b.c(m72.b.c(m72.b.c(m72.b.c(Long.hashCode(this.time) * 31, this.high, 31), this.low, 31), this.open, 31), this.close, 31);
        Double d = this.volume;
        return iC + (d == null ? 0 : d.hashCode());
    }
}
