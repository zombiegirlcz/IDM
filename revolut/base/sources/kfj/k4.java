package kfj;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkfj/k4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "period", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "price", "c", "points", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "nextPeriodStartDate", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final String period;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.a price;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    private final String points;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nextPeriodStartDate")
    private final Long nextPeriodStartDate;

    public k4(String period, jo3.a price, String str, Long l2) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(price, "price");
        this.period = period;
        this.price = price;
        this.points = str;
        this.nextPeriodStartDate = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getNextPeriodStartDate() {
        return this.nextPeriodStartDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.period, k4Var.period) && Intrinsics.f(this.price, k4Var.price) && Intrinsics.f(this.points, k4Var.points) && Intrinsics.f(this.nextPeriodStartDate, k4Var.nextPeriodStartDate);
    }

    public final int hashCode() {
        int iJ = v7.j(this.price, this.period.hashCode() * 31, 31);
        String str = this.points;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.nextPeriodStartDate;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
