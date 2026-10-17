package orl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Lorl/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "internalCutoffDate", "f", "tradeDate", "c", "Ljava/lang/String;", "custodyFee", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "navDate", "Le4l/a;", "e", "Le4l/a;", "()Le4l/a;", "lockup", "settlementDate", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("internalCutoffDate")
    private final long internalCutoffDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tradeDate")
    private final long tradeDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("custodyFee")
    private final String custodyFee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("navDate")
    private final Long navDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fundLockupPeriods")
    private final e4l.a lockup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("settlementDate")
    private final Long settlementDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCustodyFee() {
        return this.custodyFee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getInternalCutoffDate() {
        return this.internalCutoffDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e4l.a getLockup() {
        return this.lockup;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getNavDate() {
        return this.navDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getSettlementDate() {
        return this.settlementDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.internalCutoffDate == dVar.internalCutoffDate && this.tradeDate == dVar.tradeDate && Intrinsics.f(this.custodyFee, dVar.custodyFee) && Intrinsics.f(this.navDate, dVar.navDate) && Intrinsics.f(this.lockup, dVar.lockup) && Intrinsics.f(this.settlementDate, dVar.settlementDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTradeDate() {
        return this.tradeDate;
    }

    public final int hashCode() {
        int iC = a0.d.c(Long.hashCode(this.internalCutoffDate) * 31, 31, this.tradeDate);
        String str = this.custodyFee;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.navDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        e4l.a aVar = this.lockup;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Long l3 = this.settlementDate;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }
}
