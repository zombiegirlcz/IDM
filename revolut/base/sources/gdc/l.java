package gdc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends com.revolut.feature.revolutpay.shared.ui.add_payment_method.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143139b;

    public l(String postcode, String countryCode) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f143138a = postcode;
        this.f143139b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f143138a, lVar.f143138a) && Intrinsics.f(this.f143139b, lVar.f143139b);
    }

    public final int hashCode() {
        return this.f143139b.hashCode() + (this.f143138a.hashCode() * 31);
    }
}
