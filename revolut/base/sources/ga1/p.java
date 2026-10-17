package ga1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lga1/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "paymentId", "b", "getOrderId", "orderId", "Lga1/r;", "c", "Lga1/r;", "()Lga1/r;", "paymentMethod", "d", "receiptUrl", "e", "state", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String paymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("order_id")
    @NotNull
    private final String orderId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("payment_method")
    @NotNull
    private final r paymentMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("receipt_url")
    private final String receiptUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.paymentId, pVar.paymentId) && Intrinsics.f(this.orderId, pVar.orderId) && Intrinsics.f(this.paymentMethod, pVar.paymentMethod) && Intrinsics.f(this.receiptUrl, pVar.receiptUrl) && Intrinsics.f(this.state, pVar.state);
    }

    public final int hashCode() {
        int iHashCode = (this.paymentMethod.hashCode() + p.a.c(this.paymentId.hashCode() * 31, 31, this.orderId)) * 31;
        String str = this.receiptUrl;
        return this.state.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
