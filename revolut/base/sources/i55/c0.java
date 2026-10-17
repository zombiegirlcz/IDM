package i55;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u001c"}, d2 = {"Li55/c0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "e", "()Ljo3/a;", "monthlyRepayment", "b", "Ljava/lang/String;", "c", "firstRepaymentDate", "firstRepayment", "d", "lastRepaymentDate", "finalRepaymentAmount", "f", "nextScheduleRegenerationDate", "", "g", "I", "h", "()I", "scheduleVersion", "repaymentType", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlyRepayment")
    @NotNull
    private final jo3.a monthlyRepayment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstRepaymentDate")
    @NotNull
    private final String firstRepaymentDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstRepayment")
    @NotNull
    private final jo3.a firstRepayment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("lastRepaymentDate")
    @NotNull
    private final String lastRepaymentDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("finalRepaymentAmount")
    @NotNull
    private final jo3.a finalRepaymentAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("nextScheduleRegenerationDate")
    private final String nextScheduleRegenerationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduleVersion")
    private final int scheduleVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentType")
    @NotNull
    private final String repaymentType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getFinalRepaymentAmount() {
        return this.finalRepaymentAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getFirstRepayment() {
        return this.firstRepayment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFirstRepaymentDate() {
        return this.firstRepaymentDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLastRepaymentDate() {
        return this.lastRepaymentDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMonthlyRepayment() {
        return this.monthlyRepayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.monthlyRepayment, c0Var.monthlyRepayment) && Intrinsics.f(this.firstRepaymentDate, c0Var.firstRepaymentDate) && Intrinsics.f(this.firstRepayment, c0Var.firstRepayment) && Intrinsics.f(this.lastRepaymentDate, c0Var.lastRepaymentDate) && Intrinsics.f(this.finalRepaymentAmount, c0Var.finalRepaymentAmount) && Intrinsics.f(this.nextScheduleRegenerationDate, c0Var.nextScheduleRegenerationDate) && this.scheduleVersion == c0Var.scheduleVersion && Intrinsics.f(this.repaymentType, c0Var.repaymentType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNextScheduleRegenerationDate() {
        return this.nextScheduleRegenerationDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRepaymentType() {
        return this.repaymentType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getScheduleVersion() {
        return this.scheduleVersion;
    }

    public final int hashCode() {
        int iJ = v7.j(this.finalRepaymentAmount, p.a.c(v7.j(this.firstRepayment, p.a.c(this.monthlyRepayment.hashCode() * 31, 31, this.firstRepaymentDate), 31), 31, this.lastRepaymentDate), 31);
        String str = this.nextScheduleRegenerationDate;
        return this.repaymentType.hashCode() + j6.a.b(this.scheduleVersion, (iJ + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
