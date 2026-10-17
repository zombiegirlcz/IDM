package fdl;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\r\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u000b\u0010\u0004R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001e"}, d2 = {"Lfdl/p;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "g", "()Ljava/math/BigDecimal;", "startClose", "b", "baseline", "c", "d", "endClose", "", "J", "f", "()J", "start", "e", "end", "Ljava/lang/String;", "currency", "", "Lfdl/o;", "Ljava/util/List;", "()Ljava/util/List;", "rates", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("startClose")
    private final BigDecimal startClose;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseline")
    private final BigDecimal baseline;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("endClose")
    private final BigDecimal endClose;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("start")
    private final long start;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("end")
    private final long end;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("rates")
    private final List<o> rates;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getEndClose() {
        return this.endClose;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getRates() {
        return this.rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.startClose, pVar.startClose) && Intrinsics.f(this.baseline, pVar.baseline) && Intrinsics.f(this.endClose, pVar.endClose) && this.start == pVar.start && this.end == pVar.end && Intrinsics.f(this.currency, pVar.currency) && Intrinsics.f(this.rates, pVar.rates);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getStartClose() {
        return this.startClose;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.startClose;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.baseline;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.endClose;
        int iC = p.a.c(a0.d.c(a0.d.c((iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31, 31, this.start), 31, this.end), 31, this.currency);
        List<o> list = this.rates;
        return iC + (list != null ? list.hashCode() : 0);
    }
}
