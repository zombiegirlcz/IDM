package pp1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lpp1/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "transactionId", "b", "counterpartyId", "standingOrderId", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterpartyId")
    private final String counterpartyId = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("standingOrderId")
    private final String standingOrderId = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCounterpartyId() {
        return this.counterpartyId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStandingOrderId() {
        return this.standingOrderId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.transactionId, dVar.transactionId) && Intrinsics.f(this.counterpartyId, dVar.counterpartyId) && Intrinsics.f(this.standingOrderId, dVar.standingOrderId);
    }

    public final int hashCode() {
        String str = this.transactionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.counterpartyId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.standingOrderId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
