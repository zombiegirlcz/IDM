package rpk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lrpk/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "ask", "b", "bid", "c", "mid", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ask")
    @NotNull
    private final String ask;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bid")
    @NotNull
    private final String bid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mid")
    @NotNull
    private final String mid;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAsk() {
        return this.ask;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBid() {
        return this.bid;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMid() {
        return this.mid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.ask, bVar.ask) && Intrinsics.f(this.bid, bVar.bid) && Intrinsics.f(this.mid, bVar.mid);
    }

    public final int hashCode() {
        return this.mid.hashCode() + p.a.c(this.ask.hashCode() * 31, 31, this.bid);
    }
}
