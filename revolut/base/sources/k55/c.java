package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u0014"}, d2 = {"Lk55/c;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "d", "()Ljo3/a;", "principalAmount", "b", "c", "loanAmount", "interestAmount", "e", "stampDutyAmount", "f", "totalAmount", "feeAmountOpt", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("principalAmount")
    private final jo3.a principalAmount = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanAmount")
    private final jo3.a loanAmount = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestAmount")
    private final jo3.a interestAmount = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("stampDutyOverInterestAmountOpt")
    private final jo3.a stampDutyAmount = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalAmount")
    private final jo3.a totalAmount = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("feeAmountOpt")
    private final jo3.a feeAmountOpt = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getFeeAmountOpt() {
        return this.feeAmountOpt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getInterestAmount() {
        return this.interestAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getLoanAmount() {
        return this.loanAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPrincipalAmount() {
        return this.principalAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getStampDutyAmount() {
        return this.stampDutyAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.principalAmount, cVar.principalAmount) && Intrinsics.f(this.loanAmount, cVar.loanAmount) && Intrinsics.f(this.interestAmount, cVar.interestAmount) && Intrinsics.f(this.stampDutyAmount, cVar.stampDutyAmount) && Intrinsics.f(this.totalAmount, cVar.totalAmount) && Intrinsics.f(this.feeAmountOpt, cVar.feeAmountOpt);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getTotalAmount() {
        return this.totalAmount;
    }

    public final int hashCode() {
        jo3.a aVar = this.principalAmount;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.loanAmount;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.interestAmount;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.stampDutyAmount;
        int iHashCode4 = (iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        jo3.a aVar5 = this.totalAmount;
        int iHashCode5 = (iHashCode4 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        jo3.a aVar6 = this.feeAmountOpt;
        return iHashCode5 + (aVar6 != null ? aVar6.hashCode() : 0);
    }
}
