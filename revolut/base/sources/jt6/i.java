package jt6;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0004\u0010\u000b\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u000b\u0010\u0019¨\u0006\u001c"}, d2 = {"Ljt6/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "description", "Ljo3/a;", "c", "Ljo3/a;", "f", "()Ljo3/a;", "unitPrice", "d", "e", "totalAmount", "Ljt6/i$d;", "Ljt6/i$d;", "()Ljt6/i$d;", "quantity", "Ljt6/i$c;", "Ljt6/i$c;", "()Ljt6/i$c;", "product", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("unitPrice")
    @NotNull
    private final jo3.a unitPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalAmount")
    @NotNull
    private final jo3.a totalAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("quantity")
    @NotNull
    private final d quantity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("productDto")
    private final c product;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ljt6/i$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "uri", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("uri")
        @NotNull
        private final String uri;

        public b(String uri2) {
            Intrinsics.checkNotNullParameter(uri2, "uri");
            this.uri = uri2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.uri, ((b) obj2).uri);
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ljt6/i$c;", "", "", "toString", "()Ljava/lang/String;", "Ljt6/i$b;", "a", "Ljt6/i$b;", "()Ljt6/i$b;", "image", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("image")
        private final b image;

        public c(b bVar) {
            this.image = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getImage() {
            return this.image;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.image, ((c) obj2).image);
        }

        public final int hashCode() {
            b bVar = this.image;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ljt6/i$d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "()D", "value", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final double value;

        public d(double d) {
            this.value = d;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Double.compare(this.value, ((d) obj2).value) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.value);
        }
    }

    public i(String name, String str, jo3.a unitPrice, jo3.a totalAmount, d quantity, c cVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.name = name;
        this.description = str;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.quantity = quantity;
        this.product = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getTotalAmount() {
        return this.totalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.name, iVar.name) && Intrinsics.f(this.description, iVar.description) && Intrinsics.f(this.unitPrice, iVar.unitPrice) && Intrinsics.f(this.totalAmount, iVar.totalAmount) && Intrinsics.f(this.quantity, iVar.quantity) && Intrinsics.f(this.product, iVar.product);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getUnitPrice() {
        return this.unitPrice;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (this.quantity.hashCode() + v7.j(this.totalAmount, v7.j(this.unitPrice, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31;
        c cVar = this.product;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
