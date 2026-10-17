package lt6;

import com.revolut.feature.freelancer.impl.network.models.k;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 H2\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001cR\u001c\u0010$\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b#\u0010\u001cR\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0012\u0010-R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\"\u00108\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00106\u001a\u0004\b\u001e\u00107R\"\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b+\u00107R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010<\u001a\u0004\b\u001a\u0010=R\u001c\u0010B\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010@\u001a\u0004\b\r\u0010AR\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010G\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\b%\u0010F¨\u0006I"}, d2 = {"Llt6/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "id", "b", "o", "state", "", "c", "J", "e", "()J", "createdDate", "d", "Ljava/lang/Long;", "s", "()Ljava/lang/Long;", "updatedDate", "n", "settleOn", "Ljo3/a;", "f", "Ljo3/a;", "()Ljo3/a;", "amount", "g", "q", "tipAmount", "p", "surchargeAmount", "i", "netAmount", "j", "r", "type", "k", "paymentMethod", "Lkt6/a;", "l", "Lkt6/a;", "()Lkt6/a;", "card", "Llt6/e;", "m", "Llt6/e;", "()Llt6/e;", "sepaDd", "", "Llt6/c;", "Ljava/util/List;", "()Ljava/util/List;", "fees", "Llt6/d;", "rollingReserves", "Llt6/a;", "Llt6/a;", "()Llt6/a;", "customer", "Lcom/revolut/feature/freelancer/impl/network/models/k;", "Lcom/revolut/feature/freelancer/impl/network/models/k;", "()Lcom/revolut/feature/freelancer/impl/network/models/k;", "billingAddress", "acquiringReferenceNumber", "Llt6/b$b;", "Llt6/b$b;", "()Llt6/b$b;", "order", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final Long updatedDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("settleOn")
    private final Long settleOn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("tipAmount")
    private final jo3.a tipAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("surchargeAmount")
    private final jo3.a surchargeAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("netAmount")
    private final jo3.a netAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("card")
    private final kt6.a card;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("sepaDd")
    private final e sepaDd;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("feeBreakdown")
    private final List<c> fees;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("rollingReserves")
    private final List<d> rollingReserves;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("customer")
    private final a customer;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingAddress")
    private final k billingAddress;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("arn")
    private final String acquiringReferenceNumber;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("order")
    private final C1135b order;

    /* JADX INFO: renamed from: lt6.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Llt6/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1135b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1135b) && Intrinsics.f(this.id, ((C1135b) obj2).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAcquiringReferenceNumber() {
        return this.acquiringReferenceNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getBillingAddress() {
        return this.billingAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final kt6.a getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.state, bVar.state) && this.createdDate == bVar.createdDate && Intrinsics.f(this.updatedDate, bVar.updatedDate) && Intrinsics.f(this.settleOn, bVar.settleOn) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.tipAmount, bVar.tipAmount) && Intrinsics.f(this.surchargeAmount, bVar.surchargeAmount) && Intrinsics.f(this.netAmount, bVar.netAmount) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.paymentMethod, bVar.paymentMethod) && Intrinsics.f(this.card, bVar.card) && Intrinsics.f(this.sepaDd, bVar.sepaDd) && Intrinsics.f(this.fees, bVar.fees) && Intrinsics.f(this.rollingReserves, bVar.rollingReserves) && Intrinsics.f(this.customer, bVar.customer) && Intrinsics.f(this.billingAddress, bVar.billingAddress) && Intrinsics.f(this.acquiringReferenceNumber, bVar.acquiringReferenceNumber) && Intrinsics.f(this.order, bVar.order);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getCustomer() {
        return this.customer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.createdDate);
        Long l2 = this.updatedDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.settleOn;
        int iJ = v7.j(this.amount, (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31);
        jo3.a aVar = this.tipAmount;
        int iHashCode2 = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.surchargeAmount;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.netAmount;
        int iC2 = p.a.c(p.a.c((iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31, this.type), 31, this.paymentMethod);
        kt6.a aVar4 = this.card;
        int iHashCode4 = (iC2 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        e eVar = this.sepaDd;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<c> list = this.fees;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<d> list2 = this.rollingReserves;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        a aVar5 = this.customer;
        int iHashCode8 = (iHashCode7 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        k kVar = this.billingAddress;
        int iHashCode9 = (iHashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.acquiringReferenceNumber;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        C1135b c1135b = this.order;
        return iHashCode10 + (c1135b != null ? c1135b.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getNetAmount() {
        return this.netAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C1135b getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getRollingReserves() {
        return this.rollingReserves;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final e getSepaDd() {
        return this.sepaDd;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Long getSettleOn() {
        return this.settleOn;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.a getSurchargeAmount() {
        return this.surchargeAmount;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final jo3.a getTipAmount() {
        return this.tipAmount;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getUpdatedDate() {
        return this.updatedDate;
    }
}
