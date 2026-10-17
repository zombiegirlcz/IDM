package xfg;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lxfg/h0;", "", "", "toString", "()Ljava/lang/String;", "", "Lxfg/c0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "flights", "b", "Ljava/lang/String;", "d", "resultId", "c", "nextCursor", "Lxfg/h0$a;", "Lxfg/h0$a;", "()Lxfg/h0$a;", "liveSearchBreakdown", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("flights")
    @NotNull
    private final List<c0> flights;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("resultId")
    private final String resultId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextCursor")
    private final String nextCursor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("liveSearchBreakdown")
    private final a liveSearchBreakdown;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lxfg/h0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "pollingId", "", "b", "J", "()J", "timeout", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("pollingId")
        @NotNull
        private final String pollingId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("timeout")
        private final long timeout;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPollingId() {
            return this.pollingId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimeout() {
            return this.timeout;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.pollingId, aVar.pollingId) && this.timeout == aVar.timeout;
        }

        public final int hashCode() {
            return Long.hashCode(this.timeout) + (this.pollingId.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getFlights() {
        return this.flights;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getLiveSearchBreakdown() {
        return this.liveSearchBreakdown;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.flights, h0Var.flights) && Intrinsics.f(this.resultId, h0Var.resultId) && Intrinsics.f(this.nextCursor, h0Var.nextCursor) && Intrinsics.f(this.liveSearchBreakdown, h0Var.liveSearchBreakdown);
    }

    public final int hashCode() {
        int iHashCode = this.flights.hashCode() * 31;
        String str = this.resultId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextCursor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.liveSearchBreakdown;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
