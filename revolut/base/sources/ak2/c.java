package ak2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0013"}, d2 = {"Lak2/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "hasWithdrawalFee", "b", "c", "hasExchangeFee", "Lak2/d;", "Lak2/d;", "()Lak2/d;", "blikWithdrawalCommission", "creditCardWithdrawalCommission", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasWithdrawalFee")
    private final Boolean hasWithdrawalFee;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasExchangeFee")
    private final Boolean hasExchangeFee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("blikWithdrawalCommission")
    private final d blikWithdrawalCommission;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("creditCardWithdrawalCommission")
    private final d creditCardWithdrawalCommission;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getBlikWithdrawalCommission() {
        return this.blikWithdrawalCommission;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getCreditCardWithdrawalCommission() {
        return this.creditCardWithdrawalCommission;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getHasExchangeFee() {
        return this.hasExchangeFee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getHasWithdrawalFee() {
        return this.hasWithdrawalFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.hasWithdrawalFee, cVar.hasWithdrawalFee) && Intrinsics.f(this.hasExchangeFee, cVar.hasExchangeFee) && Intrinsics.f(this.blikWithdrawalCommission, cVar.blikWithdrawalCommission) && Intrinsics.f(this.creditCardWithdrawalCommission, cVar.creditCardWithdrawalCommission);
    }

    public final int hashCode() {
        Boolean bool = this.hasWithdrawalFee;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasExchangeFee;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        d dVar = this.blikWithdrawalCommission;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.creditCardWithdrawalCommission;
        return iHashCode3 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
