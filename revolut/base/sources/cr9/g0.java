package cr9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcr9/g0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductName", "productName", "b", "getOriginCountry", "originCountry", "c", "getShippingFrom", "shippingFrom", "d", "getDestinationCountry", "destinationCountry", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("productName")
    @NotNull
    private final String productName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("originCountry")
    @NotNull
    private final String originCountry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("shippingFrom")
    @NotNull
    private final String shippingFrom;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("destinationCountry")
    @NotNull
    private final String destinationCountry;

    public g0(String productName, String originCountry, String shippingFrom, String destinationCountry) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(originCountry, "originCountry");
        Intrinsics.checkNotNullParameter(shippingFrom, "shippingFrom");
        Intrinsics.checkNotNullParameter(destinationCountry, "destinationCountry");
        this.productName = productName;
        this.originCountry = originCountry;
        this.shippingFrom = shippingFrom;
        this.destinationCountry = destinationCountry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.productName, g0Var.productName) && Intrinsics.f(this.originCountry, g0Var.originCountry) && Intrinsics.f(this.shippingFrom, g0Var.shippingFrom) && Intrinsics.f(this.destinationCountry, g0Var.destinationCountry);
    }

    public final int hashCode() {
        return this.destinationCountry.hashCode() + p.a.c(p.a.c(this.productName.hashCode() * 31, 31, this.originCountry), 31, this.shippingFrom);
    }
}
