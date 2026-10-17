package kp1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\r\u0010\u0005\t\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\t\u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0010\u0010%R\u001c\u0010+\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b\u001b\u0010.R\u001c\u00101\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b0\u0010\u0012¨\u00062"}, d2 = {"Lkp1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "paymentMethod", "b", "l", "type", "c", "e", "digitableLine", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "canBePaidNow", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "f", "i", "originalAmount", "g", "dueDate", "h", "nextAvailableDateForPayment", "Lkp1/b$a;", "Lkp1/b$a;", "()Lkp1/b$a;", "beneficiary", "Lkp1/b$b;", "Lkp1/b$b;", "()Lkp1/b$b;", "darfDetails", "Lkp1/b$e;", "k", "Lkp1/b$e;", "()Lkp1/b$e;", "thresholds", "Lkp1/b$d;", "Lkp1/b$d;", "()Lkp1/b$d;", "fees", "m", "isAmountOverridable", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("digitableLine")
    private final String digitableLine;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("canBePaidNow")
    private final Boolean canBePaidNow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("originalAmount")
    private final jo3.a originalAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final String dueDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextAvailableDateForPayment")
    private final String nextAvailableDateForPayment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("beneficiary")
    private final a beneficiary;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("darfDetails")
    private final C1061b darfDetails;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("thresholds")
    private final e thresholds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final d fees;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("isAmountOverridable")
    private final Boolean isAmountOverridable;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0012"}, d2 = {"Lkp1/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "c", "bankName", "bankISPB", "bankCode", "e", "f", "type", "taxId", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("bankName")
        private final String bankName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("bankISPB")
        private final String bankISPB;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("bankCode")
        private final String bankCode;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("taxId")
        private final String taxId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBankCode() {
            return this.bankCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBankISPB() {
            return this.bankISPB;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTaxId() {
            return this.taxId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.bankName, aVar.bankName) && Intrinsics.f(this.bankISPB, aVar.bankISPB) && Intrinsics.f(this.bankCode, aVar.bankCode) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.taxId, aVar.taxId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bankISPB;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.bankCode;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.type;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.taxId;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: kp1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u000f\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\n\u0010\u001e¨\u0006!"}, d2 = {"Lkp1/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "type", "Lkp1/b$c;", "b", "Lkp1/b$c;", "d", "()Lkp1/b$c;", "payer", "c", "f", "referenceDate", "dueDate", "e", "paymentDate", "", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "referenceNumber", "h", "treasuryRevenueCode", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "interest", "fine", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1061b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("payer")
        private final c payer;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("referenceDate")
        private final String referenceDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("dueDate")
        private final String dueDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("paymentDate")
        private final String paymentDate;

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

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDueDate() {
            return this.dueDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getFine() {
            return this.fine;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getInterest() {
            return this.interest;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getPayer() {
            return this.payer;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPaymentDate() {
            return this.paymentDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1061b)) {
                return false;
            }
            C1061b c1061b = (C1061b) obj2;
            return Intrinsics.f(this.type, c1061b.type) && Intrinsics.f(this.payer, c1061b.payer) && Intrinsics.f(this.referenceDate, c1061b.referenceDate) && Intrinsics.f(this.dueDate, c1061b.dueDate) && Intrinsics.f(this.paymentDate, c1061b.paymentDate) && Intrinsics.f(this.referenceNumber, c1061b.referenceNumber) && Intrinsics.f(this.treasuryRevenueCode, c1061b.treasuryRevenueCode) && Intrinsics.f(this.interest, c1061b.interest) && Intrinsics.f(this.fine, c1061b.fine);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getReferenceDate() {
            return this.referenceDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Long getReferenceNumber() {
            return this.referenceNumber;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTreasuryRevenueCode() {
            return this.treasuryRevenueCode;
        }

        public final int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            c cVar = this.payer;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str2 = this.referenceDate;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dueDate;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.paymentDate;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l2 = this.referenceNumber;
            int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str5 = this.treasuryRevenueCode;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            jo3.a aVar = this.interest;
            int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo3.a aVar2 = this.fine;
            return iHashCode8 + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lkp1/b$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "name", "b", "taxId", "c", "type", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("taxId")
        private final String taxId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTaxId() {
            return this.taxId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.taxId, cVar.taxId) && Intrinsics.f(this.type, cVar.type);
        }

        public final int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.taxId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.type;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u0010"}, d2 = {"Lkp1/b$d;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "interest", "b", "fine", "discount", "d", "total", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("interest")
        private final jo3.a interest;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fine")
        private final jo3.a fine;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("discount")
        private final jo3.a discount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("totalFees")
        private final jo3.a total;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getDiscount() {
            return this.discount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getFine() {
            return this.fine;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getInterest() {
            return this.interest;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getTotal() {
            return this.total;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.interest, dVar.interest) && Intrinsics.f(this.fine, dVar.fine) && Intrinsics.f(this.discount, dVar.discount) && Intrinsics.f(this.total, dVar.total);
        }

        public final int hashCode() {
            jo3.a aVar = this.interest;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            jo3.a aVar2 = this.fine;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            jo3.a aVar3 = this.discount;
            int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            jo3.a aVar4 = this.total;
            return iHashCode3 + (aVar4 != null ? aVar4.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lkp1/b$e;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "minAmount", "maxAmount", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("minAmount")
        private final jo3.a minAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("maxAmount")
        private final jo3.a maxAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getMaxAmount() {
            return this.maxAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getMinAmount() {
            return this.minAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.minAmount, eVar.minAmount) && Intrinsics.f(this.maxAmount, eVar.maxAmount);
        }

        public final int hashCode() {
            jo3.a aVar = this.minAmount;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            jo3.a aVar2 = this.maxAmount;
            return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getBeneficiary() {
        return this.beneficiary;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCanBePaidNow() {
        return this.canBePaidNow;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C1061b getDarfDetails() {
        return this.darfDetails;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDigitableLine() {
        return this.digitableLine;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.paymentMethod, bVar.paymentMethod) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.digitableLine, bVar.digitableLine) && Intrinsics.f(this.canBePaidNow, bVar.canBePaidNow) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.originalAmount, bVar.originalAmount) && Intrinsics.f(this.dueDate, bVar.dueDate) && Intrinsics.f(this.nextAvailableDateForPayment, bVar.nextAvailableDateForPayment) && Intrinsics.f(this.beneficiary, bVar.beneficiary) && Intrinsics.f(this.darfDetails, bVar.darfDetails) && Intrinsics.f(this.thresholds, bVar.thresholds) && Intrinsics.f(this.fees, bVar.fees) && Intrinsics.f(this.isAmountOverridable, bVar.isAmountOverridable);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getNextAvailableDateForPayment() {
        return this.nextAvailableDateForPayment;
    }

    public final int hashCode() {
        String str = this.paymentMethod;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.digitableLine;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canBePaidNow;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        jo3.a aVar = this.amount;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.originalAmount;
        int iHashCode6 = (iHashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str4 = this.dueDate;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nextAvailableDateForPayment;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        a aVar3 = this.beneficiary;
        int iHashCode9 = (iHashCode8 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        C1061b c1061b = this.darfDetails;
        int iHashCode10 = (iHashCode9 + (c1061b == null ? 0 : c1061b.hashCode())) * 31;
        e eVar = this.thresholds;
        int iHashCode11 = (iHashCode10 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.fees;
        int iHashCode12 = (iHashCode11 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Boolean bool2 = this.isAmountOverridable;
        return iHashCode12 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getOriginalAmount() {
        return this.originalAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e getThresholds() {
        return this.thresholds;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getIsAmountOverridable() {
        return this.isAmountOverridable;
    }
}
