package kwb;

import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import kotlin.jvm.internal.Intrinsics;
import m1c.x;
import tvb.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherProductGroupDetails f190326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f190327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserVoucherDetails f190328c;
    public final c d;

    public b(VoucherProductGroupDetails voucherProductGroupDetails, x xVar, UserVoucherDetails userVoucherDetails, c termsRegion) {
        Intrinsics.checkNotNullParameter(termsRegion, "termsRegion");
        this.f190326a = voucherProductGroupDetails;
        this.f190327b = xVar;
        this.f190328c = userVoucherDetails;
        this.d = termsRegion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f190326a, bVar.f190326a) && Intrinsics.f(this.f190327b, bVar.f190327b) && Intrinsics.f(this.f190328c, bVar.f190328c) && this.d == bVar.d;
    }

    public final int hashCode() {
        VoucherProductGroupDetails voucherProductGroupDetails = this.f190326a;
        int iHashCode = (voucherProductGroupDetails == null ? 0 : voucherProductGroupDetails.hashCode()) * 31;
        x xVar = this.f190327b;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        UserVoucherDetails userVoucherDetails = this.f190328c;
        return this.d.hashCode() + ((iHashCode2 + (userVoucherDetails != null ? userVoucherDetails.hashCode() : 0)) * 31);
    }
}
