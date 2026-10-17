package zwb;

import cli.j;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherProductTermsAndConditions f325947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325948b;

    public c(VoucherProductTermsAndConditions voucherProductTermsAndConditions, String str) {
        Intrinsics.checkNotNullParameter(voucherProductTermsAndConditions, "voucherProductTermsAndConditions");
        this.f325947a = voucherProductTermsAndConditions;
        this.f325948b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f325947a, cVar.f325947a) && Intrinsics.f(this.f325948b, cVar.f325948b);
    }

    public final int hashCode() {
        int iHashCode = this.f325947a.hashCode() * 31;
        String str = this.f325948b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
