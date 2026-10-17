package ks6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u000b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u0019\u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\""}, d2 = {"Lks6/n0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "i", "()J", "startDate", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "endDate", "Ljava/lang/String;", "f", "period", "", "d", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "remainingCount", "e", "invoicesSent", "I", "()I", "dueDateOffset", "h", "saleDateOffset", "nextScheduledFor", "calculatedEndDate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    private final long startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final Long endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final String period;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("remainingCount")
    private final Integer remainingCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("invoiceSent")
    private final Integer invoicesSent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("dueDateOffset")
    private final int dueDateOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("saleDateOffset")
    private final int saleDateOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextScheduledFor")
    private final Long nextScheduledFor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("calculatedEndDate")
    private final Long calculatedEndDate;

    public n0(long j2, Long l2, String period, Integer num, Integer num2, int i, int i2, Long l3, Long l4) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.startDate = j2;
        this.endDate = l2;
        this.period = period;
        this.remainingCount = num;
        this.invoicesSent = num2;
        this.dueDateOffset = i;
        this.saleDateOffset = i2;
        this.nextScheduledFor = l3;
        this.calculatedEndDate = l4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCalculatedEndDate() {
        return this.calculatedEndDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDueDateOffset() {
        return this.dueDateOffset;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getInvoicesSent() {
        return this.invoicesSent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getNextScheduledFor() {
        return this.nextScheduledFor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.startDate == n0Var.startDate && Intrinsics.f(this.endDate, n0Var.endDate) && Intrinsics.f(this.period, n0Var.period) && Intrinsics.f(this.remainingCount, n0Var.remainingCount) && Intrinsics.f(this.invoicesSent, n0Var.invoicesSent) && this.dueDateOffset == n0Var.dueDateOffset && this.saleDateOffset == n0Var.saleDateOffset && Intrinsics.f(this.nextScheduledFor, n0Var.nextScheduledFor) && Intrinsics.f(this.calculatedEndDate, n0Var.calculatedEndDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getRemainingCount() {
        return this.remainingCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSaleDateOffset() {
        return this.saleDateOffset;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.startDate) * 31;
        Long l2 = this.endDate;
        int iC = p.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.period);
        Integer num = this.remainingCount;
        int iHashCode2 = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.invoicesSent;
        int iB = j6.a.b(this.saleDateOffset, j6.a.b(this.dueDateOffset, (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        Long l3 = this.nextScheduledFor;
        int iHashCode3 = (iB + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.calculatedEndDate;
        return iHashCode3 + (l4 != null ? l4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }
}
