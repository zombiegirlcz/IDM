package o9l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lo9l/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "billNumber", "c", "dueDate", "d", "paymentAgreementId", "Lo9l/m;", "Lo9l/m;", "()Lo9l/m;", "beneficiary", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("billNumber")
    private final String billNumber = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final String dueDate = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAgreementId")
    private final String paymentAgreementId = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("beneficiary")
    private final m beneficiary = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getBeneficiary() {
        return this.beneficiary;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillNumber() {
        return this.billNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentAgreementId() {
        return this.paymentAgreementId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.billNumber, nVar.billNumber) && Intrinsics.f(this.dueDate, nVar.dueDate) && Intrinsics.f(this.paymentAgreementId, nVar.paymentAgreementId) && Intrinsics.f(this.beneficiary, nVar.beneficiary);
    }

    public final int hashCode() {
        String str = this.billNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dueDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentAgreementId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        m mVar = this.beneficiary;
        return iHashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }
}
