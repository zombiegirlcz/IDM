package ifc;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lifc/f$a;", "Lifc/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCurrency", "currency", "", "b", "I", "getNumberOfTerminals", "()I", "numberOfTerminals", "", "c", "Z", "getVatRegistered", "()Z", "vatRegistered", "d", "getVatNumber", "vatNumber", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("terminalCount")
        private final int numberOfTerminals;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("vatRegistered")
        private final boolean vatRegistered;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("vatNumber")
        private final String vatNumber;

        public a(int i, String currency, boolean z, String str) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.currency = currency;
            this.numberOfTerminals = i;
            this.vatRegistered = z;
            this.vatNumber = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.currency, aVar.currency) && this.numberOfTerminals == aVar.numberOfTerminals && this.vatRegistered == aVar.vatRegistered && Intrinsics.f(this.vatNumber, aVar.vatNumber);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.b(this.numberOfTerminals, this.currency.hashCode() * 31, 31), 31, this.vatRegistered);
            String str = this.vatNumber;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u0013\u0010\t¨\u0006\u001b"}, d2 = {"Lifc/f$b;", "Lifc/f;", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "terminalPrice", "", "b", "I", "getNumberOfTerminals", "()I", "numberOfTerminals", "getTotalTerminalPrice", "totalTerminalPrice", "d", "deliveryFee", "e", "subTotal", "f", "vat", "g", "totalPrice", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("terminalPrice")
        @NotNull
        private final jo3.a terminalPrice;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("terminalCount")
        private final int numberOfTerminals;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalTerminalPrice")
        @NotNull
        private final jo3.a totalTerminalPrice;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("deliveryFee")
        @NotNull
        private final jo3.a deliveryFee;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("subtotal")
        @NotNull
        private final jo3.a subTotal;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("vat")
        @NotNull
        private final jo3.a vat;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalPrice")
        @NotNull
        private final jo3.a totalPrice;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getDeliveryFee() {
            return this.deliveryFee;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getSubTotal() {
            return this.subTotal;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getTerminalPrice() {
            return this.terminalPrice;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getTotalPrice() {
            return this.totalPrice;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getVat() {
            return this.vat;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.terminalPrice, bVar.terminalPrice) && this.numberOfTerminals == bVar.numberOfTerminals && Intrinsics.f(this.totalTerminalPrice, bVar.totalTerminalPrice) && Intrinsics.f(this.deliveryFee, bVar.deliveryFee) && Intrinsics.f(this.subTotal, bVar.subTotal) && Intrinsics.f(this.vat, bVar.vat) && Intrinsics.f(this.totalPrice, bVar.totalPrice);
        }

        public final int hashCode() {
            return this.totalPrice.hashCode() + v7.j(this.vat, v7.j(this.subTotal, v7.j(this.deliveryFee, v7.j(this.totalTerminalPrice, j6.a.b(this.numberOfTerminals, this.terminalPrice.hashCode() * 31, 31), 31), 31), 31), 31);
        }
    }

    private f() {
    }
}
