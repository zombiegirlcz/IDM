package du6;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Ldu6/b;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "earnedInTotalAmount", "b", "Ljava/lang/String;", "earnedInTotalCurrency", "c", "earnedThisPeriodAmount", "d", "earnedThisPeriodCurrency", "e", "periodDueDate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("earnedInTotalAmount")
    private final long earnedInTotalAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("earnedInTotalCurrency")
    @NotNull
    private final String earnedInTotalCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("earnedThisPeriodAmount")
    private final long earnedThisPeriodAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("earnedThisPeriodCurrency")
    @NotNull
    private final String earnedThisPeriodCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("periodDueDate")
    @NotNull
    private final String periodDueDate;

    public b(long j2, String earnedInTotalCurrency, String earnedThisPeriodCurrency, long j3, String periodDueDate) {
        Intrinsics.checkNotNullParameter(earnedInTotalCurrency, "earnedInTotalCurrency");
        Intrinsics.checkNotNullParameter(earnedThisPeriodCurrency, "earnedThisPeriodCurrency");
        Intrinsics.checkNotNullParameter(periodDueDate, "periodDueDate");
        this.earnedInTotalAmount = j2;
        this.earnedInTotalCurrency = earnedInTotalCurrency;
        this.earnedThisPeriodAmount = j3;
        this.earnedThisPeriodCurrency = earnedThisPeriodCurrency;
        this.periodDueDate = periodDueDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEarnedInTotalAmount() {
        return this.earnedInTotalAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEarnedInTotalCurrency() {
        return this.earnedInTotalCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEarnedThisPeriodAmount() {
        return this.earnedThisPeriodAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEarnedThisPeriodCurrency() {
        return this.earnedThisPeriodCurrency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPeriodDueDate() {
        return this.periodDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.earnedInTotalAmount == bVar.earnedInTotalAmount && Intrinsics.f(this.earnedInTotalCurrency, bVar.earnedInTotalCurrency) && this.earnedThisPeriodAmount == bVar.earnedThisPeriodAmount && Intrinsics.f(this.earnedThisPeriodCurrency, bVar.earnedThisPeriodCurrency) && Intrinsics.f(this.periodDueDate, bVar.periodDueDate);
    }

    public final int hashCode() {
        return this.periodDueDate.hashCode() + p.a.c(a0.d.c(p.a.c(Long.hashCode(this.earnedInTotalAmount) * 31, 31, this.earnedInTotalCurrency), 31, this.earnedThisPeriodAmount), 31, this.earnedThisPeriodCurrency);
    }
}
