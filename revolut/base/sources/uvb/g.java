package uvb;

import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherProductTermsAndConditions f283350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283351b;

    public g(VoucherProductTermsAndConditions voucherProductTermsAndConditions, String str) {
        Intrinsics.checkNotNullParameter(voucherProductTermsAndConditions, "voucherProductTermsAndConditions");
        this.f283350a = voucherProductTermsAndConditions;
        this.f283351b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f283350a, gVar.f283350a) && Intrinsics.f(this.f283351b, gVar.f283351b);
    }

    public final int hashCode() {
        int iHashCode = this.f283350a.hashCode() * 31;
        String str = this.f283351b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
