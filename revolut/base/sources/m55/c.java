package m55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\r\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Lm55/c;", "", "", "toString", "()Ljava/lang/String;", "Lm55/a;", "a", "Lm55/a;", "d", "()Lm55/a;", "regularBreakdown", "b", "overdueBreakdown", "c", "outstandingBreakdown", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "overduePenaltyAmount", "e", "stampDutyOverLateInterestAmount", "f", "totalAmount", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("regularBreakdown")
    private final a regularBreakdown;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("overdueBreakdown")
    private final a overdueBreakdown;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingBreakdown")
    private final a outstandingBreakdown;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("overduePenaltyAmount")
    private final jo3.a overduePenaltyAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("stampDutyOverLateInterestAmount")
    private final jo3.a stampDutyOverLateInterestAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("totalAmount")
    @NotNull
    private final jo3.a totalAmount;

    public c(a aVar, a aVar2, a aVar3, jo3.a aVar4, jo3.a totalAmount) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.regularBreakdown = aVar;
        this.overdueBreakdown = aVar2;
        this.outstandingBreakdown = aVar3;
        this.overduePenaltyAmount = aVar4;
        this.stampDutyOverLateInterestAmount = null;
        this.totalAmount = totalAmount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getOutstandingBreakdown() {
        return this.outstandingBreakdown;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getOverdueBreakdown() {
        return this.overdueBreakdown;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getOverduePenaltyAmount() {
        return this.overduePenaltyAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getRegularBreakdown() {
        return this.regularBreakdown;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getStampDutyOverLateInterestAmount() {
        return this.stampDutyOverLateInterestAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.regularBreakdown, cVar.regularBreakdown) && Intrinsics.f(this.overdueBreakdown, cVar.overdueBreakdown) && Intrinsics.f(this.outstandingBreakdown, cVar.outstandingBreakdown) && Intrinsics.f(this.overduePenaltyAmount, cVar.overduePenaltyAmount) && Intrinsics.f(this.stampDutyOverLateInterestAmount, cVar.stampDutyOverLateInterestAmount) && Intrinsics.f(this.totalAmount, cVar.totalAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getTotalAmount() {
        return this.totalAmount;
    }

    public final int hashCode() {
        a aVar = this.regularBreakdown;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.overdueBreakdown;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.outstandingBreakdown;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.overduePenaltyAmount;
        int iHashCode4 = (iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        jo3.a aVar5 = this.stampDutyOverLateInterestAmount;
        return this.totalAmount.hashCode() + ((iHashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31);
    }
}
