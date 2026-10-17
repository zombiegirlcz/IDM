package t3e;

import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import kotlin.jvm.internal.Intrinsics;
import tvb.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f267733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tvb.c f267734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VoucherProductTermsAndConditions f267735c;
    public final String d;

    public a(e source, tvb.c termsRegion, VoucherProductTermsAndConditions voucherProductTermsAndConditions, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(termsRegion, "termsRegion");
        Intrinsics.checkNotNullParameter(voucherProductTermsAndConditions, "voucherProductTermsAndConditions");
        this.f267733a = source;
        this.f267734b = termsRegion;
        this.f267735c = voucherProductTermsAndConditions;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f267733a == aVar.f267733a && this.f267734b == aVar.f267734b && Intrinsics.f(this.f267735c, aVar.f267735c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f267735c.hashCode() + ((this.f267734b.hashCode() + (this.f267733a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
