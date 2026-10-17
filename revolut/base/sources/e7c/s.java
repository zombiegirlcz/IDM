package e7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u001e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010 \u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010#\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R\u001a\u0010$\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010'\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010\u0010R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010,\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b!\u0010+R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\r\u0010\u0019R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\t\u0010\u0019R\"\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b%\u0010\u0019¨\u00062"}, d2 = {"Le7c/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "orderToken", "b", "m", "state", "", "c", "J", "d", "()J", "createdDate", "g", "expirationDate", "", "Le7c/o;", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "lineItems", "f", "amount", "n", "subTotalAmount", "o", "taxTotalAmount", "i", "p", "tipAmount", "discountTotalAmount", "k", "l", "serviceChargeTotalAmount", "currency", "Le7c/p;", "Le7c/p;", "()Le7c/p;", "merchant", "Le7c/a0;", "availablePaymentMethods", "availableCardBrands", "Le7c/t;", "payments", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderToken")
    @NotNull
    private final String orderToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final long expirationDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lineItems")
    @NotNull
    private final List<o> lineItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("subTotalAmount")
    private final long subTotalAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxTotalAmount")
    private final long taxTotalAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("tipAmount")
    private final long tipAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("discountTotalAmount")
    private final long discountTotalAmount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("serviceChargeTotalAmount")
    private final long serviceChargeTotalAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant")
    @NotNull
    private final p merchant;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("availablePaymentMethods")
    @NotNull
    private final List<a0> availablePaymentMethods;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("availableCardBrands")
    @NotNull
    private final List<String> availableCardBrands;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("payments")
    private final List<t> payments;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAvailableCardBrands() {
        return this.availableCardBrands;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getAvailablePaymentMethods() {
        return this.availablePaymentMethods;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.orderToken, sVar.orderToken) && Intrinsics.f(this.state, sVar.state) && this.createdDate == sVar.createdDate && this.expirationDate == sVar.expirationDate && Intrinsics.f(this.lineItems, sVar.lineItems) && this.amount == sVar.amount && this.subTotalAmount == sVar.subTotalAmount && this.taxTotalAmount == sVar.taxTotalAmount && this.tipAmount == sVar.tipAmount && this.discountTotalAmount == sVar.discountTotalAmount && this.serviceChargeTotalAmount == sVar.serviceChargeTotalAmount && Intrinsics.f(this.currency, sVar.currency) && Intrinsics.f(this.merchant, sVar.merchant) && Intrinsics.f(this.availablePaymentMethods, sVar.availablePaymentMethods) && Intrinsics.f(this.availableCardBrands, sVar.availableCardBrands) && Intrinsics.f(this.payments, sVar.payments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getDiscountTotalAmount() {
        return this.discountTotalAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getLineItems() {
        return this.lineItems;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d((this.merchant.hashCode() + p.a.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(p.a.d(a0.d.c(a0.d.c(p.a.c(this.orderToken.hashCode() * 31, 31, this.state), 31, this.createdDate), 31, this.expirationDate), 31, this.lineItems), 31, this.amount), 31, this.subTotalAmount), 31, this.taxTotalAmount), 31, this.tipAmount), 31, this.discountTotalAmount), 31, this.serviceChargeTotalAmount), 31, this.currency)) * 31, 31, this.availablePaymentMethods), 31, this.availableCardBrands);
        List<t> list = this.payments;
        return iD + (list == null ? 0 : list.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final p getMerchant() {
        return this.merchant;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getOrderToken() {
        return this.orderToken;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getServiceChargeTotalAmount() {
        return this.serviceChargeTotalAmount;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getSubTotalAmount() {
        return this.subTotalAmount;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getTaxTotalAmount() {
        return this.taxTotalAmount;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getTipAmount() {
        return this.tipAmount;
    }
}
