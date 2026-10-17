package xzg;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lxzg/p;", "", "", "toString", "()Ljava/lang/String;", "Lxi0/b;", "a", "Lxi0/b;", "c", "()Lxi0/b;", "from", "b", "e", "to", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "ask", "d", "bid", "mid", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("from")
    @NotNull
    private final xi0.b from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    @NotNull
    private final xi0.b to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ask")
    @NotNull
    private final BigDecimal ask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bid")
    @NotNull
    private final BigDecimal bid;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("mid")
    @NotNull
    private final BigDecimal mid;

    public p(xi0.b from, xi0.b to6, BigDecimal ask2, BigDecimal bid2, BigDecimal mid2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(ask2, "ask");
        Intrinsics.checkNotNullParameter(bid2, "bid");
        Intrinsics.checkNotNullParameter(mid2, "mid");
        this.from = from;
        this.to = to6;
        this.ask = ask2;
        this.bid = bid2;
        this.mid = mid2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAsk() {
        return this.ask;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getBid() {
        return this.bid;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final xi0.b getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getMid() {
        return this.mid;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final xi0.b getTo() {
        return this.to;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.from, pVar.from) && Intrinsics.f(this.to, pVar.to) && Intrinsics.f(this.ask, pVar.ask) && Intrinsics.f(this.bid, pVar.bid) && Intrinsics.f(this.mid, pVar.mid);
    }

    public final int hashCode() {
        return this.mid.hashCode() + t61.a.d(this.bid, t61.a.d(this.ask, h30.l.j(this.to, this.from.hashCode() * 31, 31), 31), 31);
    }
}
