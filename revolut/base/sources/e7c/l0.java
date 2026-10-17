package e7c;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\r\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0019"}, d2 = {"Le7c/l0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "e", "()Z", "valid", "", "Le7c/l0$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "deliveryMethods", "", "c", "J", "d", "()J", "orderTotalAmount", "orderSubtotalAmount", "orderTaxTotalAmount", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("valid")
    private final boolean valid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryMethods")
    @NotNull
    private final List<a> deliveryMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderTotalAmount")
    private final long orderTotalAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("orderSubtotalAmount")
    private final long orderSubtotalAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("orderTaxTotalAmount")
    private final long orderTaxTotalAmount;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0012"}, d2 = {"Le7c/l0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "label", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "description", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

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
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.description, aVar.description);
        }

        public final int hashCode() {
            int iJ = v7.j(this.amount, p.a.c(this.id.hashCode() * 31, 31, this.label), 31);
            String str = this.description;
            return iJ + (str == null ? 0 : str.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDeliveryMethods() {
        return this.deliveryMethods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getOrderSubtotalAmount() {
        return this.orderSubtotalAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getOrderTaxTotalAmount() {
        return this.orderTaxTotalAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getOrderTotalAmount() {
        return this.orderTotalAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.valid == l0Var.valid && Intrinsics.f(this.deliveryMethods, l0Var.deliveryMethods) && this.orderTotalAmount == l0Var.orderTotalAmount && this.orderSubtotalAmount == l0Var.orderSubtotalAmount && this.orderTaxTotalAmount == l0Var.orderTaxTotalAmount;
    }

    public final int hashCode() {
        return Long.hashCode(this.orderTaxTotalAmount) + a0.d.c(a0.d.c(p.a.d(Boolean.hashCode(this.valid) * 31, 31, this.deliveryMethods), 31, this.orderTotalAmount), 31, this.orderSubtotalAmount);
    }
}
