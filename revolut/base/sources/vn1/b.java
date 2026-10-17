package vn1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0016"}, d2 = {"Lvn1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "paymentMethod", "Lvn1/b$b;", "b", "Lvn1/b$b;", "e", "()Lvn1/b$b;", "serviceProviderDto", "", "c", "Z", "()Z", "amountEditable", "allowScheduling", "allowRecurring", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("serviceProvider")
    @NotNull
    private final C1608b serviceProviderDto;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountEditable")
    private final boolean amountEditable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("allowScheduling")
    private final boolean allowScheduling;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("allowRecurring")
    private final boolean allowRecurring;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lvn1/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "billerCode", "", "b", "Z", "()Z", "icrn", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("billerCode")
        @NotNull
        private final String billerCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("icrn")
        private final boolean icrn;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBillerCode() {
            return this.billerCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIcrn() {
            return this.icrn;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.billerCode, aVar.billerCode) && this.icrn == aVar.icrn;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.icrn) + (this.billerCode.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: vn1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0015"}, d2 = {"Lvn1/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "name", "c", "logoUrl", "edt", "Lvn1/b$a;", "e", "Lvn1/b$a;", "f", "()Lvn1/b$a;", "paymentMethodDetails", "paymentMethod", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1608b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("logoUrl")
        private final String logoUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("edt")
        private final String edt;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("paymentMethodDetails")
        @NotNull
        private final a paymentMethodDetails;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("paymentMethod")
        private final String paymentMethod;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEdt() {
            return this.edt;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLogoUrl() {
            return this.logoUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPaymentMethod() {
            return this.paymentMethod;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1608b)) {
                return false;
            }
            C1608b c1608b = (C1608b) obj2;
            return Intrinsics.f(this.id, c1608b.id) && Intrinsics.f(this.name, c1608b.name) && Intrinsics.f(this.logoUrl, c1608b.logoUrl) && Intrinsics.f(this.edt, c1608b.edt) && Intrinsics.f(this.paymentMethodDetails, c1608b.paymentMethodDetails) && Intrinsics.f(this.paymentMethod, c1608b.paymentMethod);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final a getPaymentMethodDetails() {
            return this.paymentMethodDetails;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
            String str = this.logoUrl;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.edt;
            int iHashCode2 = (this.paymentMethodDetails.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.paymentMethod;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowRecurring() {
        return this.allowRecurring;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowScheduling() {
        return this.allowScheduling;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAmountEditable() {
        return this.amountEditable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C1608b getServiceProviderDto() {
        return this.serviceProviderDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.paymentMethod, bVar.paymentMethod) && Intrinsics.f(this.serviceProviderDto, bVar.serviceProviderDto) && this.amountEditable == bVar.amountEditable && this.allowScheduling == bVar.allowScheduling && this.allowRecurring == bVar.allowRecurring;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.allowRecurring) + j6.a.c(j6.a.c((this.serviceProviderDto.hashCode() + (this.paymentMethod.hashCode() * 31)) * 31, 31, this.amountEditable), 31, this.allowScheduling);
    }
}
