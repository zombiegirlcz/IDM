package kp1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\u0014\u0005\n\u0011\u000fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\u000f\u0010\"¨\u0006$"}, d2 = {"Lkp1/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "paymentMethod", "Ljo3/a;", "b", "Ljo3/a;", "i", "()Ljo3/a;", "totalAmount", "c", "amount", "d", "dueDate", "", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "amountEditable", "f", "minAmount", "maxAmount", "Lkp1/c$e;", "h", "Lkp1/c$e;", "()Lkp1/c$e;", "paymentMethodDetails", "Lkp1/c$b;", "Lkp1/c$b;", "()Lkp1/c$b;", "charges", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAmount")
    private final jo3.a totalAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dueDate")
    private final String dueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amountEditable")
    private final Boolean amountEditable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("minAmount")
    private final jo3.a minAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxAmount")
    private final jo3.a maxAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethodDetails")
    private final e paymentMethodDetails;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("charges")
    private final b charges;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0012"}, d2 = {"Lkp1/c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "f", "type", "c", "e", "taxId", "bankName", "bankNumber", "bankCode", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("taxId")
        private final String taxId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("bankName")
        private final String bankName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("bankNumber")
        private final String bankNumber;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("bankCode")
        private final String bankCode;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBankCode() {
            return this.bankCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBankNumber() {
            return this.bankNumber;
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
            return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.taxId, aVar.taxId) && Intrinsics.f(this.bankName, aVar.bankName) && Intrinsics.f(this.bankNumber, aVar.bankNumber) && Intrinsics.f(this.bankCode, aVar.bankCode);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.type;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.taxId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.bankName;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.bankNumber;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.bankCode;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lkp1/c$b;", "", "", "toString", "()Ljava/lang/String;", "Lkp1/c$d;", "a", "Lkp1/c$d;", "()Lkp1/c$d;", "fees", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("fees")
        private final d fees;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getFees() {
            return this.fees;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.fees, ((b) obj2).fees);
        }

        public final int hashCode() {
            d dVar = this.fees;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }
    }

    /* JADX INFO: renamed from: kp1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lkp1/c$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "value", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1062c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final jo3.a value;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1062c)) {
                return false;
            }
            C1062c c1062c = (C1062c) obj2;
            return Intrinsics.f(this.type, c1062c.type) && Intrinsics.f(this.value, c1062c.value);
        }

        public final int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            jo3.a aVar = this.value;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkp1/c$d;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "total", "", "Lkp1/c$c;", "Ljava/util/List;", "()Ljava/util/List;", "breakdown", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        private final jo3.a total;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("breakdown")
        private final List<C1062c> breakdown;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getBreakdown() {
            return this.breakdown;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return Intrinsics.f(this.total, dVar.total) && Intrinsics.f(this.breakdown, dVar.breakdown);
        }

        public final int hashCode() {
            jo3.a aVar = this.total;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            List<C1062c> list = this.breakdown;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0016"}, d2 = {"Lkp1/c$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "type", "b", "billNumber", "Lkp1/c$a;", "c", "Lkp1/c$a;", "()Lkp1/c$a;", "beneficiary", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "canBePaidNow", "nextAvailableDateForPayment", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("billNumber")
        private final String billNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("beneficiary")
        private final a beneficiary;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("canBePaidNow")
        private final Boolean canBePaidNow;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("nextAvailableDateForPayment")
        private final String nextAvailableDateForPayment;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getBeneficiary() {
            return this.beneficiary;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBillNumber() {
            return this.billNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getCanBePaidNow() {
            return this.canBePaidNow;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNextAvailableDateForPayment() {
            return this.nextAvailableDateForPayment;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.billNumber, eVar.billNumber) && Intrinsics.f(this.beneficiary, eVar.beneficiary) && Intrinsics.f(this.canBePaidNow, eVar.canBePaidNow) && Intrinsics.f(this.nextAvailableDateForPayment, eVar.nextAvailableDateForPayment);
        }

        public final int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.billNumber;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            a aVar = this.beneficiary;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Boolean bool = this.canBePaidNow;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.nextAvailableDateForPayment;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAmountEditable() {
        return this.amountEditable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMaxAmount() {
        return this.maxAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.paymentMethod, cVar.paymentMethod) && Intrinsics.f(this.totalAmount, cVar.totalAmount) && Intrinsics.f(this.amount, cVar.amount) && Intrinsics.f(this.dueDate, cVar.dueDate) && Intrinsics.f(this.amountEditable, cVar.amountEditable) && Intrinsics.f(this.minAmount, cVar.minAmount) && Intrinsics.f(this.maxAmount, cVar.maxAmount) && Intrinsics.f(this.paymentMethodDetails, cVar.paymentMethodDetails) && Intrinsics.f(this.charges, cVar.charges);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e getPaymentMethodDetails() {
        return this.paymentMethodDetails;
    }

    public final int hashCode() {
        String str = this.paymentMethod;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jo3.a aVar = this.totalAmount;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.amount;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str2 = this.dueDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.amountEditable;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        jo3.a aVar3 = this.minAmount;
        int iHashCode6 = (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.maxAmount;
        int iHashCode7 = (iHashCode6 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        e eVar = this.paymentMethodDetails;
        int iHashCode8 = (iHashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b bVar = this.charges;
        return iHashCode8 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getTotalAmount() {
        return this.totalAmount;
    }
}
