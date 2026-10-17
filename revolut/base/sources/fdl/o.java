package fdl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u000b\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lfdl/o;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "e", "()Ljava/math/BigDecimal;", "open", "b", "close", "c", "high", "d", "low", "", "J", "g", "()J", "volume", "f", "from", "to", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("open")
    @NotNull
    private final BigDecimal open;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("close")
    @NotNull
    private final BigDecimal close;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("high")
    @NotNull
    private final BigDecimal high;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("low")
    @NotNull
    private final BigDecimal low;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("volume")
    private final long volume;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("from")
    private final long from;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    private final long to;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getOpen() {
        return this.open;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.open, oVar.open) && Intrinsics.f(this.close, oVar.close) && Intrinsics.f(this.high, oVar.high) && Intrinsics.f(this.low, oVar.low) && this.volume == oVar.volume && this.from == oVar.from && this.to == oVar.to;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTo() {
        return this.to;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getVolume() {
        return this.volume;
    }

    public final int hashCode() {
        return Long.hashCode(this.to) + a0.d.c(a0.d.c(t61.a.d(this.low, t61.a.d(this.high, t61.a.d(this.close, this.open.hashCode() * 31, 31), 31), 31), 31, this.volume), 31, this.from);
    }
}
