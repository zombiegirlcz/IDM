package l8a;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010 \u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\f\u0010\u0013R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010&\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010+\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b,\u0010\u0004R\"\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b.\u00102R\u001c\u00108\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b6\u00107R\u001c\u0010<\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b$\u0010;R\u001c\u0010@\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b\"\u0010?¨\u0006A"}, d2 = {"Ll8a/s0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "b", "r", "state", "c", "l", "paymentMethod", "", "d", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "estimatedNextPaymentDate", "e", "billingCurrency", "q", "startDate", "g", "estimatedNextPaymentAmount", "Ll8a/u0;", "h", "Ll8a/u0;", "m", "()Ll8a/u0;", "paymentMethodDetails", "deactivationDate", "j", "deactivationReasonCode", "k", "expirationDate", "acceptanceExpirationDate", "Ll8a/w0;", "Ll8a/w0;", "p", "()Ll8a/w0;", "settings", "n", "frequency", "o", "period", "", "Ljava/util/Set;", "()Ljava/util/Set;", "relatedTransactions", "Ljo3/a;", "Ljo3/a;", "s", "()Ljo3/a;", "transactionLimit", "Ll8a/w;", "Ll8a/w;", "()Ll8a/w;", "paymentAmounts", "Ll8a/v;", "Ll8a/v;", "()Ll8a/v;", "nextPayment", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("estimatedNextPaymentDate")
    private final Long estimatedNextPaymentDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("billingCurrency")
    @NotNull
    private final String billingCurrency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedNextPaymentAmount")
    private final Long estimatedNextPaymentAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethodDetails")
    @NotNull
    private final u0 paymentMethodDetails;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("deactivationDate")
    private final Long deactivationDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("deactivationReasonCode")
    private final String deactivationReasonCode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("acceptanceExpirationDate")
    private final Long acceptanceExpirationDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("settings")
    private final w0 settings;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("relatedTransactions")
    private final Set<String> relatedTransactions;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionLimit")
    private final jo3.a transactionLimit;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAmounts")
    private final w paymentAmounts;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPayment")
    private final v nextPayment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAcceptanceExpirationDate() {
        return this.acceptanceExpirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillingCurrency() {
        return this.billingCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getDeactivationDate() {
        return this.deactivationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDeactivationReasonCode() {
        return this.deactivationReasonCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getEstimatedNextPaymentAmount() {
        return this.estimatedNextPaymentAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.id, s0Var.id) && Intrinsics.f(this.state, s0Var.state) && Intrinsics.f(this.paymentMethod, s0Var.paymentMethod) && Intrinsics.f(this.estimatedNextPaymentDate, s0Var.estimatedNextPaymentDate) && Intrinsics.f(this.billingCurrency, s0Var.billingCurrency) && Intrinsics.f(this.startDate, s0Var.startDate) && Intrinsics.f(this.estimatedNextPaymentAmount, s0Var.estimatedNextPaymentAmount) && Intrinsics.f(this.paymentMethodDetails, s0Var.paymentMethodDetails) && Intrinsics.f(this.deactivationDate, s0Var.deactivationDate) && Intrinsics.f(this.deactivationReasonCode, s0Var.deactivationReasonCode) && Intrinsics.f(this.expirationDate, s0Var.expirationDate) && Intrinsics.f(this.acceptanceExpirationDate, s0Var.acceptanceExpirationDate) && Intrinsics.f(this.settings, s0Var.settings) && Intrinsics.f(this.frequency, s0Var.frequency) && Intrinsics.f(this.period, s0Var.period) && Intrinsics.f(this.relatedTransactions, s0Var.relatedTransactions) && Intrinsics.f(this.transactionLimit, s0Var.transactionLimit) && Intrinsics.f(this.paymentAmounts, s0Var.paymentAmounts) && Intrinsics.f(this.nextPayment, s0Var.nextPayment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getEstimatedNextPaymentDate() {
        return this.estimatedNextPaymentDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.paymentMethod);
        Long l2 = this.estimatedNextPaymentDate;
        int iC2 = p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.billingCurrency);
        Long l3 = this.startDate;
        int iHashCode = (iC2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.estimatedNextPaymentAmount;
        int iHashCode2 = (this.paymentMethodDetails.hashCode() + ((iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31)) * 31;
        Long l5 = this.deactivationDate;
        int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.deactivationReasonCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l22 = this.expirationDate;
        int iHashCode5 = (iHashCode4 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.acceptanceExpirationDate;
        int iHashCode6 = (iHashCode5 + (l31 == null ? 0 : l31.hashCode())) * 31;
        w0 w0Var = this.settings;
        int iHashCode7 = (iHashCode6 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        String str2 = this.frequency;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set<String> set = this.relatedTransactions;
        int iHashCode10 = (iHashCode9 + (set == null ? 0 : set.hashCode())) * 31;
        jo3.a aVar = this.transactionLimit;
        int iHashCode11 = (iHashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        w wVar = this.paymentAmounts;
        int iHashCode12 = (iHashCode11 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        v vVar = this.nextPayment;
        return iHashCode12 + (vVar != null ? vVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final v getNextPayment() {
        return this.nextPayment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final w getPaymentAmounts() {
        return this.paymentAmounts;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final u0 getPaymentMethodDetails() {
        return this.paymentMethodDetails;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Set getRelatedTransactions() {
        return this.relatedTransactions;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final w0 getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jo3.a getTransactionLimit() {
        return this.transactionLimit;
    }
}
