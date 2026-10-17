package xo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u0012"}, d2 = {"Lxo4/v;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "transferBalance", "b", "fees", "c", "interestOnInterest", "d", "purchaseRate", "cashBalance", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferBalance")
    private final Long transferBalance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final Long fees;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestOnInterest")
    private final Long interestOnInterest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("purchaseRate")
    private final Long purchaseRate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashBalance")
    private final Long cashBalance;

    public v(Long l2, Long l3, Long l4, Long l5, Long l22) {
        this.transferBalance = l2;
        this.fees = l3;
        this.interestOnInterest = l4;
        this.purchaseRate = l5;
        this.cashBalance = l22;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCashBalance() {
        return this.cashBalance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getInterestOnInterest() {
        return this.interestOnInterest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getPurchaseRate() {
        return this.purchaseRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getTransferBalance() {
        return this.transferBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.transferBalance, vVar.transferBalance) && Intrinsics.f(this.fees, vVar.fees) && Intrinsics.f(this.interestOnInterest, vVar.interestOnInterest) && Intrinsics.f(this.purchaseRate, vVar.purchaseRate) && Intrinsics.f(this.cashBalance, vVar.cashBalance);
    }

    public final int hashCode() {
        Long l2 = this.transferBalance;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.fees;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.interestOnInterest;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.purchaseRate;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.cashBalance;
        return iHashCode4 + (l22 != null ? l22.hashCode() : 0);
    }
}
