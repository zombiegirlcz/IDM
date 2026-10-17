package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\f\u0010!R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\t\u0010&R\u001c\u0010-\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b6\u0010\u0004R\u001c\u0010<\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b\u0019\u0010;R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b9\u0010\u0011R\u001c\u0010D\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010B\u001a\u0004\b4\u0010CR\u001c\u0010E\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010B\u001a\u0004\b=\u0010C¨\u0006F"}, d2 = {"Ll8a/f0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "country", "b", "l", "implementation", "c", "n", "message", "Ll8a/z;", "Ll8a/z;", "()Ll8a/z;", "amount", "Ll8a/c0;", "e", "Ll8a/c0;", "()Ll8a/c0;", "creditor", "Ll8a/p0;", "f", "Ll8a/p0;", "t", "()Ll8a/p0;", "withdrawal", "Ll8a/b0;", "g", "Ll8a/b0;", "()Ll8a/b0;", "change", "Ll8a/a0;", "h", "Ll8a/a0;", "()Ll8a/a0;", "bill", "Ll8a/l0;", "i", "Ll8a/l0;", "r", "()Ll8a/l0;", "references", "j", "q", "recurrenceId", "k", "expectedStartDate", "endDate", "m", "frequency", "s", "retryPolicy", "Ll8a/e0;", "o", "Ll8a/e0;", "()Ll8a/e0;", "debtor", "p", "documentNumber", "documentDescription", "minimumAmount", "Ll8a/d0;", "Ll8a/d0;", "()Ll8a/d0;", "instantPayment", "recurrence", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("implementation")
    private final String implementation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    private final z amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("creditor")
    private final c0 creditor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("withdraw")
    private final p0 withdrawal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("change")
    private final b0 change;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("bill")
    private final a0 bill;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("references")
    private final l0 references;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurrenceId")
    private final String recurrenceId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("expectedStartDate")
    private final String expectedStartDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("retryPolicy")
    private final String retryPolicy;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("debtor")
    private final e0 debtor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentNumber")
    private final String documentNumber;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentDescription")
    private final String documentDescription;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumAmount")
    private final z minimumAmount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("instantPayment")
    private final d0 instantPayment;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurrence")
    private final d0 recurrence;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a0 getBill() {
        return this.bill;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getChange() {
        return this.change;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c0 getCreditor() {
        return this.creditor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.country, f0Var.country) && Intrinsics.f(this.implementation, f0Var.implementation) && Intrinsics.f(this.message, f0Var.message) && Intrinsics.f(this.amount, f0Var.amount) && Intrinsics.f(this.creditor, f0Var.creditor) && Intrinsics.f(this.withdrawal, f0Var.withdrawal) && Intrinsics.f(this.change, f0Var.change) && Intrinsics.f(this.bill, f0Var.bill) && Intrinsics.f(this.references, f0Var.references) && Intrinsics.f(this.recurrenceId, f0Var.recurrenceId) && Intrinsics.f(this.expectedStartDate, f0Var.expectedStartDate) && Intrinsics.f(this.endDate, f0Var.endDate) && Intrinsics.f(this.frequency, f0Var.frequency) && Intrinsics.f(this.retryPolicy, f0Var.retryPolicy) && Intrinsics.f(this.debtor, f0Var.debtor) && Intrinsics.f(this.documentNumber, f0Var.documentNumber) && Intrinsics.f(this.documentDescription, f0Var.documentDescription) && Intrinsics.f(this.minimumAmount, f0Var.minimumAmount) && Intrinsics.f(this.instantPayment, f0Var.instantPayment) && Intrinsics.f(this.recurrence, f0Var.recurrence);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e0 getDebtor() {
        return this.debtor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final int hashCode() {
        String str = this.country;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.implementation;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        z zVar = this.amount;
        int iHashCode4 = (iHashCode3 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        c0 c0Var = this.creditor;
        int iHashCode5 = (iHashCode4 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        p0 p0Var = this.withdrawal;
        int iHashCode6 = (iHashCode5 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        b0 b0Var = this.change;
        int iHashCode7 = (iHashCode6 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        a0 a0Var = this.bill;
        int iHashCode8 = (iHashCode7 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        l0 l0Var = this.references;
        int iHashCode9 = (iHashCode8 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str4 = this.recurrenceId;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expectedStartDate;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endDate;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.frequency;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.retryPolicy;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        e0 e0Var = this.debtor;
        int iHashCode15 = (iHashCode14 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        String str9 = this.documentNumber;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.documentDescription;
        int iHashCode17 = (iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        z zVar2 = this.minimumAmount;
        int iHashCode18 = (iHashCode17 + (zVar2 == null ? 0 : zVar2.hashCode())) * 31;
        d0 d0Var = this.instantPayment;
        int iHashCode19 = (iHashCode18 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        d0 d0Var2 = this.recurrence;
        return iHashCode19 + (d0Var2 != null ? d0Var2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getExpectedStartDate() {
        return this.expectedStartDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getImplementation() {
        return this.implementation;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final d0 getInstantPayment() {
        return this.instantPayment;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final z getMinimumAmount() {
        return this.minimumAmount;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final d0 getRecurrence() {
        return this.recurrence;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getRecurrenceId() {
        return this.recurrenceId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final l0 getReferences() {
        return this.references;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getRetryPolicy() {
        return this.retryPolicy;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final p0 getWithdrawal() {
        return this.withdrawal;
    }
}
