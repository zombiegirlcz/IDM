package o9l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lo9l/p;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "weekDay", "monthDay", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekDay")
    private final Integer weekDay = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthDay")
    private final Integer monthDay = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getMonthDay() {
        return this.monthDay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getWeekDay() {
        return this.weekDay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.weekDay, pVar.weekDay) && Intrinsics.f(this.monthDay, pVar.monthDay);
    }

    public final int hashCode() {
        Integer num = this.weekDay;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.monthDay;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
