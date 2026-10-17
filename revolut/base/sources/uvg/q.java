package uvg;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0006\u0010\u0011¨\u0006\u0015"}, d2 = {"Luvg/q;", "", "", "toString", "()Ljava/lang/String;", "Lorg/joda/time/DateTime;", "a", "Lorg/joda/time/DateTime;", "e", "()Lorg/joda/time/DateTime;", "start", "b", "c", "end", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "netSell", "dividends", "cumulative", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    @NotNull
    private final DateTime start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    @NotNull
    private final DateTime end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("netSell")
    @NotNull
    private final jo3.a netSell;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dividends")
    private final jo3.a dividends;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cumulative")
    @NotNull
    private final jo3.a cumulative;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getCumulative() {
        return this.cumulative;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getDividends() {
        return this.dividends;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DateTime getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getNetSell() {
        return this.netSell;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DateTime getStart() {
        return this.start;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.start, qVar.start) && Intrinsics.f(this.end, qVar.end) && Intrinsics.f(this.netSell, qVar.netSell) && Intrinsics.f(this.dividends, qVar.dividends) && Intrinsics.f(this.cumulative, qVar.cumulative);
    }

    public final int hashCode() {
        int iJ = v7.j(this.netSell, m72.b.f(this.end, this.start.hashCode() * 31, 31), 31);
        jo3.a aVar = this.dividends;
        return this.cumulative.hashCode() + ((iJ + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
