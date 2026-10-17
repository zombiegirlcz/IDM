package pp1;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lpp1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "Lpp1/f;", "b", "Lpp1/f;", "getPayer", "()Lpp1/f;", "payer", "Ljava/util/Date;", "c", "Ljava/util/Date;", "getReferenceDate", "()Ljava/util/Date;", "referenceDate", "d", "getDueDate", "dueDate", "e", "getPaymentDate", "paymentDate", "", "f", "Ljava/lang/Long;", "getReferenceNumber", "()Ljava/lang/Long;", "referenceNumber", "g", "getTreasuryRevenueCode", "treasuryRevenueCode", "Ljo3/a;", "h", "Ljo3/a;", "getInterest", "()Ljo3/a;", "interest", "i", "getFine", "fine", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("payer")
    private final f payer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("referenceDate")
    private final Date referenceDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dueDate")
    private final Date dueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentDate")
    private final Date paymentDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("referenceNumber")
    private final Long referenceNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("treasuryRevenueCode")
    private final String treasuryRevenueCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("interest")
    private final jo3.a interest;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("fine")
    private final jo3.a fine;

    public a(String str, f fVar, Date date, Date date2, Date date3, Long l2, String str2, jo3.a aVar, jo3.a aVar2) {
        this.type = str;
        this.payer = fVar;
        this.referenceDate = date;
        this.dueDate = date2;
        this.paymentDate = date3;
        this.referenceNumber = l2;
        this.treasuryRevenueCode = str2;
        this.interest = aVar;
        this.fine = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.payer, aVar.payer) && Intrinsics.f(this.referenceDate, aVar.referenceDate) && Intrinsics.f(this.dueDate, aVar.dueDate) && Intrinsics.f(this.paymentDate, aVar.paymentDate) && Intrinsics.f(this.referenceNumber, aVar.referenceNumber) && Intrinsics.f(this.treasuryRevenueCode, aVar.treasuryRevenueCode) && Intrinsics.f(this.interest, aVar.interest) && Intrinsics.f(this.fine, aVar.fine);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.payer;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Date date = this.referenceDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.dueDate;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.paymentDate;
        int iHashCode5 = (iHashCode4 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Long l2 = this.referenceNumber;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.treasuryRevenueCode;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.a aVar = this.interest;
        int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.fine;
        return iHashCode8 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
