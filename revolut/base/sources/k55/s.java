package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0014"}, d2 = {"Lk55/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "type", "b", "f", "state", "c", "e", "repaymentSourceId", "d", "bankIdentifier", "accountNumber", "externalId", "debtorName", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentSourceId")
    @NotNull
    private final String repaymentSourceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bankIdentifier")
    private final String bankIdentifier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("accountNumber")
    private final String accountNumber;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("externalId")
    private final String externalId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtorName")
    private final String debtorName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankIdentifier() {
        return this.bankIdentifier;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDebtorName() {
        return this.debtorName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRepaymentSourceId() {
        return this.repaymentSourceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.type, sVar.type) && Intrinsics.f(this.state, sVar.state) && Intrinsics.f(this.repaymentSourceId, sVar.repaymentSourceId) && Intrinsics.f(this.bankIdentifier, sVar.bankIdentifier) && Intrinsics.f(this.accountNumber, sVar.accountNumber) && Intrinsics.f(this.externalId, sVar.externalId) && Intrinsics.f(this.debtorName, sVar.debtorName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.state), 31, this.repaymentSourceId);
        String str = this.bankIdentifier;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accountNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.debtorName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
