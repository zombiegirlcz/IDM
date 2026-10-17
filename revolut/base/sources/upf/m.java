package upf;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0013\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lupf/m;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "amount", "b", "g", "totalAmountWithInterest", "", "c", "I", "f", "()I", "term", "d", "monthlyRepayment", "e", "Ljava/lang/String;", "firstInstalmentDueDate", "lastInstalmentDueDate", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "rate", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAmountWithInterest")
    @NotNull
    private final jo3.a totalAmountWithInterest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("monthlyRepayment")
    private final jo3.a monthlyRepayment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("firstInstalmentDueDate")
    private final String firstInstalmentDueDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("lastInstalmentDueDate")
    private final String lastInstalmentDueDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    private final Double rate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstInstalmentDueDate() {
        return this.firstInstalmentDueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastInstalmentDueDate() {
        return this.lastInstalmentDueDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getMonthlyRepayment() {
        return this.monthlyRepayment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.amount, mVar.amount) && Intrinsics.f(this.totalAmountWithInterest, mVar.totalAmountWithInterest) && this.term == mVar.term && Intrinsics.f(this.monthlyRepayment, mVar.monthlyRepayment) && Intrinsics.f(this.firstInstalmentDueDate, mVar.firstInstalmentDueDate) && Intrinsics.f(this.lastInstalmentDueDate, mVar.lastInstalmentDueDate) && Intrinsics.f(this.rate, mVar.rate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getTotalAmountWithInterest() {
        return this.totalAmountWithInterest;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.term, v7.j(this.totalAmountWithInterest, this.amount.hashCode() * 31, 31), 31);
        jo3.a aVar = this.monthlyRepayment;
        int iHashCode = (iB + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.firstInstalmentDueDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastInstalmentDueDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.rate;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }
}
