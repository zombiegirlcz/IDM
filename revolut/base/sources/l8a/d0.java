package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b\u0016\u0010(R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b,\u0010\u000eR\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b*\u0010\u0004¨\u00060"}, d2 = {"Ll8a/d0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "country", "b", "k", "implementation", "Ll8a/z;", "Ll8a/z;", "()Ll8a/z;", "amount", "Ll8a/c0;", "d", "Ll8a/c0;", "()Ll8a/c0;", "creditor", "Ll8a/a0;", "e", "Ll8a/a0;", "()Ll8a/a0;", "bill", "f", "n", "recurrenceId", "g", "i", "expectedStartDate", "h", "endDate", "j", "frequency", "o", "retryPolicy", "Ll8a/e0;", "Ll8a/e0;", "()Ll8a/e0;", "debtor", "l", "documentNumber", "m", "documentDescription", "minimumAmount", "message", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("implementation")
    private final String implementation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final z amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("creditor")
    private final c0 creditor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bill")
    private final a0 bill;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recurrenceId")
    private final String recurrenceId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("expectedStartDate")
    private final String expectedStartDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("retryPolicy")
    private final String retryPolicy;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("debtor")
    private final e0 debtor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentNumber")
    private final String documentNumber;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentDescription")
    private final String documentDescription;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumAmount")
    private final z minimumAmount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a0 getBill() {
        return this.bill;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c0 getCreditor() {
        return this.creditor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0 getDebtor() {
        return this.debtor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.country, d0Var.country) && Intrinsics.f(this.implementation, d0Var.implementation) && Intrinsics.f(this.amount, d0Var.amount) && Intrinsics.f(this.creditor, d0Var.creditor) && Intrinsics.f(this.bill, d0Var.bill) && Intrinsics.f(this.recurrenceId, d0Var.recurrenceId) && Intrinsics.f(this.expectedStartDate, d0Var.expectedStartDate) && Intrinsics.f(this.endDate, d0Var.endDate) && Intrinsics.f(this.frequency, d0Var.frequency) && Intrinsics.f(this.retryPolicy, d0Var.retryPolicy) && Intrinsics.f(this.debtor, d0Var.debtor) && Intrinsics.f(this.documentNumber, d0Var.documentNumber) && Intrinsics.f(this.documentDescription, d0Var.documentDescription) && Intrinsics.f(this.minimumAmount, d0Var.minimumAmount) && Intrinsics.f(this.message, d0Var.message);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final int hashCode() {
        String str = this.country;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.implementation;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        z zVar = this.amount;
        int iHashCode3 = (iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        c0 c0Var = this.creditor;
        int iHashCode4 = (iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        a0 a0Var = this.bill;
        int iHashCode5 = (iHashCode4 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        String str3 = this.recurrenceId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expectedStartDate;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endDate;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.frequency;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.retryPolicy;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        e0 e0Var = this.debtor;
        int iHashCode11 = (iHashCode10 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        String str8 = this.documentNumber;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.documentDescription;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        z zVar2 = this.minimumAmount;
        int iHashCode14 = (iHashCode13 + (zVar2 == null ? 0 : zVar2.hashCode())) * 31;
        String str10 = this.message;
        return iHashCode14 + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getExpectedStartDate() {
        return this.expectedStartDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getImplementation() {
        return this.implementation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final z getMinimumAmount() {
        return this.minimumAmount;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getRecurrenceId() {
        return this.recurrenceId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRetryPolicy() {
        return this.retryPolicy;
    }
}
