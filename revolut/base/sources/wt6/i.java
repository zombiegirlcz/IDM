package wt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\r"}, d2 = {"Lwt6/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "period", "b", "closingMonth", "nextPaymentDate", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final String period;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("closingMonth")
    private final String closingMonth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPaymentDate")
    private final String nextPaymentDate;

    public i(String period, String str, String str2) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.period = period;
        this.closingMonth = str;
        this.nextPaymentDate = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClosingMonth() {
        return this.closingMonth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.period, iVar.period) && Intrinsics.f(this.closingMonth, iVar.closingMonth) && Intrinsics.f(this.nextPaymentDate, iVar.nextPaymentDate);
    }

    public final int hashCode() {
        int iHashCode = this.period.hashCode() * 31;
        String str = this.closingMonth;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextPaymentDate;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
