package wn1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lwn1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "transactionId", "b", "standingOrderId", "counterpartyId", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("standingOrderId")
    private final String standingOrderId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("counterpartyId")
    private final String counterpartyId;

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
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.transactionId, aVar.transactionId) && Intrinsics.f(this.standingOrderId, aVar.standingOrderId) && Intrinsics.f(this.counterpartyId, aVar.counterpartyId);
    }

    public final int hashCode() {
        String str = this.transactionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.standingOrderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.counterpartyId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
