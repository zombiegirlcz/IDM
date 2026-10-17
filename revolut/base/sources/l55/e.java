package l55;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\t¨\u0006\u001e"}, d2 = {"Ll55/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getPayday", "()I", "payday", "Ljo3/a;", "b", "Ljo3/a;", "getFirstRepayment", "()Ljo3/a;", "firstRepayment", "c", "Ljava/lang/String;", "getFirstRepaymentDate", "firstRepaymentDate", "d", "getMonthlyRepayment", "monthlyRepayment", "e", "getLastRepaymentDate", "lastRepaymentDate", "f", "getScheduleVersion", "scheduleVersion", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("payday")
    private final int payday;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstRepayment")
    @NotNull
    private final jo3.a firstRepayment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstRepaymentDate")
    @NotNull
    private final String firstRepaymentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("monthlyRepayment")
    @NotNull
    private final jo3.a monthlyRepayment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lastRepaymentDate")
    @NotNull
    private final String lastRepaymentDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("scheduleVersion")
    private final int scheduleVersion;

    public e(int i, jo3.a firstRepayment, String firstRepaymentDate, jo3.a monthlyRepayment, String lastRepaymentDate, int i2) {
        Intrinsics.checkNotNullParameter(firstRepayment, "firstRepayment");
        Intrinsics.checkNotNullParameter(firstRepaymentDate, "firstRepaymentDate");
        Intrinsics.checkNotNullParameter(monthlyRepayment, "monthlyRepayment");
        Intrinsics.checkNotNullParameter(lastRepaymentDate, "lastRepaymentDate");
        this.payday = i;
        this.firstRepayment = firstRepayment;
        this.firstRepaymentDate = firstRepaymentDate;
        this.monthlyRepayment = monthlyRepayment;
        this.lastRepaymentDate = lastRepaymentDate;
        this.scheduleVersion = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.payday == eVar.payday && Intrinsics.f(this.firstRepayment, eVar.firstRepayment) && Intrinsics.f(this.firstRepaymentDate, eVar.firstRepaymentDate) && Intrinsics.f(this.monthlyRepayment, eVar.monthlyRepayment) && Intrinsics.f(this.lastRepaymentDate, eVar.lastRepaymentDate) && this.scheduleVersion == eVar.scheduleVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.scheduleVersion) + p.a.c(v7.j(this.monthlyRepayment, p.a.c(v7.j(this.firstRepayment, Integer.hashCode(this.payday) * 31, 31), 31, this.firstRepaymentDate), 31), 31, this.lastRepaymentDate);
    }
}
