package rpk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u000f\u0010\u001b¨\u0006\u001f"}, d2 = {"Lrpk/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "from", "d", "to", "c", "rate", "eodRate", "", "e", "J", "getTimestamp", "()J", "timestamp", "", "f", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "isWeekend", "Ljava/lang/Long;", "()Ljava/lang/Long;", "weekendStartTime", "h", "weekendEndTime", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

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
    private final String rate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("eodRate")
    private final String eodRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("isWeekend")
    private final Boolean isWeekend;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekendStartTime")
    private final Long weekendStartTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekendEndTime")
    private final Long weekendEndTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEodRate() {
        return this.eodRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getWeekendEndTime() {
        return this.weekendEndTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.from, gVar.from) && Intrinsics.f(this.to, gVar.to) && Intrinsics.f(this.rate, gVar.rate) && Intrinsics.f(this.eodRate, gVar.eodRate) && this.timestamp == gVar.timestamp && Intrinsics.f(this.isWeekend, gVar.isWeekend) && Intrinsics.f(this.weekendStartTime, gVar.weekendStartTime) && Intrinsics.f(this.weekendEndTime, gVar.weekendEndTime);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getWeekendStartTime() {
        return this.weekendStartTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getIsWeekend() {
        return this.isWeekend;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.from.hashCode() * 31, 31, this.to), 31, this.rate);
        String str = this.eodRate;
        int iC2 = a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.timestamp);
        Boolean bool = this.isWeekend;
        int iHashCode = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.weekendStartTime;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.weekendEndTime;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
