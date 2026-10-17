package ifc;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0004R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010\u0004¨\u0006*"}, d2 = {"Lifc/b$a;", "Lifc/b;", "", "toString", "()Ljava/lang/String;", "Lifc/a;", "a", "Lifc/a;", "getAddress", "()Lifc/a;", "address", "", "b", "I", "getNumberOfTerminals", "()I", "numberOfTerminals", "Ljo3/a;", "c", "Ljo3/a;", "getTotalAmount", "()Ljo3/a;", "totalAmount", "Lifc/e;", "d", "Lifc/e;", "getPaymentSource", "()Lifc/e;", "paymentSource", "", "e", "Z", "getVatRegistered", "()Z", "vatRegistered", "f", "Ljava/lang/String;", "getVatNumber", "vatNumber", "g", "getIdempotencyKey", "idempotencyKey", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("deliveryAddress")
        @NotNull
        private final ifc.a address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("numberOfTerminals")
        private final int numberOfTerminals;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalPriceShown")
        @NotNull
        private final jo3.a totalAmount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("paymentMethod")
        @NotNull
        private final e paymentSource;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("vatRegistered")
        private final boolean vatRegistered;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("vatNumber")
        private final String vatNumber;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("idempotencyKey")
        @NotNull
        private final String idempotencyKey;

        public a(ifc.a address, int i, jo3.a totalAmount, e paymentSource, boolean z, String str, String idempotencyKey) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
            Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
            Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
            this.address = address;
            this.numberOfTerminals = i;
            this.totalAmount = totalAmount;
            this.paymentSource = paymentSource;
            this.vatRegistered = z;
            this.vatNumber = str;
            this.idempotencyKey = idempotencyKey;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.address, aVar.address) && this.numberOfTerminals == aVar.numberOfTerminals && Intrinsics.f(this.totalAmount, aVar.totalAmount) && this.paymentSource == aVar.paymentSource && this.vatRegistered == aVar.vatRegistered && Intrinsics.f(this.vatNumber, aVar.vatNumber) && Intrinsics.f(this.idempotencyKey, aVar.idempotencyKey);
        }

        public final int hashCode() {
            int iC = j6.a.c((this.paymentSource.hashCode() + v7.j(this.totalAmount, j6.a.b(this.numberOfTerminals, this.address.hashCode() * 31, 31), 31)) * 31, 31, this.vatRegistered);
            String str = this.vatNumber;
            return this.idempotencyKey.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }
    }

    /* JADX INFO: renamed from: ifc.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lifc/b$b;", "Lifc/b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "orderId", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0918b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("orderId")
        @NotNull
        private final String orderId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0918b) && Intrinsics.f(this.orderId, ((C0918b) obj2).orderId);
        }

        public final int hashCode() {
            return this.orderId.hashCode();
        }
    }

    private b() {
    }
}
