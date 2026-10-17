package hz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhz1/m;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "lower", "b", "d", "upper", "c", "e", "used", "Ljava/lang/String;", "period", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "resetDateTime", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("lower")
    private final jo3.a lower;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("upper")
    private final jo3.a upper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("used")
    private final jo3.a used;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("resetDateTime")
    private final Long resetDateTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getLower() {
        return this.lower;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getResetDateTime() {
        return this.resetDateTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getUpper() {
        return this.upper;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getUsed() {
        return this.used;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.lower, mVar.lower) && Intrinsics.f(this.upper, mVar.upper) && Intrinsics.f(this.used, mVar.used) && Intrinsics.f(this.period, mVar.period) && Intrinsics.f(this.resetDateTime, mVar.resetDateTime);
    }

    public final int hashCode() {
        jo3.a aVar = this.lower;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.upper;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.used;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str = this.period;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.resetDateTime;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }
}
