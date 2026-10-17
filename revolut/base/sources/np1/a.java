package np1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0019\u0010\u0012R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u0005\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(¨\u0006*"}, d2 = {"Lnp1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "paymentMethod", "b", "getPaymentType", "paymentType", "c", "getEdt", "edt", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "amount", "e", "i", "totalAmount", "f", "min", "getMax", "max", "", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "allowScheduling", "allowRecurring", "j", "label", "k", "billId", "Lnp1/a$a;", "l", "Lnp1/a$a;", "()Lnp1/a$a;", "paymentMethodDetails", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("paymentMethod")
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("type")
    private final String paymentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("edt")
    private final String edt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("totalAmount")
    private final jo3.a totalAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("min")
    private final jo3.a min;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("max")
    private final jo3.a max;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("allowScheduling")
    private final Boolean allowScheduling;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("allowRecurring")
    private final Boolean allowRecurring;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("label")
    private final String label;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @b("billId")
    private final String billId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @b("paymentMethodDetails")
    private final C1215a paymentMethodDetails;

    /* JADX INFO: renamed from: np1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lnp1/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "billIdentifier", "c", "debtId", "amountType", "Ljo3/a;", "d", "Ljo3/a;", "e", "()Ljo3/a;", "minAmount", "maxAmount", "f", "productId", "g", "productLabel", "h", "referenceValue", "i", "serviceProviderId", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1215a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("billIdentifier")
        private final String billIdentifier;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("debtId")
        private final String debtId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("amountType")
        private final String amountType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @b("minAmount")
        private final jo3.a minAmount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @b("maxAmount")
        private final jo3.a maxAmount;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @b("productId")
        private final String productId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @b("productLabel")
        private final String productLabel;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @b("referenceValue")
        private final String referenceValue;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @b("serviceProviderId")
        private final String serviceProviderId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAmountType() {
            return this.amountType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBillIdentifier() {
            return this.billIdentifier;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDebtId() {
            return this.debtId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getMaxAmount() {
            return this.maxAmount;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getMinAmount() {
            return this.minAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1215a)) {
                return false;
            }
            C1215a c1215a = (C1215a) obj2;
            return Intrinsics.f(this.billIdentifier, c1215a.billIdentifier) && Intrinsics.f(this.debtId, c1215a.debtId) && Intrinsics.f(this.amountType, c1215a.amountType) && Intrinsics.f(this.minAmount, c1215a.minAmount) && Intrinsics.f(this.maxAmount, c1215a.maxAmount) && Intrinsics.f(this.productId, c1215a.productId) && Intrinsics.f(this.productLabel, c1215a.productLabel) && Intrinsics.f(this.referenceValue, c1215a.referenceValue) && Intrinsics.f(this.serviceProviderId, c1215a.serviceProviderId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getProductLabel() {
            return this.productLabel;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getReferenceValue() {
            return this.referenceValue;
        }

        public final int hashCode() {
            String str = this.billIdentifier;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.debtId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.amountType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            jo3.a aVar = this.minAmount;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo3.a aVar2 = this.maxAmount;
            int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            String str4 = this.productId;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.productLabel;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.referenceValue;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.serviceProviderId;
            return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getServiceProviderId() {
            return this.serviceProviderId;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAllowRecurring() {
        return this.allowRecurring;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAllowScheduling() {
        return this.allowScheduling;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBillId() {
        return this.billId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.paymentMethod, aVar.paymentMethod) && Intrinsics.f(this.paymentType, aVar.paymentType) && Intrinsics.f(this.edt, aVar.edt) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.totalAmount, aVar.totalAmount) && Intrinsics.f(this.min, aVar.min) && Intrinsics.f(this.max, aVar.max) && Intrinsics.f(this.allowScheduling, aVar.allowScheduling) && Intrinsics.f(this.allowRecurring, aVar.allowRecurring) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.billId, aVar.billId) && Intrinsics.f(this.paymentMethodDetails, aVar.paymentMethodDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C1215a getPaymentMethodDetails() {
        return this.paymentMethodDetails;
    }

    public final int hashCode() {
        String str = this.paymentMethod;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.edt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jo3.a aVar = this.amount;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.totalAmount;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.min;
        int iHashCode6 = (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.max;
        int iHashCode7 = (iHashCode6 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        Boolean bool = this.allowScheduling;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.allowRecurring;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.label;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billId;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C1215a c1215a = this.paymentMethodDetails;
        return iHashCode11 + (c1215a != null ? c1215a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getTotalAmount() {
        return this.totalAmount;
    }
}
