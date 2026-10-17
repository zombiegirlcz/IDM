package rpk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lrpk/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "from", "d", "to", "Lrpk/b;", "c", "Lrpk/b;", "()Lrpk/b;", "rate", "eodRate", "", "e", "J", "getTimestamp", "()J", "timestamp", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("from")
    @NotNull
    private final String from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    @NotNull
    private final String to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final b rate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("eodRate")
    private final String eodRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEodRate() {
        return this.eodRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.from, aVar.from) && Intrinsics.f(this.to, aVar.to) && Intrinsics.f(this.rate, aVar.rate) && Intrinsics.f(this.eodRate, aVar.eodRate) && this.timestamp == aVar.timestamp;
    }

    public final int hashCode() {
        int iHashCode = (this.rate.hashCode() + p.a.c(this.from.hashCode() * 31, 31, this.to)) * 31;
        String str = this.eodRate;
        return Long.hashCode(this.timestamp) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
