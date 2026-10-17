package pac;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 P2\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010 \u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0018\u0010-R\u001c\u00102\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b\u0013\u00101R\u001a\u00103\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u00109\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010:\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b5\u00108R\u001c\u0010>\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u00108R\u001a\u0010C\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\bB\u00108R\u001a\u0010E\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\bD\u00108R\u001a\u0010F\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\b\u001c\u00108R\u001a\u0010G\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b?\u00108R\"\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010%\u001a\u0004\b\u000f\u0010'R\"\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b$\u0010'R\u001c\u0010O\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010M\u001a\u0004\b!\u0010N¨\u0006Q"}, d2 = {"Lpac/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "orderId", "b", "m", "orderNumber", "c", "p", "paymentDate", "d", "l", "orderManagementUrl", "", "e", "Z", "w", "()Z", "supportsDeliveries", "f", "s", "receiptUrl", "Lpac/l;", "g", "Lpac/l;", "j", "()Lpac/l;", "merchant", "h", "customerFullName", "", "i", "Ljava/util/List;", "y", "()Ljava/util/List;", "transactionIds", "r", "pointsTransactionIds", "Lpac/m$b;", "Lpac/m$b;", "()Lpac/m$b;", "deliveryMethod", "Lno3/b;", "Lno3/b;", "()Lno3/b;", "deliveryAddress", "currency", "", "n", "J", "o", "()J", "paidAmount", "orderTotalAmount", "Ljava/lang/Long;", "u", "()Ljava/lang/Long;", "shippingAmount", "q", "t", "serviceChargeTotalAmount", "x", "taxTotalAmount", "v", "subtotalAmount", "discountTotalAmount", "pointsRedemptionAmount", "Lpac/f;", "deliveries", "Lpac/i;", "lineItems", "Loac/a;", "Loac/a;", "()Loac/a;", "flightBooking", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderId")
    @NotNull
    private final String orderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderNumber")
    private final String orderNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentDate")
    @NotNull
    private final String paymentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("orderManagementUrl")
    private final String orderManagementUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("supportsDeliveries")
    private final boolean supportsDeliveries;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("receiptUrl")
    private final String receiptUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantData")
    @NotNull
    private final l merchant;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("customerFullName")
    private final String customerFullName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("transactionIds")
    private final List<String> transactionIds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsTransactionIds")
    private final List<String> pointsTransactionIds;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("deliveryMethod")
    private final b deliveryMethod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryAddress")
    private final no3.b deliveryAddress;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("paidAmount")
    private final long paidAmount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("orderTotalAmount")
    private final long orderTotalAmount;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("shippingAmount")
    private final Long shippingAmount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("serviceChargeTotalAmount")
    private final long serviceChargeTotalAmount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxTotalAmount")
    private final long taxTotalAmount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtotalAmount")
    private final long subtotalAmount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("discountTotalAmount")
    private final long discountTotalAmount;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("pointsRedemptionAmount")
    private final long pointsRedemptionAmount;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("deliveries")
    private final List<f> deliveries;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("lineItems")
    private final List<i> lineItems;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("flightBooking")
    private final oac.a flightBooking;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0012"}, d2 = {"Lpac/m$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "label", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "description", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        @NotNull
        private final jo3.a amount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.label, bVar.label) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.description, bVar.description);
        }

        public final int hashCode() {
            int iJ = v7.j(this.amount, p.a.c(this.id.hashCode() * 31, 31, this.label), 31);
            String str = this.description;
            return iJ + (str == null ? 0 : str.hashCode());
        }
    }

    public m(String orderId, String str, String paymentDate, String str2, boolean z, String str3, l merchant, String str4, List list, List list2, b bVar, no3.b bVar2, String currency, long j2, long j3, Long l2, long j5, long j16, long j22, long j42, long j46, List list3, List list4, oac.a aVar) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.orderId = orderId;
        this.orderNumber = str;
        this.paymentDate = paymentDate;
        this.orderManagementUrl = str2;
        this.supportsDeliveries = z;
        this.receiptUrl = str3;
        this.merchant = merchant;
        this.customerFullName = str4;
        this.transactionIds = list;
        this.pointsTransactionIds = list2;
        this.deliveryMethod = bVar;
        this.deliveryAddress = bVar2;
        this.currency = currency;
        this.paidAmount = j2;
        this.orderTotalAmount = j3;
        this.shippingAmount = l2;
        this.serviceChargeTotalAmount = j5;
        this.taxTotalAmount = j16;
        this.subtotalAmount = j22;
        this.discountTotalAmount = j42;
        this.pointsRedemptionAmount = j46;
        this.deliveries = list3;
        this.lineItems = list4;
        this.flightBooking = aVar;
    }

    public static m a(m mVar, List list) {
        String orderId = mVar.orderId;
        String str = mVar.orderNumber;
        String paymentDate = mVar.paymentDate;
        String str2 = mVar.orderManagementUrl;
        boolean z = mVar.supportsDeliveries;
        String str3 = mVar.receiptUrl;
        l merchant = mVar.merchant;
        String str4 = mVar.customerFullName;
        List<String> list2 = mVar.transactionIds;
        List<String> list3 = mVar.pointsTransactionIds;
        b bVar = mVar.deliveryMethod;
        no3.b bVar2 = mVar.deliveryAddress;
        String currency = mVar.currency;
        long j2 = mVar.paidAmount;
        long j3 = mVar.orderTotalAmount;
        Long l2 = mVar.shippingAmount;
        long j5 = mVar.serviceChargeTotalAmount;
        long j16 = mVar.taxTotalAmount;
        long j22 = mVar.subtotalAmount;
        long j42 = mVar.discountTotalAmount;
        long j46 = mVar.pointsRedemptionAmount;
        List<i> list4 = mVar.lineItems;
        oac.a aVar = mVar.flightBooking;
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new m(orderId, str, paymentDate, str2, z, str3, merchant, str4, list2, list3, bVar, bVar2, currency, j2, j3, l2, j5, j16, j22, j42, j46, list, list4, aVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCustomerFullName() {
        return this.customerFullName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getDeliveries() {
        return this.deliveries;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final no3.b getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.orderId, mVar.orderId) && Intrinsics.f(this.orderNumber, mVar.orderNumber) && Intrinsics.f(this.paymentDate, mVar.paymentDate) && Intrinsics.f(this.orderManagementUrl, mVar.orderManagementUrl) && this.supportsDeliveries == mVar.supportsDeliveries && Intrinsics.f(this.receiptUrl, mVar.receiptUrl) && Intrinsics.f(this.merchant, mVar.merchant) && Intrinsics.f(this.customerFullName, mVar.customerFullName) && Intrinsics.f(this.transactionIds, mVar.transactionIds) && Intrinsics.f(this.pointsTransactionIds, mVar.pointsTransactionIds) && Intrinsics.f(this.deliveryMethod, mVar.deliveryMethod) && Intrinsics.f(this.deliveryAddress, mVar.deliveryAddress) && Intrinsics.f(this.currency, mVar.currency) && this.paidAmount == mVar.paidAmount && this.orderTotalAmount == mVar.orderTotalAmount && Intrinsics.f(this.shippingAmount, mVar.shippingAmount) && this.serviceChargeTotalAmount == mVar.serviceChargeTotalAmount && this.taxTotalAmount == mVar.taxTotalAmount && this.subtotalAmount == mVar.subtotalAmount && this.discountTotalAmount == mVar.discountTotalAmount && this.pointsRedemptionAmount == mVar.pointsRedemptionAmount && Intrinsics.f(this.deliveries, mVar.deliveries) && Intrinsics.f(this.lineItems, mVar.lineItems) && Intrinsics.f(this.flightBooking, mVar.flightBooking);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getDiscountTotalAmount() {
        return this.discountTotalAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final oac.a getFlightBooking() {
        return this.flightBooking;
    }

    public final int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        String str = this.orderNumber;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.paymentDate);
        String str2 = this.orderManagementUrl;
        int iC2 = j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.supportsDeliveries);
        String str3 = this.receiptUrl;
        int iHashCode2 = (this.merchant.hashCode() + ((iC2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.customerFullName;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.transactionIds;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.pointsTransactionIds;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        b bVar = this.deliveryMethod;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        no3.b bVar2 = this.deliveryAddress;
        int iC3 = a0.d.c(a0.d.c(p.a.c((iHashCode6 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.currency), 31, this.paidAmount), 31, this.orderTotalAmount);
        Long l2 = this.shippingAmount;
        int iC4 = a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c((iC3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.serviceChargeTotalAmount), 31, this.taxTotalAmount), 31, this.subtotalAmount), 31, this.discountTotalAmount), 31, this.pointsRedemptionAmount);
        List<f> list3 = this.deliveries;
        int iHashCode7 = (iC4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<i> list4 = this.lineItems;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        oac.a aVar = this.flightBooking;
        return iHashCode8 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getLineItems() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final l getMerchant() {
        return this.merchant;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getOrderManagementUrl() {
        return this.orderManagementUrl;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getOrderTotalAmount() {
        return this.orderTotalAmount;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getPaidAmount() {
        return this.paidAmount;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getPointsRedemptionAmount() {
        return this.pointsRedemptionAmount;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final List getPointsTransactionIds() {
        return this.pointsTransactionIds;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getServiceChargeTotalAmount() {
        return this.serviceChargeTotalAmount;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Long getShippingAmount() {
        return this.shippingAmount;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getSubtotalAmount() {
        return this.subtotalAmount;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getSupportsDeliveries() {
        return this.supportsDeliveries;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getTaxTotalAmount() {
        return this.taxTotalAmount;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final List getTransactionIds() {
        return this.transactionIds;
    }
}
