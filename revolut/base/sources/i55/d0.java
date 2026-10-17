package i55;

import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\t\u0010$R\u001c\u0010'\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b!\u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b\u0005\u0010,R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004¨\u0006/"}, d2 = {"Li55/d0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "m", "transactionId", "Ljava/time/ZonedDateTime;", "c", "Ljava/time/ZonedDateTime;", "l", "()Ljava/time/ZonedDateTime;", "repaymentDateTime", "d", "e", "currency", "", "J", "()J", "amount", "f", "o", "type", "clientId", "h", "firstName", "i", "lastName", "j", "Ljava/lang/Long;", "k", "()Ljava/lang/Long;", "principal", "accruedInterest", "lateRepaymentInterest", "n", "transferType", "Li55/a0;", "Li55/a0;", "()Li55/a0;", "accountDetails", "insuranceType", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    @NotNull
    private final String transactionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDateTime")
    @NotNull
    private final ZonedDateTime repaymentDateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientId")
    private final String clientId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    private final String firstName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("lastName")
    private final String lastName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("principal")
    private final Long principal;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("accruedInterest")
    private final Long accruedInterest;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("lateRepaymentInterest")
    private final Long lateRepaymentInterest;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferType")
    private final String transferType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountDetails")
    private final a0 accountDetails;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("insuranceType")
    private final String insuranceType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a0 getAccountDetails() {
        return this.accountDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getAccruedInterest() {
        return this.accruedInterest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.id, d0Var.id) && Intrinsics.f(this.transactionId, d0Var.transactionId) && Intrinsics.f(this.repaymentDateTime, d0Var.repaymentDateTime) && Intrinsics.f(this.currency, d0Var.currency) && this.amount == d0Var.amount && Intrinsics.f(this.type, d0Var.type) && Intrinsics.f(this.clientId, d0Var.clientId) && Intrinsics.f(this.firstName, d0Var.firstName) && Intrinsics.f(this.lastName, d0Var.lastName) && Intrinsics.f(this.principal, d0Var.principal) && Intrinsics.f(this.accruedInterest, d0Var.accruedInterest) && Intrinsics.f(this.lateRepaymentInterest, d0Var.lateRepaymentInterest) && Intrinsics.f(this.transferType, d0Var.transferType) && Intrinsics.f(this.accountDetails, d0Var.accountDetails) && Intrinsics.f(this.insuranceType, d0Var.insuranceType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getInsuranceType() {
        return this.insuranceType;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c(h30.l.h(this.repaymentDateTime, p.a.c(this.id.hashCode() * 31, 31, this.transactionId), 31), 31, this.currency), 31, this.amount), 31, this.type);
        String str = this.clientId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.principal;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.accruedInterest;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.lateRepaymentInterest;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str4 = this.transferType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        a0 a0Var = this.accountDetails;
        int iHashCode8 = (iHashCode7 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        String str5 = this.insuranceType;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getLateRepaymentInterest() {
        return this.lateRepaymentInterest;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getPrincipal() {
        return this.principal;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ZonedDateTime getRepaymentDateTime() {
        return this.repaymentDateTime;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
