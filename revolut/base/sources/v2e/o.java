package v2e;

import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherProduct f285723a;

    public o(VoucherProduct voucherProduct) {
        this.f285723a = voucherProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f285723a, ((o) obj2).f285723a);
    }

    public final int hashCode() {
        VoucherProduct voucherProduct = this.f285723a;
        if (voucherProduct == null) {
            return 0;
        }
        return voucherProduct.hashCode();
    }
}
